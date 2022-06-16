package com.epam.training.fooddelivery.domain;

import java.math.BigDecimal;
import java.util.Locale;

public class Food {

    private String name;
    private BigDecimal price;

    public Food(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static BigDecimal getPriceForFoodName(String foodName) {
        BigDecimal price;
        String ignoreCapitals = foodName.toLowerCase();
        switch (ignoreCapitals) {
            case "fideua":
                price = new BigDecimal("15");
                break;
            case "paella":
            case "quesadilla":
                price = new BigDecimal("13");
                break;
            case "tortilla":
                price = new BigDecimal("10");
                break;
            case "gazpacho":
                price = new BigDecimal("8");
                break;
            default:
                price = new BigDecimal("0");
                break;
        }
        return price;
    }
}
