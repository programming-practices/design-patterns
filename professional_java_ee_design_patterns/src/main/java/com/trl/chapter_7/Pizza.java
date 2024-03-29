package com.trl.chapter_7;

public class Pizza implements Order {
    private String label;
    private double price;

    public Pizza(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }
}