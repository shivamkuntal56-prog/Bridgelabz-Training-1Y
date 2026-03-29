package Story1;

public class TextBook extends Book {

    public TextBook(String bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    public void calculateFine(int daysLate) {
        System.out.println("your fine is : "+daysLate*2);
    }
}
