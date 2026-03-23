package FunctionalInterfaces.Question3;

public class BackgroundJob {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Background job started...");
            System.out.println("Background job finished!");
        };

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread continues...");
    }
}
