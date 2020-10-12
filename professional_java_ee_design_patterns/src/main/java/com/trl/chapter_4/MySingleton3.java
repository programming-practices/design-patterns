package com.trl.chapter_4;

public class MySingleton3 {

    private final static MySingleton3 instance = new MySingleton3();

    private MySingleton3() {
    }

    public static MySingleton3 getInstance() {
        return instance;
    }
}
