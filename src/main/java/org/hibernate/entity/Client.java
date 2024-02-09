package org.hibernate.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Length(min = 3, max = 200)
    private String name;

    @OneToMany(mappedBy = "client")
    private List<Ticket> tickets;

//    @OneToMany(mappedBy="client", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<Ticket> tickets = new HashSet<>();

}

