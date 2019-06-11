package com.javagda25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public int readFileAndReturnNumberOfLines(){
        int counter = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            String line;
            while ((line = reader.readLine())!= null){
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println("Liczba linii: " + counter);
        return counter;
    }
}
