import java.util.Scanner;

class Power {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        if (number <= 0 || power <= 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int result = 1;
			int counter =0;

            while(counter<power) {
                result = result * number;
				counter++;
            }

            System.out.println(result);
        }
    }
}