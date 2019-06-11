package com.javagda25;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        // data.txt
        // Zapisz linię "Hello world!" (w trybie append)

        try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt", true))) {
            writer.println("Hello World!");
        } catch (IOException e) {
            System.err.println("Error, unable to open this file and write to it.");
        }
    }
}
