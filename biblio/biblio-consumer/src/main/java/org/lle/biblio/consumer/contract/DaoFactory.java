package org.lle.biblio.consumer.contract;

import org.lle.biblio.consumer.contract.dao.ProjetDao;
import org.lle.biblio.consumer.contract.dao.TicketDao;
import org.lle.biblio.consumer.contract.dao.UtilisateurDao;


public interface DaoFactory {

    ProjetDao getProjetDao();

    TicketDao getTicketDao();

    UtilisateurDao getUtilisateurDao();
}
