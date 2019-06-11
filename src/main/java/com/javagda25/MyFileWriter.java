package com.javagda25;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {
    public void saveToFile(String line){
        try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt", true))) {
            writer.println(line);
        } catch (IOException e) {
            System.err.println("Error, unable to open this file and write to it.");
        }
    }
}
