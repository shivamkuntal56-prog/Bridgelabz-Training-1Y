package Level_3;

import java.util.Scanner;

public class UniqueCharacters {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static char[] uniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[index++] = ch;
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = input.nextLine();

        char[] unique = uniqueChars(text);

        System.out.println("Unique Characters:");

        for (char c : unique)
            System.out.print(c + " ");
    }
}
