package Level_2;

import java.util.Scanner;

class PalindromeChecker {
    String text;
    void inputText() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        text = input.nextLine();
    }
    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }
    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is Not a Palindrome");
    }
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.inputText();
        p.displayResult();
    }
}