package Level_2;

import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int year){
        if(year<1582){
            System.out.println("enter leap year greater than 1581");
        }
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter year : ");
        int year = input.nextInt();

        boolean output = checkLeapYear(year);

        if(output){
            System.out.println("this year is a leap year ");
        }
        else {
            System.out.println("this year is not a leap year");
        }
    }
}