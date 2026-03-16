package Level_3;

import java.util.Random;

class MatrixMatuplation {
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // values 0–9
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] matrix1 = MatrixMatuplation.createRandomMatrix(rows, cols);
        int[][] matrix2 = MatrixMatuplation.createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        MatrixMatuplation.printMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        MatrixMatuplation.printMatrix(matrix2);

        System.out.println("\nAddition:");
        MatrixMatuplation.printMatrix(MatrixMatuplation.addMatrix(matrix1, matrix2));

        System.out.println("\nSubtraction:");
        MatrixMatuplation.printMatrix(MatrixMatuplation.subtractMatrix(matrix1, matrix2));

        System.out.println("\nMultiplication:");
        MatrixMatuplation.printMatrix(MatrixMatuplation.multiplyMatrix(matrix1, matrix2));
    }
}
