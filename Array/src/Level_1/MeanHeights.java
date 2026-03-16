import java.util.Scanner;

class MeanHeights{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double height[] = new double[11];
        double sum = 0;
        System.out.println("Enter height of 11 players:");
        for (int i = 0; i < height.length; i++) {
            height[i] = input.nextDouble();
            sum += height[i];
        }
        double meanHeight = sum / height.length;
        System.out.println("total mean height: " +meanHeight);
    }
}
