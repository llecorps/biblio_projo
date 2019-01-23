package org.lle.biblio.service.batch.traitement;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;

import org.lle.biblio.service.business.contract.ManagerFactory;


public abstract class AbstractTraitement {

    @Value("${export.path}")
    private String exportPath;
    public String getExportPath() {
        return exportPath;
    }


    @Inject
    private ManagerFactory managerFactory;
    protected ManagerFactory getManagerFactory() {
        return managerFactory;
    }
}
