package level_1;

import java.util.Scanner;

public class Handshake {
    public static int calculateHandshakes(int numberOfStudent) {
        int handShake = (numberOfStudent * (numberOfStudent - 1)) / 2;
        return handShake;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of students : ");
        int students = input.nextInt();

        int output = calculateHandshakes(students);
        System.out.println(output);
    }
}