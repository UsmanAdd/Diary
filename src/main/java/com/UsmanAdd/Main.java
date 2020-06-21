package com.UsmanAdd;


public class Main {


    public static void main(String[] args) {
        Input choose = new Input();
        Tool tool = new Tool();

        String answer = null;
        String description;
        String text;
        String type = "Консольное приложение";
        String version = "1.0.0";

        System.out.println("\t\tДобро пожаловать! В " + type + " версии " + version);

        while (true) {
            System.out.println("Список действий");
            System.out.println("1) Добавить запись");
            System.out.print("Выберите действие: ");
            answer = choose.input();
            switch (answer) {
                case "1":
                    tool.add();
                    break;
            }
            if (answer.contains("выход")) {
                break;
            }

        }

//
//        Page a = new Page(description,text);
//        a.display();
//        System.out.println();
//        Page b = new Page("А сегодня ничего нового", "Потаюсь написать свой дневник");
//        b.display();
//        System.out.println();
//        Page с = new Page("А сегодня ничего нового", "Потаюсь написать свой дневник");
//        с.display();
    }
}
