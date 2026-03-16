package Constructor;

import java.util.Scanner;

class Circle {
    double radius;

    Circle() {
        this(1.0);
    }
    Circle(double r) {
        radius = r;
    }
    void display() {
        System.out.println("Radius: " + radius);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = input.nextDouble();
        Circle c1 = new Circle();
        Circle c2 = new Circle(r);

        System.out.println("Default Circle:");
        c1.display();
        System.out.println("User Circle:");
        c2.display();
    }
}