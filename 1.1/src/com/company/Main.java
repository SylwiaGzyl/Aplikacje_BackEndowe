package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream tekst = new FileInputStream("plik.txt");
            Scanner in = new Scanner(tekst);

            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }
        }

        finally
        {

        }
    }
}
