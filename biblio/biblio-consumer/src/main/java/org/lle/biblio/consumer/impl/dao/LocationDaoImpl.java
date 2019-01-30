package org.lle.biblio.consumer.impl.dao;

import org.lle.biblio.consumer.contract.dao.LocationDao;
import org.lle.biblio.consumer.impl.rowmapper.location.LocationRM;
import org.lle.biblio.model.bean.location.Location;
import org.lle.biblio.model.exception.NotFoundException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by TheAdmin on 29.01.2019.
 */
@Named
public class LocationDaoImpl extends AbstractDaoImpl implements LocationDao {


    @Inject
    private LocationRM locationRM;


    @Override
    public Location getLocation(int pId) throws NotFoundException {
        String vSQL = "SELECT * FROM location WHERE utilisateur_id ="+pId;
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("utilisateur_id", pId);
        try {
            Location vLocation = vJdbcTemplate.queryForObject(vSQL, vParams, locationRM);
            return vLocation;
        } catch (IncorrectResultSizeDataAccessException vEx) {
            throw new NotFoundException("Emprunt non trouvé utilisateur_id=" + pId);
        }
    }

}
