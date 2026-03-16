package level_1;

import java.util.Scanner;

public class CharArray {

    public static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        char[] manualArray = getCharacters(text);
        char[] builtinArray = text.toCharArray();

        boolean result = compareArrays(manualArray, builtinArray);

        System.out.println("Arrays are same: " + result);
    }
}
