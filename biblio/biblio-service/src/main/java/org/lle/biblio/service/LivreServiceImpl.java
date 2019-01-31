package org.lle.biblio.service;

import org.lle.biblio.model.bean.livre.Livre;

/**
 * Created by TheAdmin on 30.01.2019.
 */
public class LivreServiceImpl extends AbstractService {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livre getLivre(int id){

        Livre vLivre = getManagerFactory().getLivreManager().getLivre(id);

        return vLivre;

    }
}
