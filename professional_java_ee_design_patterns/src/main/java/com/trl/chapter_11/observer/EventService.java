package com.trl.chapter_11.observer;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {
    @Inject
    Event<String> event;
    @Inject
    private String message;

    public void startService() {
        event.fire("Starting service " + message);
    }
}