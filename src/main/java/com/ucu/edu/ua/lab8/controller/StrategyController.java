package com.ucu.edu.ua.lab8.controller;

import com.ucu.edu.ua.lab8.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/strategies") // Базовий шлях
public class StrategyController {

    private final StrategyService strategyService;

    @Autowired
    public StrategyController(StrategyService strategyService) {
        this.strategyService = strategyService;
    }

    @GetMapping("/payment")
    public List<String> getPaymentStrategies() {
        return strategyService.getPaymentStrategies();
    }

    @GetMapping("/delivery")
    public List<String> getDeliveryStrategies() {
        return strategyService.getDeliveryStrategies();
    }
}