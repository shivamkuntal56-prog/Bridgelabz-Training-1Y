package Level_3;

import java.util.Scanner;

class Factor{
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    public static int greatestFactor(int[] factors) {
        int max = factors[0];

        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static double productCubeFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int[] factors = Factor.findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println();

        System.out.println("Greatest Factor: " + Factor.greatestFactor(factors));
        System.out.println("Sum of Factors: " + Factor.sumFactors(factors));
        System.out.println("Product of Factors: " + Factor.productFactors(factors));
        System.out.println("Product of Cube of Factors: " + Factor.productCubeFactors(factors));
    }
}