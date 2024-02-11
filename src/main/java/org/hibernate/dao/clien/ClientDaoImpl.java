package org.hibernate.dao.clien;

import org.hibernate.entity.Client;
import org.hibernate.entity.Ticket;
import org.hibernate.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Objects;

public class ClientDaoImpl implements ClientDao {

    @Override
    public Client findById (Long clientId) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Client client = session.get(Client.class, clientId);

            // TODO: for lazy loading.
            // client.getTickets().forEach(Ticket::getId);
            return client;
        }
    }

    @Override
    public boolean createClient(Client client) {
        boolean result = false;
        if(Objects.isNull(client.getId())) {
            return result;
        }
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                client.setId(null);
                session.persist(client);
                transaction.commit();
                result = true;
            } catch(Exception ex) {
                ex.printStackTrace();
                transaction.rollback();
            }
        }
        return result;
    }

    public void createClientByName(String name) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                Client client = new Client();
                client.setId(null);
                client.setName(name);
                session.persist(client);
                transaction.commit();
            } catch(Exception ex) {
                ex.printStackTrace();
                transaction.rollback();
            }
        }
    }

    @Override
    public boolean updateClient(Client client) {
        boolean result = false;
        if(Objects.isNull(client.getId())) {
            return result;
        }
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                session.merge(client);
                transaction.commit();
                result = true;
            }
            catch (Exception ex) {
                ex.printStackTrace();
                transaction.rollback();
            }
        }
        return result;
    }

    @Override
    public void deleteClientById (Long clientId) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Client existing = session.get(Client.class, clientId);
            session.remove(existing);
            transaction.commit();
        }
    }
}
