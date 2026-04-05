package Assignment_13.Question2;

public class SmartHome implements Runnable{
    String name;
    int interval;

    SmartHome(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " working - Cycle " + i);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
    }
}

