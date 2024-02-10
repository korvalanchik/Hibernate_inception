package org.hibernate.dao.planet;
import org.hibernate.entity.Planet;

import java.util.List;

public interface PlanetDao {

    boolean createPlanet(Planet planet);

    boolean updatePlanet(Planet planet);

    Planet getPlanetById(Long workerId);

    List<Planet> getAllPlanets();

    void deletePlanetById(Long workerId);

    void deletePlanet(Planet planet);

    List<Planet> getPlanetsWithMaxSalary();

    List<Planet> getOldestAndYoungestPlanets();
}
