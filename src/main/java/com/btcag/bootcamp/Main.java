package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {

    private static final int ROWS = 10;
    private static final int COLS = 15;

    private static int roboRows = 8;
    private static int roboCols = 13;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // welcomeScreen();

        System.out.println("Was ist dein Name Krieger?");
        String playerName = scanner.nextLine();

        System.out.println("\nWillkommen " + playerName + ", wie soll deiner Kampfmaschiene heißen?");
        String roboName = scanner.nextLine();

        System.out.println("\nDann auf in den Kampf!");

       // field();

    }

}
