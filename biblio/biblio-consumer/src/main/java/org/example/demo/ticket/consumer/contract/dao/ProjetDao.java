package org.example.demo.ticket.consumer.contract.dao;

import java.util.List;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.exception.TechnicalException;


/**
 * Interface de DAO pour le package « projet »
 */
public interface ProjetDao {

    /**
     * Renvoie le {@link Projet} demandé
     *
     * @param pId L'identifiant du {@link Projet}
     * @return le {@link Projet} demandé
     * @throws NotFoundException Si le {@link Projet} n'a pas été trouvé
     */
    Projet getProjet(Integer pId) throws NotFoundException;

    /**
     * Renvoie la liste des {@link Projet}
     *
     * @return List
     */
    List<Projet> getListProjet();


    /**
     * Ajoute une nouvelle {@link Version} de {@link Projet}
     * @param pVersion -
     * @throws TechnicalException Si la version existe déjà
     */
    void insertVersion(Version pVersion) throws TechnicalException;
}
