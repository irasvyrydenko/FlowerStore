package com.ucu.edu.ua.lab8;

import org.junit.jupiter.api.Test;

import com.ucu.edu.ua.lab8.strategies.payment.CreditCardPaymentStrategy;
import com.ucu.edu.ua.lab8.strategies.payment.PayPalPaymentStrategy;
import com.ucu.edu.ua.lab8.strategies.payment.Payment;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentStrategyTest {

    @Test
    public void testCreditCardPayment() {
        Payment strategy = new CreditCardPaymentStrategy();
        String result = strategy.pay(150.75);
        assertEquals("Paying 150.75 using credit card.", result);
    }

    @Test
    public void testPayPalPayment() {
        Payment strategy = new PayPalPaymentStrategy();
        String result = strategy.pay(80.0);
        assertEquals("Paying 80.0 using PayPal.", result);
    }
}