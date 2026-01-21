import java.util.Scanner;

class Harry
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter math number :");
    int mathNum = input.nextInt();

    System.out.println("Enter physcis number :");
    int physcisNum = input.nextInt();
	
	System.out.println("Enter chemistry number :");
	int chemistryNUM = input.nextInt();

    double avg = (mathNum+physcisNum+chemistryNUM)/3;

    System.out.println("avg of marks: " +avg);
  }
}
