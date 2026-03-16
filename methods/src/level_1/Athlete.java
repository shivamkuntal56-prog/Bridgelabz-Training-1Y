package level_1;

import java.util.Scanner;

public class Athlete {
    public static int rounds(int side1,int side2,int side3){
        int perimeter = side1+side2+side3;
        int rounds = 5000/perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter side1 :");
        int side1 = input.nextInt();
        System.out.println("enter side2 :");
        int side2 = input.nextInt();
        System.out.println("enter side3 :");
        int side3 = input.nextInt();

        int output = rounds(side1,side2,side3);
        System.out.println(output);
    }
}
