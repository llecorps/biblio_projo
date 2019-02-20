package org.lle.biblio.business.impl.manager;


import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;

import org.lle.biblio.business.contract.manager.TicketManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import org.lle.biblio.model.bean.projet.Projet;
import org.lle.biblio.model.bean.ticket.Bug;
import org.lle.biblio.model.bean.ticket.Commentaire;
import org.lle.biblio.model.bean.ticket.Evolution;
import org.lle.biblio.model.bean.ticket.Ticket;
import org.lle.biblio.model.bean.ticket.TicketStatut;
import org.lle.biblio.model.bean.utilisateur.Utilisateur;
import org.lle.biblio.model.exception.NotFoundException;
import org.lle.biblio.model.exception.TechnicalException;
import org.lle.biblio.model.recherche.ticket.RechercheTicket;


/**
 * Manager des beans du package Ticket.
 *
 * @author lgu
 */
@Named
public class TicketManagerImpl extends AbstractManager implements TicketManager {

    @Override
    public Ticket getTicket(Long pNumero) throws NotFoundException {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        if (pNumero < 1L) {
            throw new NotFoundException("Ticket non trouvé : numero=" + pNumero);
        }
        Evolution vEvolution = new Evolution(pNumero);
        vEvolution.setPriorite(10);
        return vEvolution;
    }


    @Override
    public List<Ticket> getListTicket(RechercheTicket pRechercheTicket) {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        List<Ticket> vList = new ArrayList<>();
        if (pRechercheTicket.getProjetId() != null) {
            Projet vProjet = new Projet(pRechercheTicket.getProjetId());
            for (int vI = 0; vI < 4; vI++) {
                Ticket vTicket = new Bug((long) pRechercheTicket.getProjetId() * 10 + vI);
                vTicket.setProjet(vProjet);
                vList.add(vTicket);
            }
        } else {
            for (int vI = 0; vI < 9; vI++) {
                Ticket vTicket = new Evolution((long) vI);
                vList.add(vTicket);
            }
        }
        return vList;
    }


    @Override
    public int getCountTicket(RechercheTicket pRechercheTicket) {
        return getDaoFactory().getTicketDao().getCountTicket(pRechercheTicket);
    }


    @Override
    public List<TicketStatut> getListTicketStatut() {
        return getDaoFactory().getTicketDao().getListStatut();
    }


    @Override
    public void changerStatut(Ticket pTicket, TicketStatut pNewStatut,
                              Utilisateur pUtilisateur,
                              Commentaire pCommentaire) throws TechnicalException {

        DefaultTransactionDefinition vDefinition = new DefaultTransactionDefinition();
        vDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);

        TransactionStatus vTransactionStatus
            = getPlatformTransactionManager().getTransaction(vDefinition);
        try {
            pTicket.setStatut(pNewStatut);
            getDaoFactory().getTicketDao().updateTicket(pTicket);
            // TODO Ajout de la ligne d'historique + commentaire ...

            TransactionStatus vTScommit = vTransactionStatus;
            vTransactionStatus = null;
            getPlatformTransactionManager().commit(vTScommit);
        } finally {
            if (vTransactionStatus != null) {
                getPlatformTransactionManager().rollback(vTransactionStatus);
            }
        }
    }
}
