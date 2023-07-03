package com.app.barbar.entities;

import jakarta.persistence.*;

@Entity
public class Beer extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_beer", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }
}
