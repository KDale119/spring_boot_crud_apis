package edu.mcc.codeschool.Crud.API.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class Snacks {
    private UUID id;
    @NotNull
    private String name;
    private String brand;
    @Max(300)
    private int caloriesPerServing;
    private Double cost;
    private Boolean sweet;
    private Boolean salty;
    private Boolean healthy;
    private Boolean crunchy;
    private Boolean soft;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public void setCaloriesPerServing(int caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Boolean getSweet() {
        return sweet;
    }

    public void setSweet(Boolean sweet) {
        this.sweet = sweet;
    }

    public Boolean getSalty() {
        return salty;
    }

    public void setSalty(Boolean salty) {
        this.salty = salty;
    }

    public Boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }

    public Boolean getCrunchy() {
        return crunchy;
    }

    public void setCrunchy(Boolean crunchy) {
        this.crunchy = crunchy;
    }

    public Boolean getSoft() {
        return soft;
    }

    public void setSoft(Boolean soft) {
        this.soft = soft;
    }
}
