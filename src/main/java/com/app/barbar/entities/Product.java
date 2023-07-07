package com.app.barbar.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String name;
    @Column(name = "preco", nullable = false)
    private Double price;
    @Column(name = "categoria", nullable = false)
    private ECategory eCategory;
    @Column(name = "quantidade", nullable = false)
    private Integer quantity;
    @Column(name = "custo", nullable = false)
    private Double cost;

    //#region Getters & Setters
    public Long getId() {
        return id;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ECategory geteCategory() {
        return eCategory;
    }

    public void setECategory(ECategory eCategory) {
        this.eCategory = eCategory;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    //#endregion
}
