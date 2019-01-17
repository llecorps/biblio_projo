package org.lle.biblio.webapp.rest.resource;

import org.lle.biblio.business.contract.ManagerFactory;

public abstract class AbstractResource {

    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }
}
