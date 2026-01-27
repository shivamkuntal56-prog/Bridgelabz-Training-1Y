import java.util.Scanner;

class FactorialWhile{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int fact = 1;
		System.out.println("enter positive number : ");
		int number = input.nextInt();
		
		if(number<0){
			System.out.println("pls enter positive integer");
		}
		else{
			int i=1;
			while(i<=number){
				fact=fact*i;
				i++;
			}
			System.out.println("factorial is : "+fact);
		}
	}
}