package org.lle.biblio.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.lle.biblio.webapp.generated.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * Created by TheAdmin on 06.02.2019.
 */
public class LivreAction extends ActionSupport implements SessionAware {

    private Integer id;
    private Livre livre;
    private Auteur auteur;
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Map<String, Object> session;


    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }



    public String doDetail() {

        BiblioService_Service pBiblio = new BiblioService_Service();

        BiblioService pBiblioService = pBiblio.getBiblioServicePort();

        if (id == null) {
            this.addActionError(getText("error.livre.missing.id"));
        } else {

            livre = pBiblioService.getLivre(id);
            auteur = pBiblioService.getAuteur(livre.getAuteurId());

        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    public String doRent() {

       // String vResult = ActionSupport.INPUT;

        BiblioService_Service pBiblio = new BiblioService_Service();

        BiblioService pBiblioService = pBiblio.getBiblioServicePort();

        if (id != null) {


            livre = pBiblioService.getLivre(id);

            //int vNbreEmprunt = pBiblioService
            //test exemplaire

            //date

            Date today = new Date();
            long time = today.getTime();
            time += 14*24*60*60*1000;

            Calendar expireDate = Calendar.getInstance();
            expireDate.add(Calendar.DATE,14);

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
            String Datejour = formatter.format(expireDate);


            Utilisateur vUser = (Utilisateur) this.session.get("utilisateur");
            System.out.println("User :"+vUser.getLogin());
            System.out.println("DateDuJour :"+Datejour);
        }


        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }
}
