package org.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Entity
@Table(name = "planet")
@Data
public class Planet {
    @Id
    @Pattern(regexp = "[A-Z0-9]")
    private String id;

    @Column(name = "name")
    @Length(min = 1, max = 500)
    private String name;

}
