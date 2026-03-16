package Level_1;

import java.util.Scanner;

class FizzBuzz {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("enter a positive integer");
            return;
        }
        String result[] = new String[number+1];

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }
        for (int i = 1; i <= number; i++) {
            System.out.println( i + " = " + result[i]);
        }
    }
}