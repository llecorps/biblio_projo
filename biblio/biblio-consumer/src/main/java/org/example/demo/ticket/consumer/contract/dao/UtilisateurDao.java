package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;


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
    Utilisateur getUtilisateur(Integer pId) throws NotFoundException;
}
