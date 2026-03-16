package Level_2;

import java.util.Scanner;

public class vote {
    public static int[] getAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }
    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0)
                result[i][1] = "False";
            else if (ages[i] >= 18)
                result[i][1] = "True";
            else
                result[i][1] = "False";
        }
        return result;
    }
    public static void display(String[][] data) {
        System.out.println("\nAge\tCan Vote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
    public static void main(String[] args) {
        int[] ages = getAges(10);

        String[][] result = checkVoting(ages);

        display(result);
    }
}
