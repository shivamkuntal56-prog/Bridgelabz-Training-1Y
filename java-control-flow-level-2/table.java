import java.util.Scanner;

class Table {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

			for(int i=6;i<=9;i++){
				int table=number*i;
				System.out.println(table);
			}
    }
}