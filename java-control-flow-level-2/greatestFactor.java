import java.util.Scanner;

class GreatestFactor {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();
		
		int greatestFactor = 1;

        if (number <=1) {  
            System.out.println("enter a positive number");
        } 
        else {
            int counter=number-1;
			while(counter>=1){
				if(number%i==0){
					greatestFactor = counter;
					break;
				}
			counter--;
			}
		System.out.println(greatestFactor);
        }
    }
}