package com.epam.training.fooddelivery.service;

import com.epam.training.fooddelivery.data.DataStore;
import com.epam.training.fooddelivery.data.FileBasedDataStore;
import com.epam.training.fooddelivery.domain.Food;
import com.epam.training.fooddelivery.domain.Order;
import com.epam.training.fooddelivery.domain.Statistics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class FoodDeliveryService {

    private DataStore dataStore;

    public FoodDeliveryService(DataStore dataStore) throws IOException {
        this.dataStore = new FileBasedDataStore("com/epam/training/fooddelivery/data/order.csv");
    }

    public List<Order> getOrders(LocalDate startDate, LocalDate endDate) {
        return this.dataStore.getOrders();
    }

    public Order getMostExpensiveOrder() {
        return null;
    }

    public Food getMostPopularFood() {
        return null;
    }

    public long getMostLoyalCustomerId() {
        return (long) 1.22;
    }

    public Statistics getStatistics(LocalDate startDate, LocalDate endDate) {
        return null;
    }
}
