package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void sing(String lyrics) {
        System.out.println("I can sing a song: " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe I can fly";
        petya.music();
        petya.music();
        petya.music();
        petya.sing(song);

    }
}
