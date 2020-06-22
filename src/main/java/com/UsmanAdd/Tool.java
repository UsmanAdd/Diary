package com.UsmanAdd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Tool {
    private String description;
    private String text;
    private File dir;
    private int numberOfFile = 0;
    Input write = new Input();
    ArrayList<File> files = new ArrayList<File>();

    public Tool(File dir) {
        this.dir = dir;
        if (dir.listFiles().length != 0) {
            this.numberOfFile = dir.listFiles().length;
            for (File file : dir.listFiles()) {
                files.add(file);
            }
        }
    }

    public void add() {
        System.out.print("Введите описание: ");
        description = write.input();
        System.out.print("Введите что с вами произошло: ");
        text = write.input();
        Page page = new Page(description, text);
        Page.setId(numberOfFile);
        File file = new File(dir.getAbsolutePath(), (page.getId() + 1) + "." + description + ".txt");
        try {
            file.createNewFile();
            files.add(file);
            this.numberOfFile++;
            write.fileWrite(file.getAbsolutePath(), page.getDate(), description, text);
            System.out.println("Запись успешно создана!");
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void read() {
        int i = 1;
        int numberOfNote;
        String number;
        Input write = new Input();
        Output output = new Output();

        if (!dir.exists() || dir.listFiles().length == 0) {
            System.out.println("Увы, к сожалению записей пока нет");
            System.out.println();
        } else {
            System.out.println("Ваши записи:");
            for (File file : dir.listFiles()) {
                System.out.println(i + ") " + file.getName());
                i++;
            }
            this.numberOfFile = dir.listFiles().length;
            Page.setId(numberOfFile);
            System.out.print("Введите номер файла: ");
            number = write.input();
            numberOfNote = Integer.parseInt(number);
            System.out.println();
            output.read(files.get(numberOfNote - 1).getAbsolutePath());

        }

    }

    public void delete() {

    }

}
