package com.trl.information_expert.poorly_written_program;

public class OrderItem {

    public OrderItem() { }
    
    public static Goods newGoods (String name, double price){
        return new Goods(name,price);
    }

}
