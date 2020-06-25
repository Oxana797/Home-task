package com.example.demo;

import java.io.File;
import java.util.Date;


public class Audio extends MediaRecord implements IPlayer{

    private File audio;

    public Audio(String author, Date date, Message message, String extension, File file) {
        super(author, date, message, extension);
        this.audio = file;
    }

    @Override
    public void play(File file) {
        System.out.println(file.getName());
    }
}
