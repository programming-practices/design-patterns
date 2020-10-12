package com.trl.chapter_7;

public class Table implements Product {
    private String label = "Dining Table";
    private double price = 100.00;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String generateLabel() {
        return price + ", " + label;
    }
}