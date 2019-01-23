package org.lle.biblio.service.business.impl.manager;

/**
 * Created by TheAdmin on 19.01.2019.
 */

import org.lle.biblio.service.business.contract.manager.UtilisateurManager;
import org.lle.biblio.service.model.bean.utilisateur.Utilisateur;
import org.lle.biblio.service.model.exception.NotFoundException;

import javax.inject.Named;

import java.util.List;

@Named
public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {

    private Utilisateur vUtilisateur;

    @Override
    public List<Utilisateur> getListUtilisateur() {
        return null;
    }

    @Override
    public Utilisateur getUtilisateur(String pLogin, String pPassword)  {
        try {
            vUtilisateur = getDaoFactory().getUtilisateurDao().getUtilisateur(pLogin, pPassword);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return vUtilisateur;
    }
}
