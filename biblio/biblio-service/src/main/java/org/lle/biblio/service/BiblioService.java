package org.lle.biblio.service;

import org.lle.biblio.model.bean.auteur.Auteur;
import org.lle.biblio.model.bean.livre.Livre;
import org.lle.biblio.model.bean.location.Location;
import org.lle.biblio.model.bean.utilisateur.Utilisateur;
import org.lle.biblio.model.exception.NotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TheAdmin on 24.01.2019.
 */
@WebService(serviceName = "BiblioService")
public class BiblioService {



    @WebMethod
    public Utilisateur DoLogin(String login, String password){

        ApplicationContext vApplicationContext
                = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

        LoginServiceImpl vLoginService = vApplicationContext.getBean("LoginServiceImpl", LoginServiceImpl.class);

       Utilisateur vUtilisateur = vLoginService.doLogin(login, password);

        return vUtilisateur;
    }

    @WebMethod
    public Location getLocation(int id){

        ApplicationContext vApplicationContext
                = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

        LocationServiceImpl vLocationService = vApplicationContext.getBean("LocationServiceImpl", LocationServiceImpl.class);

        Location vLocation = vLocationService.getLocation(id);

        return vLocation;

    }

    @WebMethod
    public Livre getLivre(int id){

    ApplicationContext vApplicationContext
            = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

    LivreServiceImpl vLivreService = vApplicationContext.getBean("LivreServiceImpl", LivreServiceImpl.class);

    Livre vLivre = vLivreService.getLivre(id);

    return vLivre;

    }

    @WebMethod
    public Auteur getAuteur(int id){

        ApplicationContext vApplicationContext
                = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

        AuteurServiceImpl vAuteurService = vApplicationContext.getBean("AuteurServiceImpl", AuteurServiceImpl.class);

        Auteur vAuteur = vAuteurService.getAuteur(id);

        return vAuteur;

    }
    @WebMethod
    public List<Livre> DoListLivre() throws NotFoundException {

        ApplicationContext vApplicationContext
                = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

        LivreServiceImpl vLivreService = vApplicationContext.getBean("LivreServiceImpl", LivreServiceImpl.class);

        List<Livre> vListLivre =  new ArrayList<>();
        vListLivre = vLivreService.getListLivre();

        return vListLivre;

    }
    @WebMethod
    public List<Livre> DoResultLivre(String chaine) throws NotFoundException {

        ApplicationContext vApplicationContext
                = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

        LivreServiceImpl vLivreService = vApplicationContext.getBean("LivreServiceImpl", LivreServiceImpl.class);

        List<Livre> vListLivre =  new ArrayList<>();
        vListLivre = vLivreService.getResultLivre(chaine);

        return vListLivre;

    }
}
