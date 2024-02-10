package org.hibernate;

import org.hibernate.utils.HibernateUtils;
import org.hibernate.entity.Client;


public class HibernateTest {
    public static void main(String[] args) {
        HibernateUtils hibernateConfig = HibernateUtils.getInstance();

        try (Session session = hibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

//            Client client = createClient();
//
//            session.persist(client);

            transaction.commit();
        } finally {
            hibernateConfig.closeSessionFactory();
        }
    }
    private static Client createClient() {
        Client client = new Client();
        client.setName("Chuvak");
        return client;

    }
}
