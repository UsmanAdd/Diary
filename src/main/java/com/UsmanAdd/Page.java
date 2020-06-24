package com.UsmanAdd;


import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Page{
    private Date date;
    private String description;
    private String text;
    private static File dir;

    Input write = new Input();
    Tool tool = new Tool(dir);

    public Page(String description, String text) {
        this.date = Calendar.getInstance().getTime();
        this.description = description;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Page{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public static void setDir(File dir) {
        Page.dir = dir;
    }

    public Date getDate() {
        return date;
    }


}
