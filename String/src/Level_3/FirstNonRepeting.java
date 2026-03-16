package Level_3;

import java.util.Scanner;

public class FirstNonRepeting {
    public static char findFirstNonRepeat(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);
        }
        return '0';
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = input.nextLine();

        char result = findFirstNonRepeat(text);

        if (result != '0')
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No non-repeating character found");
    }
}