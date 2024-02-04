package org.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;


@Entity
@Table(name = "ticket")
@Data
public class Ticket {
    @Id
    private long id; // - ідентифікатор квитка, первинний сурогатний ключ, автоінкрементне число.
    private Timestamp created_at; // - TIMESTAMP в UTC, коли був створений цей квиток
    private long client_id; // - ідентифікатор клієнта, якому належить цей квиток.
    private long from_planet_id; // - ідентифікатор планети, звідки відправляється пасажир
    private long to_planet_id;
}
