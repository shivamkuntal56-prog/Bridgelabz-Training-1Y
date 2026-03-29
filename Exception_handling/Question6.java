package Execption;

import java.util.Scanner;

public class Question6 {
    public static void nestedTry(int[] arr,int divisor,int index){
           try {
               int value = arr[index];
               try {
                   if (divisor == 0) {
                       System.out.println("can not divide by zero");
                   }
                   int result = value / divisor;
                   System.out.println("result : " + result);
               } catch (ArithmeticException e) {
                   System.out.println(e.getMessage());
               }
           }
           catch (IndexOutOfBoundsException e){
               System.out.println("Error: Invalid array index");
           }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter element of array : ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter index: ");
        int index = input.nextInt();
        System.out.println("enter divisor");
        int divisor = input.nextInt();
        nestedTry(arr,divisor,index);
    }
}
