import College.Faculty.Faculty;
import College.Student.Student;
import Library.Member.member;
import com.university.department.cse.course;
import Library.Book.Book;
import Library.Transacton.Trancastion;

public class mainClass {
    public static void main(String[] args) {

        Student s = new Student();
        Faculty f = new Faculty();

        s.displayStudent();
        f.displayFaculty();

        course c = new course();
        c.showCourse();


        Book b = new Book();
        member m = new member();
        Trancastion t = new Trancastion();

        b.addBook();
        m.registerMember();
        t.issueBook();

    }
}
