package com.example.demo;


import java.util.Date;

public class MediaRecord extends AbstractRecord {

    private String extension;

    public MediaRecord(String author, Date date, Message message, String extension) {
        super(author, date, message);
        this.extension = extension;
    }

    @Override
    public int getRecordSize() {
        return 0;
    }
}
