package org.hibernate.dao.ticket;


import org.hibernate.entity.Ticket;
import org.hibernate.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Objects;

public class TicketDaoImpl implements TicketDao {

    @Override
    public boolean createTicket(Ticket ticket) {
        boolean result = false;
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                ticket.setId(null);
                session.persist(ticket);
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
    public boolean updateTicket(Ticket ticket) {
        boolean result = false;
        if (Objects.isNull(ticket.getId())) {
            return result;
        }
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                session.merge(ticket);
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
    public void deleteById (Long id) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Ticket existing = session.get(Ticket.class, id);
            session.remove(existing);
            transaction.commit();
        }
    }

    @Override
    public List<Ticket> getTicketsByClientId(Long clientId) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            String hql = "FROM Ticket t WHERE t.client.id = :clientId";
            return session
                    .createQuery(hql, Ticket.class)
                    .setParameter("clientId", clientId)
                    .getResultList();
        }
    }
}
