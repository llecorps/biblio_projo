package org.lle.biblio.consumer.impl.rowmapper.utilisateur;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Named;

import org.springframework.jdbc.core.RowMapper;

import org.lle.biblio.model.bean.utilisateur.Utilisateur;


@Named
public class UtilisateurRM implements RowMapper<Utilisateur> {

    @Override
    public Utilisateur mapRow(ResultSet pRS, int pRowNum) throws SQLException {
        Utilisateur vUtilisateur = new Utilisateur();
        vUtilisateur.setId(pRS.getInt("id"));
        vUtilisateur.setNom(pRS.getString("nom"));
        vUtilisateur.setPrenom(pRS.getString("prenom"));
        return  vUtilisateur;
    }
}
