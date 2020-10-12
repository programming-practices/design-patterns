package com.trl.chapter_6.factory2;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ClientMessage {

    @Inject
    @ShortMessage
    private MessageA messageA;

    @Inject
    @LongMessage
    private MessageB messageB;

    public void doEvent() {
        messageA.setMessage("This is a long email message.");
        messageB.setMessage("This is a short SMS message.");
        System.out.println(messageA.getMessage());
        System.out.println(messageB.getMessage());
    }
}