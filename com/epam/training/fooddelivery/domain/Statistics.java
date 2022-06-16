package com.epam.training.fooddelivery.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Statistics {

    private BigDecimal totalIncome;
    private double averageIncomeByOrder;
    private int numberOfFood;
    private int numberOfOrder;
    private LocalDate dayOfHighestIncome;

    public Statistics() {

    }

    public BigDecimal getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(BigDecimal totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getAverageIncomeByOrder() {
        return averageIncomeByOrder;
    }

    public void setAverageIncomeByOrder(double averageIncomeByOrder) {
        this.averageIncomeByOrder = averageIncomeByOrder;
    }

    public int getNumberOfFood() {
        return numberOfFood;
    }

    public void setNumberOfFood(int numberOfFood) {
        this.numberOfFood = numberOfFood;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public LocalDate getDayOfHighestIncome() {
        return dayOfHighestIncome;
    }

    public void setDayOfHighestIncome(LocalDate dayOfHighestIncome) {
        this.dayOfHighestIncome = dayOfHighestIncome;
    }
}
