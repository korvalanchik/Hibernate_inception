package org.hibernate.dao.ticket;

import org.hibernate.entity.Ticket;

import java.util.List;

public interface TicketDao {

    boolean createTicket (Ticket ticket);

    boolean updateTicket(Ticket ticket);

    void deleteById (Long id);

    List<Ticket> getTicketsByClientId(Long clientId);
}
