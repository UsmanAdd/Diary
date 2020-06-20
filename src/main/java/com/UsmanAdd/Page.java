package com.UsmanAdd;

import java.util.Calendar;
import java.util.Date;

public class Page {
    private static int id = 0;
    private Date date;
    private String description;
    private String text;

    public Page(String description, String text) {
        this.id++;
        this.date = Calendar.getInstance().getTime();
        this.description = description;
        this.text = text;
    }

    public void display() {
        System.out.println("Страница: " + id);
        System.out.println("Дата: " + date);
        System.out.println(description);
        System.out.println(text);
    }
}
