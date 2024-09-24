package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ROWS = 10; // Spielfeldgröße
        int COLS = 15;

        int roboRows = 0; // Roboterkoordinaten
        int roboCols = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println( // welcome Screen
                        "================================\n" +
                        "         Willkommen bei         \n" +
                        "            ROBOWARS            \n" +
                        "================================\n" +
                        "  ,__,_,\n" +
                        "  [_|_/ \n" +
                        "   //\n" +
                        " _//    __\n" +
                        "(_|)   |@@|\n" +
                        " \\ \\__ \\--/ __\n" +
                        "  \\o__|----|  |   __\n" +
                        "      \\ }{ /\\ )_ / _\\\n" +
                        "      /\\__/\\ \\__O (__\n" +
                        "     (--/\\--)    \\__/\n" +
                        "     _)(  )(_\n" +
                        "    `---''---`\n" +
                        "================================\n" +
                        "      Bereit für den Kampf?     \n" +
                        "================================\n");

        System.out.println("Was ist dein Name Krieger?"); // Spielername
        String playerName = scanner.nextLine();

        System.out.println("\nWillkommen " + playerName + ", wie soll deiner Kampfmaschiene heißen?"); // Robotername
        String roboName = scanner.nextLine();

        System.out.println("\nNa los " + playerName + ", krall dir " + roboName + " und auf in den Kampf!"); // Begrüßung



        // Spielfeld
        int i = 0;
        while (i < ROWS) { // Hochzählung ROWS
            int j = 0;

            while (j < COLS) { // Hochzählung COLS
                int tempRoboRow = roboRows;
                int tempRoboCol = roboCols;

                System.out.print("[");
                String inhalt = "  ";

                while (i == tempRoboRow) {
                    while (j == tempRoboCol) { // Wenn Roboterkoordinaten x & y, wird der leere String überschrieben
                        inhalt = "\uD83E\uDD16"; // Robotersymbol
                        tempRoboCol++; // tempRoboCol++ damit aus der schleife rausgegangen wird
                    }
                    tempRoboRow++; // tempRoboRow++ damit aus der schleife rausgegangen wird
                }

                System.out.print(inhalt + "]");
                j++; // j++ zum Hochzählen

            }
            System.out.println(); // Übersprung in die nächste Zeile
            i++; // i++ zum Hochählen

        }
    }
}