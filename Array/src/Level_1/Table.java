package Level_1;

import java.util.Scanner;

class Table{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number : ");
        int number = input.nextInt();

        int multiarr[] = new int[5];

        for(int i =6;i<=9;i++){
            multiarr[i] = number*i;
        }
        for(int i=6;i<=9;i++){
            System.out.println(number + " * " + i + " = " + multiarr[i]);
        }

    }
}