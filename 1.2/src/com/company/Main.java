package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream tekst = new FileOutputStream("plik.txt");
            Scanner input = new Scanner(System.in);
            String dane1 = input.nextLine();
            byte[] dane2 = dane1.getBytes();
            tekst.write(dane2);
            tekst.close();
            System.out.println("Dane zostały dodane. Sprawdź plik.");
        } catch (Exception ex) {
            System.out.println("Error!" + ex);
        }
    }
}
