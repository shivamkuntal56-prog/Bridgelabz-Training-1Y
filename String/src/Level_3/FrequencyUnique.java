package Level_3;

import java.util.Scanner;

public class FrequencyUnique {
    public static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                temp[index++] = ch;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];
        return result;
    }
    public static String[][] frequency(String text) {
        char[] unique = uniqueChars(text);
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = input.nextLine();

        String[][] result = frequency(text);

        System.out.println("CharFrequency");

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + result[i][1]);
    }
}