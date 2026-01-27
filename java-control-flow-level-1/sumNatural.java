import java.util.Scanner;

class SumNatural {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            int formula = number * (number + 1) / 2;

            if (formula == sum) {
                System.out.println("Total sum: " + sum);
            } else {
                System.out.println("logic error.");
            }
        }
    }
}