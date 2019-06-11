package com.javagda25;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // data.txt
        // nowy branch plik_odczyt
        // otwieramy plik do odczytu, zliczamy linie i wyspisujemy wynik.
        // zatwierdzamy zmiany i wysyłamy nowy branch
        int counter = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            String line;
            while ((line = reader.readLine())!= null){
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Liczba linii: " + counter);
    }
}
