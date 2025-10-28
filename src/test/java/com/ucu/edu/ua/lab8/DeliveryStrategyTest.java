package com.ucu.edu.ua.lab8;

import com.ucu.edu.ua.lab8.service.Item;
import com.ucu.edu.ua.lab8.strategies.delivery.DHLDeliveryStrategy;
import com.ucu.edu.ua.lab8.strategies.delivery.Delivery;
import com.ucu.edu.ua.lab8.strategies.delivery.PostDeliveryStrategy;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryStrategyTest {

    private List<Item> items = new ArrayList<>(); 

    @Test
    public void testPostDelivery() {
        Delivery strategy = new PostDeliveryStrategy();
        String result = strategy.deliver(items);
        assertEquals("Delivering 0 items by post.", result);
    }

    @Test
    public void testDHLDelivery() {
        Delivery strategy = new DHLDeliveryStrategy();
        String result = strategy.deliver(items);
        assertEquals("Delivering 0 items by DHL.", result);
    }
}