package Level_2;

import java.util.Scanner;

public class CharacterType {

    public static String checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not Letter";
    }
    public static String[][] analyse(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkChar(text.charAt(i));
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Char\tType");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = input.nextLine();

        String[][] result = analyse(text);

        display(result);
    }
}