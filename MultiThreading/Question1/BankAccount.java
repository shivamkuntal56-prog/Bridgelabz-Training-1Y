package Assignment_13.Question1;

public class BankAccount implements Runnable{
    private String accountHolder;
    private String accountType;

    public BankAccount(String accountHolder, String accountType) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                    "User: " + accountHolder +
                            " | Account Type: " + accountType +
                            " | Thread: " + currentThread.getName() +
                            " | Priority: " + currentThread.getPriority() +
                            " | Balance Check " + i
            );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(accountHolder + " thread interrupted.");
            }
        }
    }
}
