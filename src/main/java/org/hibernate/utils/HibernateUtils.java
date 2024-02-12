package org.hibernate.utils;

import org.hibernate.props.PropertyReader;
import org.flywaydb.core.Flyway;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.entity.Client;
import org.hibernate.entity.Planet;
import org.hibernate.entity.Ticket;

public class HibernateUtils {

    private static final HibernateUtils INSTANCE = new HibernateUtils();
    private final SessionFactory sessionFactory;

    private HibernateUtils() {
        this.sessionFactory = new Configuration()
                .addAnnotatedClass(Ticket.class)
                .addAnnotatedClass(Planet.class)
                .addAnnotatedClass(Client.class)
                .buildSessionFactory();
        flywayMigration(PropertyReader.getConnectionUrlForH2(),
                PropertyReader.getUserForH2(),
                PropertyReader.getPasswordForH2());
    }

    public static HibernateUtils getInstance() {
        return INSTANCE;
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void closeSessionFactory() {
        this.sessionFactory.close();
    }

    /* Flyway */

    private void flywayMigration(String connectionUrl, String username, String password) {
        Flyway flyway = Flyway.configure().dataSource(connectionUrl, username, password).load();
        flyway.migrate();
    }
}
