package Story5;

public class Runner {
    public static void main(String[] args) {
        Course c1 = new RecordedCourse("PS23", "JAVA Course", 1000);
        Course c2 = new LiveCourse("LS345", "DSA", 2000);
       c1.display();

        System.out.println("----------------------------------");

       c2.display();
    }
}