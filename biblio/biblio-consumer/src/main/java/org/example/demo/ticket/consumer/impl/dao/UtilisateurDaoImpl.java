package org.example.demo.ticket.consumer.impl.dao;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import org.example.demo.ticket.consumer.contract.dao.UtilisateurDao;
import org.example.demo.ticket.consumer.impl.rowmapper.utilisateur.UtilisateurRM;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;


@Named
public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {

    @Inject
    private UtilisateurRM utilisateurRM;


    @Override
    public Utilisateur getUtilisateur(Integer pId) throws NotFoundException {
        String vSQL = "SELECT * FROM utilisateur WHERE id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", pId);
        try {
            Utilisateur vUtilisateur = vJdbcTemplate.queryForObject(vSQL, vParams, utilisateurRM);
            return vUtilisateur;
        } catch (IncorrectResultSizeDataAccessException vEx) {
            throw new NotFoundException("Utilisateur non trouvé. id=" + pId);
        }
    }
}
