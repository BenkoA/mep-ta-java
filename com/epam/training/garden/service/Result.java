package com.epam.training.garden.service;

import java.util.Objects;

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
        return "Required area: " + area + " m2 \n" +
                "Water need: " + waterAmount + " l";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(result.area, area) == 0 && Double.compare(result.waterAmount, waterAmount) == 0 && areaOk == result.areaOk && waterOk == result.waterOk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, waterAmount, areaOk, waterOk);
    }

    public static void printResult(Result result) {
        System.out.println("\n***Result***\n");
        System.out.println(result);

        if (result.isAreaOk() && result.isWaterOk()) {         // removed true, its set to true by default
            System.out.println("Plan is feasible in your garden! :)");
        } else
            System.out.println("Sadly your plan wont work:(");
        if (!result.isWaterOk()) {                        // changed "false" to "!result."
            System.out.println("Not enough water!");
        }
        if (!result.isAreaOk()) {                        // same as line 48(!result.)
            System.out.println("Not enough area!");
        }
    }
}
