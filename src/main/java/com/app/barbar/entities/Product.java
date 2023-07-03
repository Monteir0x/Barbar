package com.app.barbar.entities;

public abstract class Product {
   private Double price;
   private String name;
   private EnumBeer enumBeer;
   private Integer quantity;
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
