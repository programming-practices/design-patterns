package com.trl.chapter_6.factory4;

import com.trl.chapter_6.factory3.Message;

import javax.enterprise.util.AnnotationLiteral;

public class MessageLiteral extends AnnotationLiteral<Message> implements Message {
    private static final long serialVersionUID = 1L;
    private Type type;

    public MessageLiteral(Type type) {
        this.type = type;
    }

    public Type value() {
        return type;
    }
}