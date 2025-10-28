package com.ucu.edu.ua.lab8.strategies.delivery;
import java.util.List;

import com.ucu.edu.ua.lab8.service.Item;
public interface Delivery {
    String deliver(List<Item> items);
}
