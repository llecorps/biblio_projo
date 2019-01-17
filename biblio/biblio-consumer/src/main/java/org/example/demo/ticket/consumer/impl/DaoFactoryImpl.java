package org.example.demo.ticket.consumer.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.example.demo.ticket.consumer.contract.DaoFactory;
import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.consumer.contract.dao.UtilisateurDao;


@Named
public class DaoFactoryImpl implements DaoFactory {

    @Inject
    private ProjetDao projetDao;
    @Override
    public ProjetDao getProjetDao() {
        return projetDao;
    }

    @Inject
    private TicketDao ticketDao;
    @Override
    public TicketDao getTicketDao() {
        return ticketDao;
    }

    @Inject
    private UtilisateurDao utilisateurDao;
    @Override
    public UtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }
}
