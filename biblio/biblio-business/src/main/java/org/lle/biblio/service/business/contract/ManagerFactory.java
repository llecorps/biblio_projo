package org.lle.biblio.service.business.contract;

import org.lle.biblio.service.business.contract.manager.ProjetManager;
import org.lle.biblio.service.business.contract.manager.TicketManager;
import org.lle.biblio.service.business.contract.manager.UtilisateurManager;


public interface ManagerFactory {
    ProjetManager getProjetManager();

    TicketManager getTicketManager();

    UtilisateurManager getUtilisateurManager();
}
