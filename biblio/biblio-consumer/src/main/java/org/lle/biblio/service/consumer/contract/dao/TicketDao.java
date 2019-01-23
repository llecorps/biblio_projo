package org.lle.biblio.service.consumer.contract.dao;

import java.util.List;

import org.lle.biblio.service.model.bean.ticket.Ticket;
import org.lle.biblio.service.model.bean.ticket.TicketStatut;
import org.lle.biblio.service.model.exception.TechnicalException;
import org.lle.biblio.service.model.recherche.ticket.RechercheTicket;


/**
 * Interface de DAO pour le package « ticket »
 */
public interface TicketDao {

    int getCountTicket(RechercheTicket pRechercheTicket);

    List<TicketStatut> getListStatut();

    void updateTicketStatut(TicketStatut pTicketStatut);

    void insertTicketStatut(TicketStatut pTicketStatut);

    void updateTicket(Ticket pTicket) throws TechnicalException;
}
