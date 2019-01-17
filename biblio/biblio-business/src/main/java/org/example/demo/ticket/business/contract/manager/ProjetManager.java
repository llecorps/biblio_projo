package org.example.demo.ticket.business.contract.manager;

import java.util.List;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.FunctionalException;
import org.example.demo.ticket.model.exception.NotFoundException;


/**
 * Manager du package « projet »
 */
public interface ProjetManager {

    /**
     * Renvoie la liste des {@link Projet}
     *
     * @return List
     */
    List<Projet> getListProjet();

    /**
     * Renvoie le projet demandé
     *
     * @param pId l'identifiant du projet
     * @return Le {@link Projet}
     * @throws NotFoundException Si le projet n'est pas trouvé
     */
    Projet getProjet(Integer pId) throws NotFoundException;


    /**
     * Ajoute une nouvelle {@link Version} de {@link Projet}
     * @param pVersion -
     * @throws FunctionalException Version invalide
     */
    void insertVersion(Version pVersion) throws FunctionalException;
}
