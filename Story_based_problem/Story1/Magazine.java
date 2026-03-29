package Story1;

public class Magazine extends Book{

    public Magazine(String bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    public void calculateFine(int daysLate) {
        System.out.println("your fine is : "+daysLate*5);
    }
}
