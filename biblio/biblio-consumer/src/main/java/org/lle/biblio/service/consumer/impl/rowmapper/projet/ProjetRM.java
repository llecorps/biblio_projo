package org.lle.biblio.service.consumer.impl.rowmapper.projet;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.biblio.service.model.bean.projet.Projet;
import org.lle.biblio.service.model.bean.utilisateur.Utilisateur;
import org.lle.biblio.service.model.exception.NotFoundException;
import org.springframework.jdbc.core.RowMapper;

import org.lle.biblio.service.consumer.contract.dao.UtilisateurDao;


@Named
public class ProjetRM implements RowMapper<Projet> {

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(ProjetRM.class);

    @Inject
    private UtilisateurDao utilisateurDao;


    @Override
    public Projet mapRow(ResultSet pRS, int pRowNum) throws SQLException {
        Projet vProjet = new Projet(pRS.getInt("id"));
        vProjet.setNom(pRS.getString("nom"));
        vProjet.setDateCreation(pRS.getDate("date_creation"));
        vProjet.setCloture(pRS.getBoolean("cloture"));

        Integer vResponsableId = pRS.getInt("responsable_id");
        if (!pRS.wasNull()) {
            try {
                Utilisateur vResponsable = utilisateurDao.getUtilisateur(vResponsableId);
                vProjet.setResponsable(vResponsable);
            } catch (NotFoundException vEx) {
                String vMessage
                    = "Erreur de chargement de projet, le responsable n'est pas un utilisateur connu."
                    + " responsable_id=" + vResponsableId + ". " + vProjet;
                LOGGER.error(vMessage, vEx);
                throw new SQLException(vMessage, vEx);
            }
        }

        return  vProjet;
    }
}
