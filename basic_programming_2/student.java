import java.util.Scanner;

class Student
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter number of pens :");
    int numberPens = input.nextInt();

    double que = numberPens/3;
    double rem = numberPens%3;

    System.out.println("distributed pens : " +que);
	System.out.println("remndier : " +rem);
  }
}