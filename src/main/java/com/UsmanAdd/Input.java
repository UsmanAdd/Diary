package com.UsmanAdd;

import java.io.*;
import java.util.Date;

public class Input {
    public String input() {
        String inputLine = null;
        try {
            BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
            inputLine = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLine;
    }

    public void fileWrite(String fileName, Date date, String description, String text) {
        try {
            BufferedWriter bW = new BufferedWriter(new FileWriter(fileName, false));
            bW.write("Дата: " + date);
            bW.newLine();
            bW.write("Описание: " + description);
            bW.newLine();
            bW.newLine();
            bW.write(text);
            bW.flush();
            bW.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
