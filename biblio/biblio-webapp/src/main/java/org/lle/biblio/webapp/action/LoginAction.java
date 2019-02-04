package org.lle.biblio.webapp.action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.lle.biblio.business.contract.ManagerFactory;
import org.lle.biblio.webapp.generated.*;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;



public class LoginAction extends ActionSupport implements ServletRequestAware, SessionAware {

    // ----- Eléments Struts
    @Inject
    private ManagerFactory managerFactory;

    private Map<String, Object> session;
    private Utilisateur utilisateur;
    private String pseudo;
    private Location location;
    private Livre livre;
    private Auteur auteur;

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }

    private HttpServletRequest servletRequest;

    @Override
    public void setServletRequest(HttpServletRequest pRequest) {
        this.servletRequest = pRequest;
    }

    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private String login;
    private String password;

    // ==================== Getters/Setters ====================
    public String getLogin() {
        return login;
    }
    public void setLogin(String pLogin)  {
        login = pLogin;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
// ==================== Méthodes ====================
        /**
         * Action permettant la connexion d'un utilisateur
         * @return input / success
         */
        public String doLogin() {
            String vResult = ActionSupport.INPUT;

            // appel webservice Login

            if (!StringUtils.isAllEmpty(login, password)) {


                BiblioService_Service pBiblio = new BiblioService_Service();

                BiblioService pBiblioService = pBiblio.getBiblioServicePort();

                utilisateur = pBiblioService.doLogin(login, password);



                if (utilisateur.getLogin().equals(login) &&  utilisateur.getPassword().equals(password)) {
                        // Ajout de l'utilisateur en session
                        this.session.put("utilisateur", utilisateur);


                    location =  pBiblioService.getLocation(utilisateur.getId());

                    livre = pBiblioService.getLivre(location.getId());

                    auteur = pBiblioService.getAuteur(livre.getAuteurId());


                        vResult = ActionSupport.SUCCESS;
                    } else {


                        this.addActionError("Identifiant ou mot de passe invalide !");
                        vResult = ActionSupport.ERROR;
                    }
                }
            return vResult;

        }




        /**
         * Action de déconnexion d'un utilisateur
         * @return success
         */
        public String doLogout() {

            // Invalidation de la session
            this.servletRequest.getSession().invalidate();
            return ActionSupport.SUCCESS;
        }



    }
