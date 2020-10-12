package com.trl.chapter_2;

import javax.inject.Inject;

public class Service {
    @Inject
    private Message message;

    public void showMessage() {
        System.out.println(message.getMessage());
    }
}