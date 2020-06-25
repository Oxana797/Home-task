package com.example.demo;

import java.util.Date;


public class TextRecord extends AbstractRecord implements IPrinter {

    private String topic;

    public TextRecord(String author, Date date, Message message, String topic) {
        super(author, date, message);
        this.topic = topic;
    }

    @Override
    public int getRecordSize() {
        return 0;
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
