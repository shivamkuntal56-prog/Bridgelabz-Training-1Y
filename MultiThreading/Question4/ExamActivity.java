package Assignment_13.Question4;

public class ExamActivity implements Runnable{
    private String activityName;
    private int delay;

    ExamActivity(String activityName, int delay) {
        this.activityName = activityName;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            System.out.println(activityName + " started by "+ Thread.currentThread().getName());
            Thread.sleep(delay);
            System.out.println(activityName + " completed by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(activityName + " interrupted");
        }
    }
}
