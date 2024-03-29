package com.trl.chapter_6.factory2;

import javax.enterprise.inject.Produces;

public class EventProducer {

    @Produces
    @ShortMessage
    private MessageA messageAFactory() {
        return new MessageA();
    }

    @Produces
    @LongMessage
    private MessageB messageBFactory() {
        return new MessageB();
    }

}