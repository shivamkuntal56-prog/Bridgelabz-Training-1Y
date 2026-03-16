package level_1;

import java.util.Scanner;

public class Lowercase{
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // convert to lowercase
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

        String manualLower = convertToLower(text);
        String builtinLower = text.toLowerCase();

        boolean result = compareStrings(manualLower, builtinLower);

        System.out.println("Lowercase using charAt: " + manualLower);
        System.out.println("Lowercase using toLowerCase: " + builtinLower);
        System.out.println("Both results are same: " + result);
    }
}
