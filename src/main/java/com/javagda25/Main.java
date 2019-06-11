package com.javagda25;

public class Main {
    public static void main(String[] args) {

        new MyFileWriter().saveToFile("Hello World!");

        int numberOfLines = new MyFileReader().readFileAndReturnNumberOfLines();
        System.out.println("Liczba linii: " + numberOfLines);
    }
}
