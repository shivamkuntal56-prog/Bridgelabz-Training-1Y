package Level_3;

import java.util.Scanner;

public class Frequency {

    public static void frequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        System.out.println("CharFrequency");
        for (int i = 0; i < freq.length; i++) {
            if (chars[i] != '0')
                System.out.println(chars[i] + freq[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = input.nextLine();

        frequency(text);
    }
}