package org.lle.biblio.business.impl.manager;

import org.lle.biblio.business.contract.manager.LocationManager;
import org.lle.biblio.model.bean.location.Location;
import org.lle.biblio.model.exception.NotFoundException;

import javax.inject.Named;

/**
 * Created by TheAdmin on 27.01.2019.
 */
@Named
public class LocationManagerImpl extends AbstractManager implements LocationManager {

    private Location vLocation;


    @Override
    public Location getLocation(int id) {

        try {
            vLocation = getDaoFactory().getLocationDao().getLocation(id);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return vLocation;
    }
}
