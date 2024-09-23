package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {

    private static final int ROWS = 10;
    private static final int COLS = 15;

    private static int roboRows = 0;
    private static int roboCols = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
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

        System.out.println("Was ist dein Name Krieger?");
        String playerName = scanner.nextLine();

        System.out.println("\nWillkommen " + playerName + ", wie soll deiner Kampfmaschiene heißen?");
        String roboName = scanner.nextLine();

        System.out.println("\nNa los " + playerName + ", krall dir " + roboName + " und auf in den Kampf!");


        int i = 0;
        while (i < ROWS) {
            int j = 0;

            while (j < COLS) {
                int tempRoboRow = roboRows;
                int tempRoboCol = roboCols;

                System.out.print("[");
                String inhalt = " ";

                while (i == tempRoboRow) {
                    while (j == tempRoboCol) {
                        inhalt = "a";
                        tempRoboCol++;
                    }
                    tempRoboRow++;
                }

                System.out.print(inhalt + "]");
                j++;

            }
            System.out.println();
            i++;

        }
    }
}