package com.trl.chapter_11;

import com.trl.chapter_11.observer.MessageEvent;
import com.trl.chapter_11.observer.MessageEvent.Type;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {
    @Inject
    @MessageEvent(Type.SERVICE)
    Event<String> serviceEvent;
    @Inject
    @MessageEvent(Type.PARAMETER)
    Event<String> parameterEvent;
    @Inject
    private String message;

    public void startService() {
        serviceEvent.fire("Starting service " + message);
        parameterEvent.fire("‐d ‐p");
    }
}