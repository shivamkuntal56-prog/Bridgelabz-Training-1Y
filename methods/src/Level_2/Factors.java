package Level_2;

import java.util.Scanner;

public class Factors {
    public static int[] fact(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int[] factor = new int[count];
        int idx = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factor[idx]=i;
                idx++;
            }
        }
        return factor;
    }
    public static int findSum(int[] factor){
        int sum =0;
        for(int i=0;i<factor.length;i++){
            sum+=factor[i];
        }
        return sum;
    }
    public static long findProduct(int[] factor){
        long product =1;
        for(int i=0;i< factor.length;i++){
            product*=factor[i];
        }
        return product;
    }
    public static double sumOfSquares(int[] factor){
        double sum =0;
        for(int i=0;i<factor.length;i++){
            sum += Math.pow(factor[i],2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a integer : ");
        int n = input.nextInt();

        int[] factors = fact(n);
        System.out.println("factor are");
        for(int i=0;i< factors.length;i++){
            System.out.println(factors[i]);
        }
        System.out.println("sum of factors : "+findSum(factors));
        System.out.println("product of factors : "+findProduct(factors));
        System.out.println("sum of square of factors : "+sumOfSquares(factors));
    }
}