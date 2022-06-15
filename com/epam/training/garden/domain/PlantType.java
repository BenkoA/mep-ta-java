package com.epam.training.garden.domain;

public class PlantType {

    private String name;
    private double area;
    private double waterAmount;

    public PlantType(String name, double area, double waterAmount) {

    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getWaterAmount() {
        return waterAmount;
    }
}
