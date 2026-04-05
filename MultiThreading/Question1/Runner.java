package Assignment_13.Question1;

public class Runner {
    public static void main(String[] args) {
        BankAccount premiumUser = new BankAccount("Rahul", "Premium");
        BankAccount regularUser = new BankAccount("Amit", "Regular");
        BankAccount basicUser = new BankAccount("Suresh", "Basic");

        Thread t1 = new Thread(premiumUser, "Premium-Thread");
        Thread t2 = new Thread(regularUser, "Regular-Thread");
        Thread t3 = new Thread(basicUser, "Basic-Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
