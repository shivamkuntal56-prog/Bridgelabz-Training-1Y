package Constructor;

import java.util.Scanner;

class BOOK {
    String title;
    String author;
    double price;

    BOOK() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }
    BOOK(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Title: ");
        String t = input.nextLine();

        System.out.print("Enter Author: ");
        String a = input.nextLine();

        System.out.print("Enter Price: ");
        double p = input.nextDouble();

        BOOK b1 = new BOOK();
        BOOK b2 = new BOOK(t, a, p);
        System.out.println("\nDefault Book:");
        b1.display();
        System.out.println("\nUser Book:");
        b2.display();
    }
}