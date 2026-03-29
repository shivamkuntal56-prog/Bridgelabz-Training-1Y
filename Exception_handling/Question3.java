package Execption;

public class Question3 {
     public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
             if(amount<0||years<0){
                 throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
         }
         return  (amount*rate*years)/100;
     }
    public static void main(String[] args) {
         try {
             double amount = 1000;
             double rate = 2;
             int years = -4;
             double interest = calculateInterest(amount, rate, years);

             System.out.println("Calculated Interest: " + interest);
         }
         catch (IllegalArgumentException e){
             System.out.println(e.getMessage());
         }
    }
}
