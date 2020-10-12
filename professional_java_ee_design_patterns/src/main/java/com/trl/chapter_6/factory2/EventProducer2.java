package com.trl.chapter_6.factory2;

import com.trl.chapter_6.observer.MyEvent;

import javax.enterprise.inject.Produces;

// LISTING 6‐21
public class EventProducer2 {
    @Produces
    @MyEvent(MyEvent.Type.LOGGING)
    public String messageAFactory() {
        return "A message";
    }

    @Produces
    @MyEvent(MyEvent.Type.MESSAGE)
    public String messageBFactory() {
        return "Another message";
    }
}
