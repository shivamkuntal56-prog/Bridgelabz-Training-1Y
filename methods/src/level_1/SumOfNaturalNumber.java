package level_1;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static int sum(int n){
        int sum =0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a integer ");
        int n = input.nextInt();
        int output = sum(n);
        System.out.println("sum of" + n + "natural number : "+output);
    }
}