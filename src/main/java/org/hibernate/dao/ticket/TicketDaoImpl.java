package org.hibernate.dao.ticket;


import org.hibernate.entity.Ticket;
import org.hibernate.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.Duration;
import java.util.List;

public class TicketDaoImpl implements TicketDao {

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
    public List<Ticket> getLongestProjects () {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Duration maxDuration = session.createQuery("select MAX(trunc(finishDate - startDate)) as days from Project", Duration.class)
                    .getSingleResult();
            return session
                    .createQuery("FROM Project WHERE trunc(finishDate - startDate) = :maxDuration", Ticket.class)
                    .setParameter("maxDuration", maxDuration)
                    .list();
        }
    }
}
