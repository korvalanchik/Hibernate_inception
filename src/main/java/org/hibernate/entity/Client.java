package org.hibernate.entity;

import jakarta.persistence.*;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Set;


@Data
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Length(min = 3, max = 200)
    private String name;


    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<Ticket> tickets;
}

