package Constructor;

import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
    Person(Person p) {
        name = p.name;
        age = p.age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        Person p1 = new Person(name, age);
        Person p2 = new Person(p1);
        System.out.println("\nOriginal Person:");
        p1.display();
        System.out.println("\nCopied Person:");
        p2.display();
    }
}