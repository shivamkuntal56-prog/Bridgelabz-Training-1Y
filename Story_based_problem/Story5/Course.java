package Story5;

public class Course {
    String courseId;
    String courseName;
    int price;

    static String platformName = "LearnHub";

    public Course(String courseId, String courseName, int price){
        this.courseId=courseId;
        this.courseName=formatTitle(courseName);
        this.price=price;
    }
    String formatTitle(String name) {
        String[] words = name.trim().toLowerCase().split(" ");
        String result = "";
        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        return result.trim();
    }
    double getFinalPrice(){
        return 0;
    }
    void display() {
        System.out.println("Platform: " + platformName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Final Price: ₹" + getFinalPrice());
    }
}
