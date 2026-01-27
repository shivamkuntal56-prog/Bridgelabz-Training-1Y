import java.util.Scanner;

   class Divisible {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println("this number is divisible by 5");
        } else {
            System.out.println("this number is not divisible by 5");
        }
    }
}