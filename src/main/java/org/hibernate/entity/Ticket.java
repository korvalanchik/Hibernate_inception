package org.hibernate.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.sql.Timestamp;


@Data@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "created_at")
    private Timestamp created_at;

    @ManyToOne
    @JoinColumn(name="client_id", referencedColumnName = "id", nullable=false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "from_planet_id", referencedColumnName = "id")
    private Planet fromPlanetId;

    @ManyToOne
    @JoinColumn(name = "to_planet_id", referencedColumnName = "id")
    private Planet toPlanetId;

}
