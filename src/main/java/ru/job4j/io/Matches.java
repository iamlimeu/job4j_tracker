package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The 11 Game");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "First player" : "Second player";
            System.out.println(player + " enter any number from 1 to 3.");
            int matches = Integer.parseInt(input.nextLine());
            if ((matches >= 1 && matches <= 3) && (count >= matches)) {
                count -= matches;
                System.out.println("Remaining amount: " + count);
                turn = !turn;
            } else {
                System.out.println(player + " entered an invalid input. Valid input is from 1 to 3. "
                        + "Remember to enter number that not greater than remaining amount: " + count);
            }
        }
        if (!turn) {
            System.out.println("First player won! Congrats!");
        } else {
            System.out.println("Second player won! Congrats!");
        }
    }
}
