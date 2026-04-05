package Assignment14;

public class Question6 {
    public static int safeParseInt(String input){
        try {
            Integer.parseInt(input);
        }
        catch (NumberFormatException e){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] Inputs = {"123", "abc", "45.6", "0"};
        for (String input : Inputs) {
            System.out.println("Input: " + input + " -> " + safeParseInt(input));
        }
    }
}
