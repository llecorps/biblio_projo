package org.lle.biblio.service;

import org.lle.biblio.model.bean.location.Location;
import org.lle.biblio.model.bean.utilisateur.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by TheAdmin on 24.01.2019.
 */
@WebService(serviceName = "BiblioService")
public class BiblioService {

    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private String login;
    private String password;

    // ==================== Getters/Setters ====================


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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



}
