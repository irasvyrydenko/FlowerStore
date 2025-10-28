package com.ucu.edu.ua.lab8.strategies.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(Double price) {
        return "Paying " + price + " using PayPal.";
    }
}