package Encapsulation.Question_5;

public class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 10;
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved.");
        } else {
            System.out.println("Magazine not available.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
