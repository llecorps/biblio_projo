package org.example.demo.ticket.business.contract.manager;


import java.util.List;

import org.example.demo.ticket.model.bean.ticket.Commentaire;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.exception.TechnicalException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;


/**
 * Manager des beans du package Ticket.
 *
 * @author lgu
 */
public interface TicketManager {

    /**
     * Cherche et renvoie le {@link Ticket} numéro {@code pNumero}
     *
     * @param pNumero le numéro du Ticket
     * @return Le {@link Ticket}
     * @throws NotFoundException Si le Ticket n'est pas trouvé
     */
    Ticket getTicket(Long pNumero) throws NotFoundException;


    /**
     * Renvoie la liste des {@link Ticket} correspondants aux critères de recherche.
     *
     * @param pRechercheTicket -
     * @return List
     */
    List<Ticket> getListTicket(RechercheTicket pRechercheTicket);


    /**
     * Renvoie la liste des {@link TicketStatut}
     *
     * @return List
     */
    List<TicketStatut> getListTicketStatut();


    /**
     * Renvoie le nombre de {@link Ticket} correspondants aux critères de recherche.
     *
     * @param pRechercheTicket -
     * @return int
     */
    int getCountTicket(RechercheTicket pRechercheTicket);

    void changerStatut(Ticket pTicket, TicketStatut pNewStatut,
                       Utilisateur pUtilisateur, Commentaire pCommentaire) throws TechnicalException;
}
