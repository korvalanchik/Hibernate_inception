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
@Table(name = "worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate birthday;

    @Column
    private Integer salary;

    @Column
    @Enumerated(EnumType.STRING)
    private Level levels;

    @JoinTable(
            name = "project_worker",
            joinColumns = @JoinColumn(name = "worker_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    @ManyToMany
    private List<Project> projects = new ArrayList<>();
}
