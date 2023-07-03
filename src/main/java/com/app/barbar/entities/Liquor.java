package com.app.barbar.entities;

import jakarta.persistence.*;

@Entity
public class Liquor extends Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_liquor", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }
}
