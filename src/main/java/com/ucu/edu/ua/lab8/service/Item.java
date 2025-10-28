package com.ucu.edu.ua.lab8.service;

public abstract class Item {
    public String getDescription() {
        return "Item";
    }

    public abstract double price();
}