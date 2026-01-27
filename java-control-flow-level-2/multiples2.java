import java.util.Scanner;

class Multiples {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number <= 0 || number  >= 100) {  
            System.out.println("enter a positive number(<100)");
        } 
        else {
			int counter = 100;
            while(counter>=1){
				if(counter%number==0){
					System.out.println(counter);
				}
			counter--;
			}
        }
    }
}