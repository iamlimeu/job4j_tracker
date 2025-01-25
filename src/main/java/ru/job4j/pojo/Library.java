package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 1045);
        Book headFirstJava = new Book("Head First Java", 956);
        Book learnHowToCode = new Book("Learn how to code", 1787);
        Book elonMusk = new Book("Elon Musk", 2045);
        Book[] books = new Book[] {cleanCode, headFirstJava, learnHowToCode, elonMusk};
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPageCount() + " pages");
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Replace first book with the last one");
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPageCount() + " pages");
        }
        System.out.println();
        System.out.println("Looking for a book with name \"Clean Code\"");
        for (Book book : books) {
            if ("Clean Code".equals(book.getName())) {
                System.out.println("Found the book. " + book.getName() + " - " + book.getPageCount() + " pages");
            }
        }
    }
}
