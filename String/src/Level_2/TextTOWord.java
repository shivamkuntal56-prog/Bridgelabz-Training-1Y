package Level_2;

import java.util.Scanner;

public class TextTOWord {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[] manualSplit(String text) {
        int len = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                wordCount++;
        }
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = input.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("\nManual Split:");
        for (String w : manual)
            System.out.println(w);

        System.out.println("\nSplit Method:");
        for (String w : builtin)
            System.out.println(w);

        System.out.println("\nArrays Equal: " + compareArrays(manual, builtin));
    }
}
