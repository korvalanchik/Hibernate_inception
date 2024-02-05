package org.hibernate;

import org.hibernate.config.HibernateUtil;
import org.hibernate.entity.Client;
import org.hibernate.init.InitService;

public class HibernateTest {
    public static void main(String[] args) {
        HibernateUtil hibernateConfig = HibernateUtil.getInstance();
        InitService insrv = new InitService();

        try (Session session = hibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            Client client = createClient();

            session.persist(client);

            transaction.commit();
        } finally {
            hibernateConfig.close();
        }

    }
    private static Client createClient() {
        Client client = new Client();
        client.setName("Chuvak");
        return client;

    }
}
