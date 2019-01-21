package org.lle.biblio.webapp.action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.lle.biblio.business.contract.ManagerFactory;
import org.lle.biblio.model.bean.utilisateur.Utilisateur;

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

    // ==================== Getters/Setters ====================
    public String getLogin() {
        return login;
    }
    public void setLogin(String pLogin)  {
        login = pLogin;}

        // ==================== Méthodes ====================
        /**
         * Action permettant la connexion d'un utilisateur
         * @return input / success
         */
        public String doLogin() {
            String vResult = ActionSupport.INPUT;
            /*
            if (!StringUtils.isAllEmpty(login)) {


                try {


                    Utilisateur vUtilisateur = new Utilisateur(login);
                    managerFactory.getUtilisateurManager().addUtilisateur(vUtilisateur);

                        // Ajout de l'utilisateur en session
                        this.session.put("utilisateur", vUtilisateur);

                        vResult = ActionSupport.SUCCESS;

                } catch (FunctionalException pEx) {
                    vResult = ActionSupport.ERROR;
                }



            }
*/
            return vResult;

        }




        /**
         * Action de déconnexion d'un utilisateur
         * @return success
         */
        public String doLogout() {

            Object vUser = this.session.get("utilisateur");

            if (vUser instanceof Utilisateur) {
               // managerFactory.getUtilisateurManager().deleteUtilisateur((Utilisateur) vUser);
            }

            this.servletRequest.getSession().invalidate();


            return ActionSupport.SUCCESS;
        }



    }
