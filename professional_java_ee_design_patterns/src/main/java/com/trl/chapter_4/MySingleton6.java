package com.trl.chapter_4;

public class MySingleton6 {

    private volatile MySingleton6 instance;

    private MySingleton6() {
    }

    public MySingleton6 getInstance() {
        if (instance == null) { // 1
            synchronized (MySingleton6.class) {
                if (instance == null) { // 2
                    instance = new MySingleton6();
                }
            }
        }
        return instance;
    }
}
