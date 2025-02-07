package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("I am the great Oracle. What do you want to know?");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);

        switch (answer) {
            case 1 -> System.out.println("Yes");
            case 2 -> System.out.println("No");
            default -> System.out.println("Maybe");
        }
    }
}
