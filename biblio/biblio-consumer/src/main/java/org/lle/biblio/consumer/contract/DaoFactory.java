package org.lle.biblio.consumer.contract;

import org.lle.biblio.consumer.contract.dao.LocationDao;
import org.lle.biblio.consumer.contract.dao.UtilisateurDao;


public interface DaoFactory {



    UtilisateurDao getUtilisateurDao();

    LocationDao getLocationDao();
}
