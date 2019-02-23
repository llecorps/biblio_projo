package org.lle.biblio.business.impl.manager;

import org.lle.biblio.business.contract.manager.LocationManager;
import org.lle.biblio.model.bean.location.Location;
import org.lle.biblio.model.exception.NotFoundException;

import javax.inject.Named;
import java.util.List;

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

    @Override
    public Location getLivrelocation(int id) {
        try {
            vLocation = getDaoFactory().getLocationDao().getLivrelocation(id);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return vLocation;
    }

    @Override
    public int getExemplaire(int id) {

        int vExemplaire = 0;
        try {
            vExemplaire = getDaoFactory().getLocationDao().getExemplaire(id);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return vExemplaire;
    }

    @Override
    public void addEmprunt(Location pLocation) {

        getDaoFactory().getLocationDao().addEmprunt(pLocation);

    }

    @Override
    public void addProlo(String expiration, int id) {

        getDaoFactory().getLocationDao().addProlo(expiration,id);

    }

    @Override
    public List<Location> getListLocation(int id) {

        List<Location> vListLocation = getDaoFactory().getLocationDao().getListLocation(id);

        return vListLocation;
    }

    @Override
    public List<Location> listLocation() {
        List<Location> vListLocation = getDaoFactory().getLocationDao().listLocation();

        return vListLocation;
}
}
