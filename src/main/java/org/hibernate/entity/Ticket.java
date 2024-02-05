package org.hibernate.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;


@Entity
@Table(name = "ticket")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "created_at")
    private Timestamp created_at;
    @Column(name = "client_id")
    private long client_id;
    @Column(name = "from_planet_id")
    private long from_planet_id;
    @Column(name = "to_planet_id")
    private long to_planet_id;
}
