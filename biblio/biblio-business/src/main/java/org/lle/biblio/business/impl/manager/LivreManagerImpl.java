package org.lle.biblio.business.impl.manager;

import org.lle.biblio.business.contract.manager.LivreManager;
import org.lle.biblio.model.bean.livre.Livre;
import org.lle.biblio.model.exception.NotFoundException;

import javax.inject.Named;

/**
 * Created by TheAdmin on 30.01.2019.
 */
@Named
public class LivreManagerImpl extends AbstractManager implements LivreManager {

    private Livre vLivre;

    @Override
    public Livre getLivre(int id) {

        try {
            vLivre = getDaoFactory().getLivreDao().getLivre(id);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return vLivre;
    }

}
