package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "planet")
@Data
public class Planet {
    @Id
    private String id;
    @Column(length = 200)
    private String name;
}
