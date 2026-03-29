package Story5;

public class LiveCourse extends Course{
    public LiveCourse(String courseId, String courseName, int price) {
        super(courseId, courseName, price);
    }
    @Override
    public double getFinalPrice(){
        return price-(price*0.05);
    }
}
