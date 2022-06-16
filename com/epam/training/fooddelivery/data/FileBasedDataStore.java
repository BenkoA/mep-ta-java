package com.epam.training.fooddelivery.data;

import com.epam.training.fooddelivery.domain.Order;
import java.util.List;

public class FileBasedDataStore implements DataStore{

    private List<Order> orders;

    public FileBasedDataStore(String pathOfFile) {

    }

    @Override
    public List<Order> getOrders() {
        return this.orders;
    }
}
