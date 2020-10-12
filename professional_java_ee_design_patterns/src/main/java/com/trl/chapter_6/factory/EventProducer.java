package com.trl.chapter_6.factory;

import javax.enterprise.inject.Produces;

public class EventProducer {
    @Produces
    public MessageA messageAFactory() {
        return new MessageA();
    }

    @Produces
    public MessageB messageBFactory() {
        return new MessageB();
    }
}