package com.trl.chapter_6.factory4;

import com.trl.chapter_6.factory3.Message;
import com.trl.chapter_6.factory3.MessageType;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@Dependent
public class MessageFactory {
    @Inject
    @Any
    private Instance<MessageType> messages;

    public MessageType getMessage(Message.Type type) {
        MessageLiteral literal = new MessageLiteral(type);
        Instance<MessageType> typeMessages = messages.select(literal);
        return typeMessages.get();
    }
}
