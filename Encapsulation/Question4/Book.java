package Encapsulation.Question_5;

public class Book extends LibraryItem implements Reservable{
    public Book(String itemId,String title,String author){
        super(itemId,title,author);
    }
    @Override
    public int getLoanDuration() {
        return 14;
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
