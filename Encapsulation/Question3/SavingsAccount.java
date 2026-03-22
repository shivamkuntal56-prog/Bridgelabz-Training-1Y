package Encapsulation.Question_4;

public class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for Savings Account: " + amount);
        }
        else {
            System.out.println("Loan denied for Savings Account");
        }
    }
    @Override
    public boolean calculateLoanEligibility() {
        return balance > 5000;
    }
}
