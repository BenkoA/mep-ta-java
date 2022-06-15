package com.epam.training.garden.service;

public class Result {

    private double area;
    private double waterAmount;
    private boolean areaOk;
    private boolean waterOk;

    Result(double area, double waterAmount, boolean areaOk, boolean waterOk) {
        this.area = area;
        this.waterAmount = waterAmount;
        this.areaOk = areaOk;
        this.waterOk = waterOk;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public boolean isAreaOk() {
        return areaOk;
    }

    public void setAreaOk(boolean areaOk) {
        this.areaOk = areaOk;
    }

    public boolean isWaterOk() {
        return waterOk;
    }

    public void setWaterOk(boolean waterOk) {
        this.waterOk = waterOk;
    }

    @Override
    public String toString() {
        return "Result{" +
                "area = " + area +
                ", waterAmount = " + waterAmount +
                ", areaOk = " + areaOk +
                ", waterOk = " + waterOk +
                '}';
    }
}
