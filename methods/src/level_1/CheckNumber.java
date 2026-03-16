package level_1;

import java.util.Scanner;

public class CheckNumber {
    public static int number(int no){
        if(no<0){
            return -1;
        }
        else if(no>0){
            return +1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();

        int output = number(no);
        System.out.println(output);
    }
}
