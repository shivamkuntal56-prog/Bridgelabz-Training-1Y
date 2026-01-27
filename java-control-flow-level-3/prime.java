import java.util.Scanner;

class Prime {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();
		
		boolean isPrime = true;

        if (number < 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if(number%i==0){
					isPrime = false;
					break;
				}
            }
        }
	 if (isPrime) {
     System.out.println("This number is a Prime Number");
     }
	 else{
     System.out.println("This number is not a Prime Number");
    }
  }
}