package org.lle.biblio.batch.traitement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.lle.biblio.model.bean.utilisateur.Utilisateur;
import org.lle.biblio.model.exception.TechnicalException;

import javax.inject.Named;

/**
 * Created by TheAdmin on 19.01.2019.
 */
@Named
public class TestLogin extends AbstractTraitement {

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(TestLogin.class);

    private static String utilisateur = "mike";
    private static String motdepasse = "root";

    public void run() throws TechnicalException {

        Utilisateur vUtilisateur = getManagerFactory().getUtilisateurManager().getUtilisateur(utilisateur,motdepasse);
        System.out.println("Utilisateur est :"+vUtilisateur.toString());



    }




}
