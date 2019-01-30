package org.lle.biblio.service;

import org.lle.biblio.model.bean.location.Location;

/**
 * Created by TheAdmin on 28.01.2019.
 */
public class LocationServiceImpl extends AbstractService{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation(int id){

        Location vLocation = getManagerFactory().getLocationManager().getLocation(id);
        return vLocation;
    }
}
