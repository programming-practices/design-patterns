package com.trl.chapter_7;

public interface Product {
    String getLabel();

    void setLabel(String label);

    double getPrice();

    void setPrice(double price);

    String generateLabel();
}