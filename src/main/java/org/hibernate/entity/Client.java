package org.hibernate.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.Check;
import org.hibernate.validator.constraints.Length;



@Entity
@Table(name = "client")
@Data
public class Client {
    @Id
    @Pattern(regexp = "[A-Z0-9]")
    private long id;

    @Column(name = "name")
    @Length(min = 3, max = 200)
    private String name;
}

