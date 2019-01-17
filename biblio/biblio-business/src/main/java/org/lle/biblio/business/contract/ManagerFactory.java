package org.lle.biblio.business.contract;

import org.lle.biblio.business.contract.manager.ProjetManager;
import org.lle.biblio.business.contract.manager.TicketManager;


public interface ManagerFactory {
    ProjetManager getProjetManager();

    TicketManager getTicketManager();
}
