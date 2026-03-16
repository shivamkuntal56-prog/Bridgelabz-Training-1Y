package Level_2;

import java.util.Scanner;

public class SumOfNatural {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static int sumFormula(int n){
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a natural number : ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number is not a natural number");
            return;
        }
        int sum1= sum(n);
        int sum2 = sumFormula(n);

        System.out.println("sum by recursion : "+sum1);
        System.out.println("sum by formula : "+sum2);

        if(sum1==sum2){
            System.out.println("both are equal");
        }
        else {
            System.out.println("both are not equal");
        }
    }
}