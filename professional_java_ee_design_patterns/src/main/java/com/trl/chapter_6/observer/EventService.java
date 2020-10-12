package com.trl.chapter_6.observer;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {
    @Inject
    @MyEvent(MyEvent.Type.LOGGING)
    private String messageA;
    @Inject
    @MyEvent(MyEvent.Type.MESSAGE)
    private String messageB;

    public void startService() {
        System.out.println("Start service call " + messageA);
        System.out.println("Start service call " + messageB);
    }
}