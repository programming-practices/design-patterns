package com.trl.information_expert.a_well_written_program;

import java.util.Arrays;
import java.util.List;

import static com.trl.information_expert.a_well_written_program.OrderItem.countValueTotalGoods;
import static com.trl.information_expert.a_well_written_program.OrderItem.newGoods;

public class Order {

    private List<Double> orderItems = Arrays.asList(
            countValueTotalGoods(newGoods("Manzana", 0.20), 10),
            countValueTotalGoods(newGoods("Patatas", 0.30), 10),
            countValueTotalGoods(newGoods("Platanos", 1.10), 5));

    public Order() {

    }

    public double orderValueTotal(){
        double total = 0;
        for (Double d : orderItems) {
            total = total + d;
        }
        return total;
    }

}
