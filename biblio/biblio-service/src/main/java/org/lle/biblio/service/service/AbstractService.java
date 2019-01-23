package org.lle.biblio.service.service;

import org.lle.biblio.service.business.contract.ManagerFactory;

import javax.inject.Inject;

/**
 * Created by TheAdmin on 19.01.2019.
 */
public class AbstractService {
    @Inject
    private ManagerFactory managerFactory;
    protected ManagerFactory getManagerFactory() {
        return managerFactory;
    }
}
