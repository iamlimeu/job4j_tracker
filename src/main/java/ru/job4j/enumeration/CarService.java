package ru.job4j.enumeration;

import java.util.Arrays;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Toyota status: " + toyota);
        System.out.println("Volvo status: " + volvo);
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Status name: " + s.name() + " , status number: " + s.ordinal());
        }
    }
}
