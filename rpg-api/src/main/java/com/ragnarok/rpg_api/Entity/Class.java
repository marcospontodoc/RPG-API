package com.ragnarok.rpg_api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_class")
    private Integer idClass;

    @Column(name ="name", nullable = false)
    private String name;

    @Column(name="description", nullable = false)
    private String description;
    
    public Class() {
    }

    public Integer getIdClass() {
        return idClass;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
