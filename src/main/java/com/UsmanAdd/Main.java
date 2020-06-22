package com.UsmanAdd;


import java.io.File;

public class Main {


    public static void main(String[] args) {
        Input choose = new Input();
        File dir = new File("C:\\Users\\User\\Desktop", "pages");
        if (!dir.exists()) {
            dir.mkdir();
        }
        Tool tool = new Tool(dir);
        Page.setDir(dir);

        String answer = null;
        String description;
        String text;
        String type = "Консольное приложение";
        String version = "1.0.0";

        System.out.println("\t\tДобро пожаловать! В " + type + " версии " + version);

        while (true) {
            System.out.println("Список действий");
            System.out.println("1) Добавить запись");
            System.out.println("2) Прочитать запись");
            System.out.println("3) Удалить запись");
            System.out.print("Выберите действие: ");
            answer = choose.input();
            System.out.println();
            switch (answer) {
                case "1":
                    tool.add();
                    break;
                case "2":
                    tool.read();
                    break;
                case "3":
                    tool.delete();
                    break;
            }
            if (answer.contains("выход")) {
                System.out.println("Всего хорошего!");
                break;
            }

        }

    }
}
