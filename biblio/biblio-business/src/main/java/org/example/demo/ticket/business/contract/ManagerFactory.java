package org.example.demo.ticket.business.contract;

import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;


public interface ManagerFactory {
    ProjetManager getProjetManager();

    TicketManager getTicketManager();
}
