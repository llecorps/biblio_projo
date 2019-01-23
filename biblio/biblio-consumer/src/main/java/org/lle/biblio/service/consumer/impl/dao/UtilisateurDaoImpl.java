package org.lle.biblio.service.consumer.impl.dao;

import org.lle.biblio.service.consumer.contract.dao.UtilisateurDao;
import org.lle.biblio.service.consumer.impl.rowmapper.utilisateur.UtilisateurRM;
import org.lle.biblio.service.model.bean.utilisateur.Utilisateur;
import org.lle.biblio.service.model.exception.NotFoundException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;


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

    @Override
    public Utilisateur getUtilisateur(String pLogin, String pPassword) throws NotFoundException {

        String simpleQuote="'";

        String username = simpleQuote+pLogin+simpleQuote;
        String pass = simpleQuote+pPassword+simpleQuote;

        System.out.println("login:"+pLogin+"password:"+pPassword);


        //String vSQL = "SELECT * FROM utilisateur WHERE login = :username AND password = :pass ";

        String vSQL
                = "SELECT * FROM utilisateur"
                + " WHERE login = "+username
                + " AND password = "+pass;



        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        //MapSqlParameterSource vParams = new MapSqlParameterSource("login", username);
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("login", pLogin);
        vParams.addValue("password", pPassword);



        try {
            Utilisateur vUtilisateur = vJdbcTemplate.queryForObject(vSQL, vParams, utilisateurRM);
            return vUtilisateur;
        } catch (IncorrectResultSizeDataAccessException vEx) {
            throw new NotFoundException("Utilisateur non trouvé. Login=" + pLogin);
        }
    }
}
