package org.hibernate.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.enitty.Client;

import java.sql.Timestamp;


@Getter
@Setter
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "created_at")
    private Timestamp created_at;

    @ManyToOne
    @JoinColumn(name="client_id", nullable=false)
    private Client client;

    @Column(name = "from_planet_id", nullable = false)
    private long from_planet_id;

    @Column(name = "to_planet_id", nullable = false)
    private long to_planet_id;
}
