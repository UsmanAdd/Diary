package com.UsmanAdd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Tool {
    private String description;
    private String text;
    Input write = new Input();
    ArrayList<Page> pages = new ArrayList<Page>();

    public void add() {
        System.out.print("Введите описание: ");
        description = write.input();
        System.out.print("Введите что с вами произошло: ");
        text = write.input();
        Page page = new Page(description, text);
        File dir = new File("C:\\Users\\User\\Desktop", "pages");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir.getAbsolutePath(), "page1." + description + ".txt");
        try {
            file.createNewFile();
            write.fileWrite(file.getAbsolutePath(), page.getDate(), description, text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
