import java.util.Scanner;

class Harry
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter birth year:");
    int birthYear = input.nextInt();

    System.out.println("Enter current year:");
    int currentYear = input.nextInt();

    int age = currentYear - birthYear;

    System.out.println("Age of Harry: " + age);
  }
}
