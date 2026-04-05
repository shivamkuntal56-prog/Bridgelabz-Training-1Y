package Assignment_13.Question4;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Thread entryThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Student Entry Monitoring: Student " + i + " entered");
                    Thread.sleep(2000);
                }
                System.out.println("Student Entry Monitoring completed");
            } catch (InterruptedException e) {
                System.out.println("Entry Monitoring interrupted");
            }
        }, "EntryThread");
        Thread paperThread = new Thread(new ExamActivity("Question Paper Distribution", 5000), "PaperThread");
        Thread attendanceThread = new Thread(new ExamActivity("Attendance Marking", 10000), "AttendanceThread");
        Thread collectionThread = new Thread(new ExamActivity("Answer Sheet Collection", 15000), "CollectionThread");

        paperThread.setPriority(10);
        attendanceThread.setPriority(8);
        entryThread.setPriority(5);
        collectionThread.setPriority(7);

        System.out.println("Before Start:");
        System.out.println("Entry Thread State      : " + entryThread.getState());
        System.out.println("Paper Thread State      : " + paperThread.getState());
        System.out.println("Attendance Thread State : " + attendanceThread.getState());
        System.out.println("Collection Thread State : " + collectionThread.getState());

        System.out.println("\nStarting Threads...\n");

        entryThread.start();
        paperThread.start();
        attendanceThread.start();
        collectionThread.start();

        Thread.sleep(1000);

        System.out.println("\nAfter Starting:");
        System.out.println("Entry Thread State      : " + entryThread.getState());
        System.out.println("Paper Thread State      : " + paperThread.getState());
        System.out.println("Attendance Thread State : " + attendanceThread.getState());
        System.out.println("Collection Thread State : " + collectionThread.getState());

        entryThread.join();
        paperThread.join();
        attendanceThread.join();
        collectionThread.join();

        System.out.println("\nAfter Completion:");
        System.out.println("Entry Thread State      : " + entryThread.getState());
        System.out.println("Paper Thread State      : " + paperThread.getState());
        System.out.println("Attendance Thread State : " + attendanceThread.getState());
        System.out.println("Collection Thread State : " + collectionThread.getState());
    }
}
