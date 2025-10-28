package com.ucu.edu.ua.lab8.strategies.delivery;

import java.util.List;

import com.ucu.edu.ua.lab8.service.Item;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        return "Delivering " + items.size() + " items by post.";
    }
}
