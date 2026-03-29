package Story1;

public abstract class Book {
    String bookId;
    String title;
    double price;
    static String libraryName = "City Library";
    public Book(String bookId,String title,double price){
        this.bookId=bookId;
        this.title=title;
        this.price=price;
    }
    public abstract void calculateFine(int daysLate);
}
