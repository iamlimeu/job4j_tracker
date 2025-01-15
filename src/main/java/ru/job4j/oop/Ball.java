package ru.job4j.oop;

public class Ball {

    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("The ball has been eaten");
        } else {
            System.out.println("The ball was able to run away");
        }
    }
}
