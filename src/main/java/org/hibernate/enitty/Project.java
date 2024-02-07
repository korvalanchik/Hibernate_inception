package org.hibernate.enitty;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="client_id", nullable=false)
    private Client client;

    @Column(nullable = false)
    private String name;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "finish_date", nullable = false)
    private LocalDate finishDate;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Worker> workers = new ArrayList<>();
}
