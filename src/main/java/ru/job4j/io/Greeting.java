package ru.job4j.io;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome. What's your name?");
        String name = sc.nextLine();
        System.out.println(name + ", nice to meet you!");
    }
}
