package level_1;

import java.util.Scanner;

public class UpperCase{
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // convert to uppercase
            }
            result = result + ch;
        }
        return result;
    }
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = input.nextLine();

        String manualUpper = convertToUpper(text);
        String builtinUpper = text.toUpperCase();

        boolean result = compareStrings(manualUpper, builtinUpper);

        System.out.println("Uppercase using charAt: " + manualUpper);
        System.out.println("Uppercase using toUpperCase: " + builtinUpper);
        System.out.println("Both results are same: " + result);
    }
}