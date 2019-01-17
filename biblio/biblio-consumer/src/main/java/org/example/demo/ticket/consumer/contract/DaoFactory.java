package org.example.demo.ticket.consumer.contract;

import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.consumer.contract.dao.UtilisateurDao;


public interface DaoFactory {

    ProjetDao getProjetDao();

    TicketDao getTicketDao();

    UtilisateurDao getUtilisateurDao();
}
