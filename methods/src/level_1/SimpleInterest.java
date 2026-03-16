package level_1;

import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSimpleInterest(double principal ,double rate ,double time){
        double simple = (principal * rate * time) /100;
        return simple;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter principal : ");
        double principal = input.nextInt();
        System.out.println("enter rate : ");
        double rate = input.nextInt();
        System.out.println("enter time : ");
        double time = input.nextInt();

        double output = calculateSimpleInterest(principal,rate,time);
        System.out.println("The Simple Interest is " + output +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}