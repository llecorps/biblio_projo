package org.lle.biblio.service;

import org.lle.biblio.model.bean.utilisateur.Utilisateur;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "DoLogin")
public class LoginService extends AbstractService {





    private static String utilisateur = "mike";
    private static String motdepasse = "root";

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
    public String doLogin(String login, String password){

        String vChaine = "login:"+login+" password:"+password+" ne sont pas correctes!";

        Utilisateur vUtilisateur = getManagerFactory().getUtilisateurManager().getUtilisateur(login,password);


        if ((login.equals(vUtilisateur.getLogin())) && (password.equals(vUtilisateur.getPassword()))){

            vChaine = "login:"+login+" password:"+password+" sont correctes!";

        }




        return vChaine;

    }
}