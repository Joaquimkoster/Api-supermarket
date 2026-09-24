package com.supermarket.supermarket_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(nullable = false)
    private double value;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false, length = 100)
    private String category;

    public Product() {

    }



    public Product(String name, String description, double value, int quantity, String category) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.quantity = quantity;
        this.category = category;
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override 
    public String toString() {
        return "Product{id = " + id + ", name = " + name + ", description = " +
         description + ", quantity" + quantity + "category = "+ category + "}"; 
    }
}
