package Encapsulation.Question_5;

public class DVD extends LibraryItem implements Reservable{
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 5;
    }
    @Override
    public void reserveItem(String borrowerName) {
       if(checkAvailability()){
           setBorrower(borrowerName);
           System.out.println("DVD reserved");
       }
       else {
           System.out.println("DVD is not available");
       }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
