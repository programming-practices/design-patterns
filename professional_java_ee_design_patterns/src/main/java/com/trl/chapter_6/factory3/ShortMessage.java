package com.trl.chapter_6.factory3;

import javax.enterprise.context.Dependent;

@Message(Message.Type.SHORT)
@Dependent
public class ShortMessage implements MessageType {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}