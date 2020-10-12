package com.trl.chapter_14.mvc.plain;

public class AbstractActionFactory {
    private final static ActionFactory instance = new ActionFactory();

    public static ActionFactory getInstance() {
        return instance;
    }
}

