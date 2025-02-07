package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Games:");
            System.out.println("1. \"The Tanks\"");
            System.out.println("2. \"The Super Mario\"");
            System.out.println("3. Exit");
            System.out.println("Enter a number to start a game");
            int select = Integer.parseInt(input.nextLine());
           if (select == 3) {
               System.out.println("The game finished.");
               run = false;
           } else if (select == 1) {
               System.out.println("\"The Tanks\" is loading...");
           } else if (select == 2) {
               System.out.println("\"The Super Mario\" is loading...");
           } else {
               System.out.println("There is no such a game.");
           }
            System.out.println();
        }
    }
}
