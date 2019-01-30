package org.lle.biblio.consumer.contract.dao;

import org.lle.biblio.model.bean.location.Location;
import org.lle.biblio.model.exception.NotFoundException;

/**
 * Created by TheAdmin on 29.01.2019.
 */
public interface LocationDao {

    Location getLocation (int id) throws NotFoundException;
}
