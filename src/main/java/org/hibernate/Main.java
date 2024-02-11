package org.hibernate;

import org.hibernate.dao.clien.ClientDao;
import org.hibernate.dao.clien.ClientDaoImpl;
import org.hibernate.dao.planet.PlanetDaoImpl;
import org.hibernate.dao.ticket.TicketDao;
import org.hibernate.dao.ticket.TicketDaoImpl;
import org.hibernate.entity.Client;
import org.hibernate.entity.Planet;
import org.hibernate.entity.Ticket;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Ticket> ticketsByClientId = new TicketDaoImpl().getTicketsByClientId(11L);
        ticketsByClientId.forEach(p -> System.out.println(p.getId()));

        Ticket ticket = new Ticket();
        ticket.setClient(new ClientDaoImpl().findById(8L));
        ticket.setCreated_at(new Timestamp(new Date().getTime()));
        Planet planetFrom = new PlanetDaoImpl().getPlanetById("Pluton");
        Planet planetTo = new PlanetDaoImpl().getPlanetById("MARS");
        ticket.setFromPlanetId(planetFrom);
        ticket.setToPlanetId(planetTo);
        boolean newTicketResult = new TicketDaoImpl().createTicket(ticket);
        if(newTicketResult) {
            System.out.println("*************All is well. I bought a ticket. Let's go! We may be late.***********");
        }
//        new ClientDaoImpl().deleteClientById(5L);
        new ClientDaoImpl().createClientByName("Tamara");

    }
}