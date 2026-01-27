import java.util.Scanner;

class LeapYear{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter year : ");
		int year = input.nextInt();
		
		if(year < 1582){
			System.out.println("enter valid year(>=1582)");
		}
		else if(year%400==0){
			System.out.println("this year is leap year");
		}
		else if(year%100!=0){
			System.out.println("this is not leap year");
		}
		else if(year%4==0){
			System.out.println("this year is a leap year");
		}
		else{
			System.out.println("this is not a leap year");
		}
	}
}