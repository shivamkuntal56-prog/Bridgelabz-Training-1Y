package Encapsulation.Question_4;

public class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_CALCULATE = 0.01;

    public CurrentAccount(int accountNumber, String holderName, double balance){
        super(accountNumber,holderName,balance);
    }
    @Override
    public double calculateInterest(){
        return balance*INTEREST_CALCULATE;
    }
    @Override
    public void applyForLoan(double amount){
         if(calculateLoanEligibility()){
             System.out.println("Loan approved for current Account: " + amount);
         }
         else {
             System.out.println("Loan denied for current Account");
         }
    }
    @Override
    public boolean calculateLoanEligibility() {
        return balance>10000;
    }
}