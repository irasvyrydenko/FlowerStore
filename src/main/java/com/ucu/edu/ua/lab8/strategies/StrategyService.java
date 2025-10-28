package com.ucu.edu.ua.lab8.strategies;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StrategyService {

    public List<String> getPaymentStrategies() {
        // У реальному проекті це могло б завантажуватися з конфігурації
        return List.of("PayPal", "CreditCard");
    }

    public List<String> getDeliveryStrategies() {
        return List.of("Post", "DHL");
    }
}