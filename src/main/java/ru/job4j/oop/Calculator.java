package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperations(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5);
        System.out.println("Multiplication operation: " + result);
        result = sum(10);
        System.out.println("Addition operation: " + result);
        result = minus(25);
        System.out.println("Subtraction operation: " + result);
        result = calculator.divide(60);
        System.out.println("Division operation: " + result);
        result = calculator.sumAllOperations(5);
        System.out.println("Sum of all operations: " + result);
    }
}
