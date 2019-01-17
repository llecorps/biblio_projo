package org.example.demo.ticket.business.impl.manager;

import java.util.List;
import java.util.Set;
import javax.inject.Named;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.FunctionalException;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.exception.TechnicalException;


@Named
public class ProjetManagerImpl extends AbstractManager implements ProjetManager {


    @Override
    public Projet getProjet(Integer pId) throws NotFoundException {
        return getDaoFactory().getProjetDao().getProjet(pId);
    }


    @Override
    public List<Projet> getListProjet() {
        return getDaoFactory().getProjetDao().getListProjet();
    }


    @Override
    public void insertVersion(Version pVersion) throws FunctionalException {
        if (pVersion == null) {
            throw new FunctionalException("L'objet Version ne doit pas être null !");
        }

        Set<ConstraintViolation<Version>> vViolations = getConstraintValidator().validate(pVersion);
        if (!vViolations.isEmpty()) {
            throw new FunctionalException("L'objet Version est invalide",
                                          new ConstraintViolationException(vViolations));
        }

        TransactionStatus vTransactionStatus
            = getPlatformTransactionManager().getTransaction(new DefaultTransactionDefinition());
        try {
            getDaoFactory().getProjetDao().insertVersion(pVersion);

            TransactionStatus vTScommit = vTransactionStatus;
            vTransactionStatus = null;
            getPlatformTransactionManager().commit(vTScommit);

        } catch (TechnicalException vEx) {
            throw new FunctionalException("La version existe déjà !", vEx);

        } finally {
            if (vTransactionStatus != null) {
                getPlatformTransactionManager().rollback(vTransactionStatus);
            }
        }
    }


}
