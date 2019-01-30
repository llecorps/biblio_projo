package org.lle.biblio.business.contract;

import org.lle.biblio.business.contract.manager.LocationManager;
import org.lle.biblio.business.contract.manager.UtilisateurManager;


public interface ManagerFactory {


    UtilisateurManager getUtilisateurManager();

    LocationManager getLocationManager();
}
