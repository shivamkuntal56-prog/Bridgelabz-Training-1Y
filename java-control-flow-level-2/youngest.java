import java.util.Scanner;

class Youngest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Amar's age:");
        int amarAge = input.nextInt();

        System.out.println("Enter Akbar's age:");
        int akbarAge = input.nextInt();

        System.out.println("Enter Anthony's age:");
        int anthonyAge = input.nextInt();
		
        System.out.println("Enter Amar's height:");
        int amarHeight = input.nextInt();

        System.out.println("Enter Akbar's height:");
        int akbarHeight = input.nextInt();

        System.out.println("Enter Anthony's height:");
        int anthonyHeight = input.nextInt();

        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Youngest friend: Amar");
        } 
        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Youngest friend: Akbar");
        } 
        else {
            System.out.println("Youngest friend: Anthony");
        }

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Tallest friend: Amar");
        } 
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Tallest friend: Akbar");
        } 
        else {
            System.out.println("Tallest friend: Anthony");
        }
    }
}