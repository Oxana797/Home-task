package com.example.demo;

import java.io.File;
import java.util.Date;


public class Picture extends MediaRecord {

    private File image;

    public Picture(String author, Date date, Message message, String extension, File image) {
        super(author, date, message, extension);
        this.image = image;
    }
}
