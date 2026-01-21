import java.util.Scanner;

class Handshake
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter number of students :");
    int n = input.nextInt();

    double handshakes = (n * (n - 1)) / 2;

    System.out.println("number of possible handshakes: " +handshakes);
  }
}