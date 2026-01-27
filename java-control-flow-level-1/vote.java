import java.util.Scanner;

    class Voter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you can't vote");
        }
    }
}