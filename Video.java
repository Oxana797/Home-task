package com.example.demo;

import java.io.File;
import java.util.Date;


public class Video extends MediaRecord implements IPlayer {

    private File video;

    public Video(String author, Date date, Message message, String extension, File file) {
        super(author, date, message, extension);
        this.video = file;
    }

    @Override
    public void play(File file) {
        System.out.println(file.getName();
    }

