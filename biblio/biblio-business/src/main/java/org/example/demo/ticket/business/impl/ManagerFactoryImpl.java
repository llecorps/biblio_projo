package org.example.demo.ticket.business.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.example.demo.ticket.business.contract.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;


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

    //...
}
