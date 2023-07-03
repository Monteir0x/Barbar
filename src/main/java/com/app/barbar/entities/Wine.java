package com.app.barbar.entities;

import jakarta.persistence.*;

@Entity
public class Wine extends Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_wine", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }
}
