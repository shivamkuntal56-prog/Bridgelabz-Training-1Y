package Encapsulation.Question_4;

public class Runner {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(1245465464,"Rahul",100000);
        CurrentAccount s2 = new CurrentAccount(1232453,"Shivam",100000);

        System.out.println("Account holder : "+s1.getHolderName());
        System.out.println("Balance : "+s1.getBalance());
        System.out.println("Interest calculation : "+s1.calculateInterest());

        System.out.println("---------------------------------------------");

        System.out.println("Account holder : "+s2.getHolderName());
        System.out.println("Balance : "+s2.getBalance());
        System.out.println("Interest calculation : "+s2.calculateInterest());

        System.out.println("------------------------------------------");

        s1.applyForLoan(50000);
        s2.applyForLoan(10000);
    }
}
