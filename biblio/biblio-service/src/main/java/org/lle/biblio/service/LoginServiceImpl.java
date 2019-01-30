package org.lle.biblio.service;

import org.lle.biblio.model.bean.utilisateur.Utilisateur;

import javax.inject.Named;

@Named
public class LoginServiceImpl extends AbstractService {




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


  public Utilisateur doLogin(String login, String password){

        Utilisateur vUtilisateur = getManagerFactory().getUtilisateurManager().getUtilisateur(login,password);

        return vUtilisateur;

    }


}