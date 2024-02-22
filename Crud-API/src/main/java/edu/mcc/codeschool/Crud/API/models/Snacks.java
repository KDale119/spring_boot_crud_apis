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
    private String texture;


}
