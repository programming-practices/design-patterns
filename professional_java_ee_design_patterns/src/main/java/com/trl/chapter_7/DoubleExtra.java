package com.trl.chapter_7;

public class DoubleExtra extends Extra {
    public DoubleExtra(String label, double price, Order order) {
        super(label, price, order);
    }

    public double getPrice() {
        return (this.price * 2) + order.getPrice();
    }

    public String getLabel() {
        return order.getLabel() + ", Double " + this.label;
    }
}


/*
Order fourSeasonsPizza = new Pizza("Four Seasons Pizza", 10);
fourSeasonsPizza = new RegularExtra("Pepperoni", 4, fourSeasonsPizza );
fourSeasonsPizza = new DoubleExtra("Mozzarella", 2, fourSeasonsPizza );
fourSeasonsPizza = new NoCostExtra("Chili", 2, fourSeasonsPizza );
System.out.println(fourSeasonsPizza.getPrice());
System.out.println(fourSeasonsPizza.getLabel());
*/