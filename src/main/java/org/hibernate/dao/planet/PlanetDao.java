package org.hibernate.dao.planet;
import org.hibernate.entity.Planet;

import java.util.List;

public interface PlanetDao {

    boolean createPlanet(Planet planet);

    boolean updatePlanet(Planet planet);

    Planet getPlanetById(String planetId);

    List<Planet> getAllPlanets();

    void deletePlanetById(String planetId);

    void deletePlanet(Planet planet);
}
