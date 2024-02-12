package org.hibernate;

import org.hibernate.entity.Planet;
import org.hibernate.utils.HibernateUtils;
import org.hibernate.entity.Client;


public class HibernateTest {
    public static void main(String[] args) {
        HibernateUtils hibernateConfig = HibernateUtils.getInstance();

        try (Session session = hibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            Client client = createClient();
            Planet planet = createPlanet();

            session.persist(client);
            session.persist(planet);

            client.setName("Valentina");
            planet.setName("Planet Nine");

            session.merge(client);
            session.merge(planet);

            String nameClient = session.get(Client.class, client.getId()).getName();
            String namePlanet = session.get(Planet.class, planet.getId()).getName();
            System.out.println("Last client: " + nameClient + ", last planet: " + namePlanet);

            session.remove(client);
            session.remove(planet);

            transaction.commit();
        } finally {
            hibernateConfig.closeSessionFactory();
        }
    }
    private static Client createClient() {
        Client client = new Client();
        client.setName("Kvitka");
        return client;
    }
    private static Planet createPlanet() {
        Planet planet = new Planet();
        planet.setId("PLANETNINE");
        planet.setName("Planet9");
        return planet;

    }
}
