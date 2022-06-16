package com.epam.training.fooddelivery.service;

import com.epam.training.fooddelivery.data.DataStore;
import com.epam.training.fooddelivery.domain.Food;
import com.epam.training.fooddelivery.domain.Order;
import com.epam.training.fooddelivery.domain.Statistics;

import java.time.LocalDate;
import java.util.List;

public class FoodDeliveryService {

    private DataStore dataStore;

    public FoodDeliveryService(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public List<Order> getOrders(LocalDate startDate, LocalDate endDate) {

    }

    public Order getMostExpensiveOrder() {

    }

    public Food getMostPopularFood() {

    }

    public long getMostLoyalCustomerId() {

    }

    public Statistics getStatistics(LocalDate startDate, LocalDate endDate) {

    }
}
