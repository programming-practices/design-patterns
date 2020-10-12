package com.trl.chapter_7;

@ClearanceSale
public class Plate implements Product {
    private String label = "Plate";
    private double price = 50.00;

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
