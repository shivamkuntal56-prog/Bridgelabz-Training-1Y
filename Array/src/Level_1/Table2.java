package Level_1;

import java.util.Scanner;

class Table2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number");
        int number = input.nextInt();
        int table[] = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        for(int i =1;i<=10;i++){
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}