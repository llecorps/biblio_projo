package org.example.demo.ticket.consumer.impl.dao;

import java.sql.Types;
import java.util.List;
import javax.inject.Named;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.consumer.impl.rowmapper.ticket.TicketStatutRM;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;


@Named
public class TicketDaoImpl extends AbstractDaoImpl implements TicketDao {

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(TicketDaoImpl.class);

    @Override
    public int getCountTicket(RechercheTicket pRechercheTicket) {
        String vSql
            = "SELECT COUNT(*) FROM ticket"
            + " WHERE auteur_id = :auteur_id"
            + "   AND projet_id = :projet_id";

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("auteur_id", pRechercheTicket.getAuteurId());
        vParams.addValue("projet_id", pRechercheTicket.getProjetId());

        int vNbrTicket = vJdbcTemplate.queryForObject(vSql, vParams, Integer.class);

        return vNbrTicket;
    }



    @Override
    public List<TicketStatut> getListStatut() {
        String vSQL = "SELECT * FROM statut";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<TicketStatut> vRowMapper = new TicketStatutRM();

        List<TicketStatut> vList = vJdbcTemplate.query(vSQL, vRowMapper);
        return vList;
    }



    @Override
    public void updateTicketStatut(TicketStatut pTicketStatut) {
        String vSQL = "UPDATE statut SET libelle = :libelle WHERE id = :id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", pTicketStatut.getId(), Types.INTEGER);
        vParams.addValue("libelle", pTicketStatut.getLibelle(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        vJdbcTemplate.update(vSQL, vParams);
    }



    @Override
    public void insertTicketStatut(TicketStatut pTicketStatut) {
        String vSQL = "INSERT INTO statut (id, libelle) VALUES (:id, :libelle)";

        BeanPropertySqlParameterSource vParams = new BeanPropertySqlParameterSource(pTicketStatut);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        try {
            vJdbcTemplate.update(vSQL, vParams);
        } catch (DuplicateKeyException vEx) {
            LOGGER.error("Le TicketStatut existe déjà ! id=" + pTicketStatut.getId(), vEx);
            // ...
        }
    }



    @Override
    public void updateTicket(Ticket pTicket) {
        String vSQL = "UPDATE ticket SET statut_actuel_id = :statut_id WHERE numero = :numero";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("statut_id", pTicket.getStatut().getId());
        vParams.addValue("id", pTicket.getNumero());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        vJdbcTemplate.update(vSQL, vParams);
    }
}
