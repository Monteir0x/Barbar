package com.app.barbar.entities;

import jakarta.persistence.Column;

public abstract class Product {
   @Column(name = "preco", nullable = false)
    private Double price;
   @Column(name = "nome", nullable = false)
   private String name;
   @Column(name = "tipo", nullable = true)
   private EnumBeer enumBeer;
   @Column(name = "quantidade", nullable = false)
   private Integer quantity;
   @Column(name = "custo", nullable = false)
   private Double cost;

   //#region Getters & Setters
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

    public EnumBeer getEnumBeer() {
        return enumBeer;
    }

    public void setEnumBeer(EnumBeer enumBeer) {
        this.enumBeer = enumBeer;
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
