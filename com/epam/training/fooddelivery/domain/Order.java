package com.epam.training.fooddelivery.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private long id;
    private List<OrderItem> orderItems;
    private long customerId;
    private BigDecimal totalPrice;
    private LocalDateTime orderDate;

    public Order(long id, List<OrderItem> orderItems, long customerId, BigDecimal totalPrice, LocalDateTime orderDate) {
        this.id = id;
        this.orderItems = orderItems;
        this.customerId = customerId;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderItems=" + orderItems +
                ", customerId=" + customerId +
                ", totalPrice=" + totalPrice +
                ", orderDate=" + orderDate +
                '}';
    }
}
