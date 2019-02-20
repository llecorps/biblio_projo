package org.lle.biblio.batch.traitement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.biblio.model.bean.livre.Livre;
import org.lle.biblio.model.exception.TechnicalException;

import javax.inject.Named;

/**
 * Created by TheAdmin on 31.01.2019.
 */
@Named
public class TestLivre extends AbstractTraitement {


    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(TestLivre.class);

    private static int id= 1;

    public void run() throws TechnicalException {


        Livre vLivre = getManagerFactory().getLivreManager().getLivre(id);
        System.out.println("Livre est :"+vLivre.toString());



    }


}
