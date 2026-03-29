package Execption;

import java.util.Scanner;

public class Question4 {
    public static void division(int a,int b){
        try {
            if(b==0){
                System.out.println("can not divide by zero");
            }
            double result = (double) a /b;
            System.out.println("Result : "+result);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Operation completed");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = input.nextInt();
        System.out.println("enter b : ");
        int b = input.nextInt();
        division(a,b);
    }
}
