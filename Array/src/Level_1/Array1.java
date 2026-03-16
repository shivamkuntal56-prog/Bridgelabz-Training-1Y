package Level_1;

import java.util.Scanner;

class TowDToOneD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns is positive.");
            return;
        }
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("1D Array elements:");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
    }
}