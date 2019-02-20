package org.lle.biblio.business.impl;

import org.lle.biblio.business.contract.ManagerFactory;
import org.lle.biblio.business.contract.manager.ProjetManager;
import org.lle.biblio.business.contract.manager.TicketManager;
import org.lle.biblio.business.contract.manager.UtilisateurManager;

import javax.inject.Inject;
import javax.inject.Named;


@Named("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {

    @Inject
    private ProjetManager projetManager;
    @Override
    public ProjetManager getProjetManager() {
        return this.projetManager;
    }
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }

    @Inject
    private TicketManager ticketManager;
    @Override
    public TicketManager getTicketManager() {
        return this.ticketManager;
    }
    public void setTicketManager(TicketManager pTicketManager) {
        ticketManager = pTicketManager;
    }

    @Inject
    private UtilisateurManager utilisateurManager;
    @Override
    public UtilisateurManager getUtilisateurManager() {
        return this.utilisateurManager;
    }
    public void setUtilisateurManager(UtilisateurManager pUtilisateurManager) {
        utilisateurManager = pUtilisateurManager;
    }
}
