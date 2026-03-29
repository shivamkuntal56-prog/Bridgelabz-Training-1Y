package Execption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {
    static void divide(int num1,int num2) {
        try {
         if(num2==0){
             throw new ArithmeticException("can not divide by zero");
         }
         double result = (double) num1 /num2;
            System.out.println("result : "+result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception : "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("enter num1");
            int num1 = input.nextInt();
            System.out.println("enter num2");
            int num2 = input.nextInt();
            divide(num1, num2);
        }
        catch (InputMismatchException e){
            System.out.println("enter only numbers");
        }
    }
}
