package de.benklett.aufgabe5;

import java.util.Scanner;

public class Aufgabe5 {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        int input = 1;

        while (input != 0) {
            System.out.println("Gib die zu überprüfende Zahl ein ('0' für Ende):");
            input = sc.nextInt();
            if (isPrim(input))
                System.out.println("Die Zahl ist eine Primzahl");
            else
                System.out.println("Die Zahl ist keine Primzahl");
        }
    }

    static boolean isPrim(int num) {
        if (num <= 2)
            return true;

        if (num % 2 == 0)
            return false;

        for (int i = 3; i < Math.sqrt(num); i+=2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
