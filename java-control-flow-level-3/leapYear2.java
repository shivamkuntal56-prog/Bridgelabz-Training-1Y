import java.util.Scanner;

class LeapYear{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter year : ");
		int year = input.nextInt();
		
		if(year >= 1582 && ((year%4==0 && year%100!=0) || year%400==0){
			System.out.println("enter valid year(>=1582)");
		}
		else{
			System.out.println("this is not a leap year");
		}
	}
}