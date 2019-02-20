package org.lle.biblio.service;

import org.lle.biblio.model.bean.utilisateur.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by TheAdmin on 24.01.2019.
 */
@WebService(serviceName = "DoLogin")
public class LoginService {

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
    public String DoLogin(String login, String password){

        ApplicationContext vApplicationContext
                = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

        LoginServiceImpl vLoginService = vApplicationContext.getBean("LoginServiceImpl", LoginServiceImpl.class);

        String vChaine = "login:"+login+" password:"+password+" ne sont pas correctes!";

       Utilisateur vUtilisateur = vLoginService.doLogin(login, password);


        if ((login.equals(vUtilisateur.getLogin())) && (password.equals(vUtilisateur.getPassword()))){

            vChaine = "login:"+vUtilisateur.getLogin()+" password:"+vUtilisateur.getPassword()+" sont correctes!";

        }





        return vChaine;


    }





}
