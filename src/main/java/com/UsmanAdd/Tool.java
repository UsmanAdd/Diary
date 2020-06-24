package com.UsmanAdd;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Tool {
    private String description;
    private String text;
    private File dir;
    private int numberOfFile = 0;
    Input write = new Input();
    Output output = new Output();
    ArrayList<File> files = new ArrayList<File>();

    public Tool(File dir) {
        this.dir = dir;
        if (dir.listFiles().length != 0) {
            this.numberOfFile = dir.listFiles().length;
            for (File file : dir.listFiles()) {
                files.add(file);
            }

            Collections.sort(files, new Comparator<File>() {
                public int compare(File f1, File f2) {
                    return Long.compare(f1.lastModified(), f2.lastModified());
                }
            });
        }
    }

    public void add() {
        System.out.print("Введите описание: ");
        description = write.input();
        System.out.print("Введите что с вами произошло: ");
        text = write.input();
        Page page = new Page(description, text);
        File file = new File(dir.getAbsolutePath(), description + ".txt");
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
        int numberOfNote;
        String number;

        if (!dir.exists() || dir.listFiles().length == 0) {
            System.out.println("Увы, к сожалению записей пока нет");
            System.out.println();
        } else {
            list();
            this.numberOfFile = dir.listFiles().length;
            System.out.print("Введите номер файла: ");
            number = write.input();
            numberOfNote = Integer.parseInt(number);
            System.out.println();
            output.read(files.get(numberOfNote - 1).getAbsolutePath());

        }

    }

    public void delete() {
        String number;
        int numberOfNote;
        if (!dir.exists() || dir.listFiles().length == 0) {
            System.out.println("Увы, к сожалению записей пока нет");
            System.out.println();
        } else {
            list();
            System.out.println("Введите номер файла, который вы собираетесь удалить");
            number = write.input();
            numberOfNote = Integer.parseInt(number);
            System.out.println();
            File file = new File(files.get(numberOfNote - 1).getAbsolutePath());
            if (file.delete()) System.out.println("Запись успешно удалена\n");
            files.remove(numberOfNote - 1);
        }
    }

    private void list() {
        int i = 1;
        System.out.println("Ваши записи:");
        for (File file : files) {
            System.out.println(i + ") " + file.getName());
            i++;
        }
    }
}
