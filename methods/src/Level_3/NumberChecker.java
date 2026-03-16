package Level_3;

import java.util.Scanner;

class NumberChecker {
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int num) {
        int digitsCount = countDigits(num);
        int[] digits = new int[digitsCount];
        for (int i = digitsCount - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num = num / 10;
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        return sum == num;
    }
    public static void largestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
    }
    public static void smallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second Smallest digit: " + secondSmallest);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int digitsCount = NumberChecker.countDigits(num);
        System.out.println("Number of digits: " + digitsCount);

        int[] digits = NumberChecker.storeDigits(num);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        if (NumberChecker.isDuckNumber(digits))
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");

        if (NumberChecker.isArmstrong(num, digits))
            System.out.println("It is an armstrong number");
        else
            System.out.println("It is not an armstrong number");

        NumberChecker.largestSecondLargest(digits);
        NumberChecker.smallestSecondSmallest(digits);
    }
}
