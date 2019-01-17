package org.example.demo.ticket.consumer.impl.dao;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.impl.rowmapper.projet.ProjetRM;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.exception.TechnicalException;


@Named
public class ProjetDaoImpl extends AbstractDaoImpl implements ProjetDao {

    @Inject
    private ProjetRM projetRM;


    @Override
    public Projet getProjet(Integer pId) throws NotFoundException {
        String vSQL = "SELECT * FROM projet WHERE id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", pId);
        try {
            Projet vProjet = vJdbcTemplate.queryForObject(vSQL, vParams, projetRM);
            return vProjet;
        } catch (IncorrectResultSizeDataAccessException vEx) {
            throw new NotFoundException("Projet non trouvé. id=" + pId);
        }
    }


    @Override
    public List<Projet> getListProjet() {
        String vSQL = "SELECT * FROM projet";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        List<Projet> vList = vJdbcTemplate.query(vSQL, projetRM);
        return vList;
    }


    @Override
    public void insertVersion(Version pVersion) throws TechnicalException {
        String vSQL = "INSERT INTO version (projet_id, numero) VALUES (:projet_id, :numero)";

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("projet_id", pVersion.getProjet().getId());
        vParams.addValue("numero", pVersion.getNumero());

        try {
            vJdbcTemplate.update(vSQL, vParams);
        } catch (DuplicateKeyException vEx) {
            throw new TechnicalException("La version existe déjà. " + pVersion, vEx);
        }
    }
}
