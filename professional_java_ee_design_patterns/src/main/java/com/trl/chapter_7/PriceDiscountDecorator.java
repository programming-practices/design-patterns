package com.trl.chapter_7;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class PriceDiscountDecorator implements Product {
    @Any
    @Inject
    @Delegate
    private Product product;

    public String generateLabel() {
        product.setPrice(product.getPrice() * 0.5);
        product.setLabel(product.getLabel() + " (Discounted)");
        return product.generateLabel();
    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public void setLabel(String label) {
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {
    }
}
