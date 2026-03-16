package Constructor;

import java.util.Scanner;

class Book2 {
    String title;
    String author;
    double price;
    boolean available = true;

    Book2(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed Successfully");
        } else {
            System.out.println("Book Not Available");
        }
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Title: ");
        String t = input.nextLine();

        System.out.print("Enter Author: ");
        String a = input.nextLine();

        System.out.print("Enter Price: ");
        double p = input.nextDouble();

        Book2 b = new Book2(t, a, p);
        b.display();
        b.borrowBook();
        b.display();
    }
}