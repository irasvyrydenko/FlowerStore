package com.ucu.edu.ua.lab8.service;

import com.ucu.edu.ua.lab8.service.Item;
import com.ucu.edu.ua.lab8.strategies.delivery.Delivery;
import com.ucu.edu.ua.lab8.strategies.payment.Payment;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private List<Item> items = new LinkedList<>();
    private Payment paymentStrategy;
    private Delivery deliveryStrategy;

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public void processOrder() {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy is not set!");
            return;
        }
        
        double price = calculateTotalPrice();
        System.out.println("Total price: " + price);
    }
}
