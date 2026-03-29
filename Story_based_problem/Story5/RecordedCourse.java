package Story5;

public class RecordedCourse extends Course{
    public RecordedCourse(String courseId, String courseName, int price) {
        super(courseId, courseName, price);
    }
    @Override
    public double getFinalPrice(){
        return price-(price*0.10);
    }
}
