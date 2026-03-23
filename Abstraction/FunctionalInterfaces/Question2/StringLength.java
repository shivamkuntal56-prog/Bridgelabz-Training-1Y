package FunctionalInterfaces.Question2;

import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        String message = "my name is sawin";

        int length = getLength.apply(message);

        if (length > 20) {
            System.out.println("Message exceeds limit");
        } else {
            System.out.println("Message is within limit");
        }
    }
}
