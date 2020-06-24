package com.UsmanAdd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Output {

    public void read (String file){
        try {
            BufferedReader bR = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("########################################");
            while ((line = bR.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("########################################");
            System.out.println();
            bR.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    };

}
