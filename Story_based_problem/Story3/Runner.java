package Story3;

public class Runner {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount(1234784973,1200000);
        Account a2 = new CurrentAccount(1138937748,2334000);
        System.out.println("Bank Name :"+Account.bankName);
        a1.calculateInterest();
        a2.calculateInterest();
    }
}
