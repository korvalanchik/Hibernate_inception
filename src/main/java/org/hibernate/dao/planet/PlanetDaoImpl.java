package org.hibernate.dao.planet;

import org.hibernate.entity.Planet;
import org.hibernate.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlanetDaoImpl implements PlanetDao {

    private static final String GET_ALL_WORKER_QUERY = "from Planet";

    @Override
    public boolean createPlanet (Planet planet) {
        boolean result = false;
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                planet.setId(null);
                session.persist(planet);
                transaction.commit();
                result = true;
            } catch(Exception ex) {
                ex.printStackTrace();
                transaction.rollback();
            }
        }
        return result;
    }

    @Override
    public boolean updatePlanet (Planet planet) {
        boolean result = false;
        if (Objects.isNull(planet.getId())) {
            return false;
        }
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                session.merge(planet);
                transaction.commit();
                result = true;
            } catch(Exception ex) {
                ex.printStackTrace();
                transaction.rollback();
            }
        }
        return result;
    }

    @Override
    public Planet getPlanetById (Long planetId) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            return session.get(Planet.class, planetId);
        }
    }

    @Override
    public List<Planet> getAllPlanets () {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            return session.createQuery(GET_ALL_WORKER_QUERY, Planet.class).list();
        }
    }

    @Override
    public void deletePlanetById (Long planetId) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Planet existing = session.get(Planet.class, planetId);
            session.remove(existing);
            transaction.commit();
        }
    }

    @Override
    public void deletePlanet (Planet planet) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(planet);
            transaction.commit();
        }
    }

    @Override
    public List<Planet> getPlanetsWithMaxSalary() {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Integer maxSalary = session.createQuery("SELECT MAX(salary) FROM Planet", Integer.class)
                    .getSingleResult();
            return session
                    .createQuery("FROM Planet WHERE salary = :maxSalary", Planet.class)
                    .setParameter("maxSalary", maxSalary)
                    .list();
        }
    }

    @Override
    public List<Planet> getOldestAndYoungestPlanets() {
        List<Planet> result = new ArrayList<>();
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                LocalDate minBirthday = session.createQuery("SELECT MIN(birthday) FROM Planet", LocalDate.class)
                        .getSingleResult();
                LocalDate maxBirthday = session.createQuery("SELECT MAX(birthday) FROM Planet", LocalDate.class)
                        .getSingleResult();
                result = session
                        .createQuery("FROM Planet WHERE birthday = :minBirthday OR birthday = :maxBirthday", Planet.class)
                        .setParameter("minBirthday", minBirthday)
                        .setParameter("maxBirthday", maxBirthday)
                        .list();
                transaction.commit();
            } catch(Exception ex) {
                ex.printStackTrace();
                transaction.rollback();
            }
            return result;
        }
    }
}
