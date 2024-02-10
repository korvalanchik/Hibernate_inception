package org.hibernate.dao.ticket;

import org.hibernate.entity.Ticket;

import java.util.List;

public interface TicketDao {

    void deleteById (Long id);

    List<Ticket> getLongestProjects();
}
