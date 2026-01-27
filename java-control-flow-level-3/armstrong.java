import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();
		
		int sum = 0;
		int originalNumber = number;

        while(originalNumber!=0){
			int digit = originalNumber%10;
			sum = sum +(digit*digit*digit);
			originalNumber=originalNumber/10;
		}
	 if (sum == number) {
     System.out.println("This number is a armstrong Number");
     }
	 else{
     System.out.println("This number is not a armstrong Number");
    }
  }
}