package com.trl.chapter_6.observer;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventServiceName {

    @Inject
    @Named("Logging")
    private String messageA;

    @Inject
    @Named("Message")
    private String messageB;

    public void startService() {
        System.out.println("Start service call " + messageA);
        System.out.println("Start service call " + messageB);
    }
}
