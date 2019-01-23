package org.lle.biblio.service.consumer.contract;

import org.lle.biblio.service.consumer.contract.dao.ProjetDao;
import org.lle.biblio.service.consumer.contract.dao.TicketDao;
import org.lle.biblio.service.consumer.contract.dao.UtilisateurDao;


public interface DaoFactory {

    ProjetDao getProjetDao();

    TicketDao getTicketDao();

    UtilisateurDao getUtilisateurDao();
}
