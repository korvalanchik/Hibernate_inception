package org.hibernate.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @Pattern(regexp = "^[0-9]+$", message = "Field should consist of uppercase letters (A-Z) or digits (0-9)")
    private String id;

    @Column(name = "name")
    @Length(min = 1, max = 500)
    private String name;

}
