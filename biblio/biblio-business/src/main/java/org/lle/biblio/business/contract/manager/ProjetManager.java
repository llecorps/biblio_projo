package org.lle.biblio.business.contract.manager;

import java.util.List;

import org.lle.biblio.model.bean.projet.Projet;
import org.lle.biblio.model.bean.projet.Version;
import org.lle.biblio.model.exception.FunctionalException;
import org.lle.biblio.model.exception.NotFoundException;


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
