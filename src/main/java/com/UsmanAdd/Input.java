package com.UsmanAdd;

import java.io.*;

public class Input {
        public String input (){
            String inputLine = null;
            try {
                BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
                inputLine = bR.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return inputLine;
        }

}
