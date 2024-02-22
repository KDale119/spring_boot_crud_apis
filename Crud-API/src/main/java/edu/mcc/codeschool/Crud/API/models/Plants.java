package edu.mcc.codeschool.Crud.API.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public class Plants {


    private UUID id;
    @NotNull
    private String name;
    private String type;
    @Min(1)
    private int cupsOfWater;
    private String potSize;
    private String soilType;
    private String leafColor;
    private int averageSizeInFeet;
    private String lightLevel;
    private Double humidityLevel;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCupsOfWater() {
        return cupsOfWater;
    }

    public void setCupsOfWater(int cupsOfWater) {
        this.cupsOfWater = cupsOfWater;
    }

    public String getPotSize() {
        return potSize;
    }

    public void setPotSize(String potSize) {
        this.potSize = potSize;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public int getAverageSizeInFeet() {
        return averageSizeInFeet;
    }

    public void setAverageSizeInFeet(int averageSizeInFeet) {
        this.averageSizeInFeet = averageSizeInFeet;
    }

    public String getLightLevel() {
        return lightLevel;
    }

    public void setLightLevel(String lightLevel) {
        this.lightLevel = lightLevel;
    }

    public Double getHumidityLevel() {
        return humidityLevel;
    }

    public void setHumidityLevel(Double humidityLevel) {
        this.humidityLevel = humidityLevel;
    }
}
