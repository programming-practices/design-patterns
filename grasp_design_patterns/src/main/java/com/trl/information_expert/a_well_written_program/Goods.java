package com.trl.information_expert.a_well_written_program;

public class Goods {

    private String nameGoods;
    private double priceGoods;

    public Goods(String nameGoods, double priceGoods) {
        this.nameGoods = nameGoods;
        this.priceGoods = priceGoods;
    }

    public double getPriceGoods() {
        return this.priceGoods;
    }

    public String getNameGoods() {

        return this.nameGoods;
    }

}
