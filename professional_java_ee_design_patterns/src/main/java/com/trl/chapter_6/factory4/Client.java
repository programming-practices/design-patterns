package com.trl.chapter_6.factory4;

import com.trl.chapter_6.factory3.Message;
import com.trl.chapter_6.factory3.MessageType;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
@ApplicationScoped
public class Client {
    @Inject
    MessageFactory mf;

    public void doMessage() {
        MessageType m = mf.getMessage(Message.Type.SHORT);
        m.setMessage("This is a short message");
        System.out.println(m.getMessage());
        m = mf.getMessage(Message.Type.LONG);
        m.setMessage("This is a long message");
        System.out.println(m.getMessage());
    }
}
