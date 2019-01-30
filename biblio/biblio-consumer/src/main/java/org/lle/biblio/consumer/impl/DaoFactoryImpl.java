package org.lle.biblio.consumer.impl;

import org.lle.biblio.consumer.contract.DaoFactory;
import org.lle.biblio.consumer.contract.dao.LocationDao;
import org.lle.biblio.consumer.contract.dao.UtilisateurDao;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class DaoFactoryImpl implements DaoFactory {


    @Inject
    private LocationDao locationDao;
    @Override
    public LocationDao getLocationDao() {
        return locationDao;
    }

    @Inject
    private UtilisateurDao utilisateurDao;
    @Override
    public UtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }
}
