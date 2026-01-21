import java.util.Scanner;

class volume
{
  public static void main(String args[])
  {
	Scanner input = new Scanner(System.in);

    System.out.println("Enter radius:");
    double radius = input.nextDouble();
	
	double volume = (3.14*radius*radius*radius)*4/3;
  System.out.println("volume of earth : " +volume);
  
  double miles = volume*1.6;
  System.out.println("convert in miles :"+miles);
  }
}