package org.lle.biblio.service.consumer.contract.dao;

import org.lle.biblio.service.model.bean.utilisateur.Utilisateur;
import org.lle.biblio.service.model.exception.NotFoundException;


/**
 * Interface de DAO pour le package « utilisateur »
 */
public interface UtilisateurDao {

    /**
     * Renvoie l'{@link Utilisateur} demandé
     *
     * @param pId L'identifiant de l'{@link Utilisateur}
     * @return l'{@link Utilisateur} demandé
     * @throws NotFoundException Si l'{@link Utilisateur} n'a pas été trouvé
     */
    Utilisateur getUtilisateur(String login, String password ) throws NotFoundException;

    Utilisateur getUtilisateur(Integer pId ) throws NotFoundException;
}
