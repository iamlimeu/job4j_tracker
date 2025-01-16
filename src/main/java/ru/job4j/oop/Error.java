package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() { }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println("Error status: " + active);
        System.out.println("Error number " + status);
        System.out.println("Error message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error noError = new Error(true, 0, "No error detected.");
        Error yesError = new Error(false, 404, "Page not found.");
        error.showInfo();
        noError.showInfo();
        yesError.showInfo();
    }
}
