package Execption;

import java.util.Scanner;

public class Question2 {
    static void getElement(int[] arr,int index){
        try{
            if(arr==null){
                throw new NullPointerException("Array is not initialized!");
            }
            int value = arr[index];
            System.out.println("Element at index " + index + ":"+ value);
        }
        catch (NullPointerException e){
            System.out.println("Error : "+e.getMessage());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
    }

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter size of array");
            int size = input.nextInt();
            int[] arr = new int[size];

            System.out.println("enter element of array");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            System.out.print("Enter index to retrieve: ");
            int index = input.nextInt();

            getElement(arr, index);
    }
}
