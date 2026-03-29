package Story1;

public class Runner {
    public static void main(String[] args) {
        Book b1 = new TextBook("MA234","JAVA",1000);
        Book b2 = new Magazine("MS456","Tech day",1500);

        int dayLate = 5;
        System.out.println(Book.libraryName);
        b1.calculateFine(dayLate);
        b2.calculateFine(dayLate);
    }
}
