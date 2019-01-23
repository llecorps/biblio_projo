package org.lle.biblio.service.business.contract.manager;

import org.lle.biblio.service.model.bean.utilisateur.Utilisateur;

import java.util.List;

/**
 * Created by TheAdmin on 19.01.2019.
 */
public interface UtilisateurManager {


    List<Utilisateur> getListUtilisateur();

    Utilisateur getUtilisateur(String Login, String Password) ;
}
