package com.ucu.edu.ua.lab8.strategies.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(Double price) {
        return "Paying " + price + " using credit card.";
    }
}