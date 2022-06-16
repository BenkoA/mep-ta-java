package com.epam.training.fooddelivery.data;

import com.epam.training.fooddelivery.domain.Food;
import com.epam.training.fooddelivery.domain.Order;
import com.epam.training.fooddelivery.domain.OrderItem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileBasedDataStore implements DataStore{

    private List<Order> orders;

    public FileBasedDataStore(String pathOfFile) throws IOException {
        this.orders = new ArrayList<>();
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader(pathOfFile));

        while ((line = br.readLine()) != null) {  //returns a Boolean value
            String[] orderLine = line.split(",");

            long orderId = Long.parseLong(orderLine[0]);

            Food newFood = new Food(orderLine[3], Food.getPriceForFoodName(orderLine[3]));

            OrderItem orderItem = new OrderItem(newFood, Integer.parseInt(orderLine[1]), new BigDecimal(orderLine[4]));
            List<OrderItem> orderItems = List.of(orderItem);

            long customerId = Long.parseLong(orderLine[1]);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            LocalDateTime orderDate = LocalDateTime.parse(orderLine[2], formatter);

            Order newOrder = new Order(orderId, orderItems, customerId,new BigDecimal("0"),orderDate);

            if (this.orders == null) {
                this.orders = List.of(newOrder);
            }
            else {
                this.orders.add(newOrder);
            }
        }

    }

    @Override
    public List<Order> getOrders() {
        this.orders ->System.out.println(order.)
        System.out.println(this.orders.toString());
        return this.orders;
    }
}
