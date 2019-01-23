package org.lle.biblio.service.consumer.contract.dao;

import java.util.List;

import org.lle.biblio.service.model.bean.projet.Projet;
import org.lle.biblio.service.model.bean.projet.Version;
import org.lle.biblio.service.model.exception.NotFoundException;
import org.lle.biblio.service.model.exception.TechnicalException;


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
