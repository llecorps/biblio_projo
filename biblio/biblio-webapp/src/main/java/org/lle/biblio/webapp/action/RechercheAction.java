package org.lle.biblio.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.lle.biblio.model.exception.NotFoundException;
import org.lle.biblio.webapp.generated.BiblioService;
import org.lle.biblio.webapp.generated.BiblioService_Service;
import org.lle.biblio.webapp.generated.Livre;
import org.lle.biblio.webapp.generated.NotFoundException_Exception;

import java.util.List;

/**
 * Created by TheAdmin on 26.01.2019.
 */
public class RechercheAction extends ActionSupport {


    private List<Livre> ListLivre;

    public List<Livre> getListLivre() {
        return ListLivre;
    }

    public void setListLivre(List<Livre> listLivre) {
        ListLivre = listLivre;
    }

    public String doRecherche() throws NotFoundException, NotFoundException_Exception {

    String vResult = ActionSupport.INPUT;

        BiblioService_Service pBiblio = new BiblioService_Service();

        BiblioService pBiblioService = pBiblio.getBiblioServicePort();

        if (vResult.equals(ActionSupport.INPUT)) {
            this.ListLivre = pBiblioService.doListLivre();
        }
        return vResult;
   }
}
