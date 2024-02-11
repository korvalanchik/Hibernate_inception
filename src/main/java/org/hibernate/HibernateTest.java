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

            transaction.commit();
        } finally {
            hibernateConfig.closeSessionFactory();
        }
    }
    private static Client createClient() {
        Client client = new Client();
        client.setName("Chuviha");
        return client;
    }
    private static Planet createPlanet() {
        Planet planet = new Planet();
        planet.setId("BBETA");
        planet.setName("Betaggg");
        return planet;

    }
}
