package com.example.demo;

import java.util.Date;


public abstract class AbstractRecord {
    private String author;
    private Date date;
    private Message message;


    public AbstractRecord(String author, Date date, Message message) {
        this.author = author;
        this.date = date;
        this.message = message;
    }

    public abstract int getRecordSize();

    @Override
    public String toString() {
        return "Record{"
                + "author=" + author + '\'
                + ", date=" + date
                + ", message=" + message
                + '}';
    }



}
