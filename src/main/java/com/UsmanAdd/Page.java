package com.UsmanAdd;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Page {
    private static int id = 0;
    private Date date;
    private String description;
    private String text;
    Input write = new Input();
    ArrayList<Page> pages = new ArrayList <Page>();


    public Page(String description, String text) {
        this.id++;
        this.date = Calendar.getInstance().getTime();
        this.description = description;
        this.text = text;
    }

    public Page(){};

    public void add(){
        System.out.print("Введите описание: ");
        description = write.input();
        System.out.print("Введите что с вами произошло: ");
        text = write.input();
        Page page = new Page(description, text);
        pages.add(page);
    }
    @Override
    public String toString() {
        return "Page{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public Date getDate() {
        return date;
    }
}
