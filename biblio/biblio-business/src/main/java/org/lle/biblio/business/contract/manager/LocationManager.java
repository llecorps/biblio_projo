package org.lle.biblio.business.contract.manager;

import org.lle.biblio.model.bean.location.Location;

import java.util.List;

/**
 * Created by TheAdmin on 27.01.2019.
 */
public interface LocationManager {

    Location getLocation (int id);
    Location getLivrelocation (int id);
    int getExemplaire (int id);
    void addEmprunt(Location pLocation );
    List<Location> getListLocation(int id);
    List<Location> listLocation();
    void addProlo(String expiration, int id);
}
