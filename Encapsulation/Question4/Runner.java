package Encapsulation.Question_5;

public class Runner {
    public static void main(String[] args) {
        Book b1  =new Book("B101","tech today","Author C");
        Magazine m1 = new Magazine("M102","AI","Author C");
        DVD d1 = new DVD("D105","OOPS","Author C");

        b1.getItemDetails();
        System.out.println("Loan Duration: " + b1.getLoanDuration());

        System.out.println("-------------------------------------------");

        m1.getItemDetails();
        System.out.println("Loan Duration: " + m1.getLoanDuration());

        System.out.println("-----------------------------------------");

        d1.getItemDetails();
        System.out.println("Loan Duration: " + d1.getLoanDuration());

        System.out.println("------------------------------------------");

        b1.reserveItem("Shivam");
        m1.reserveItem("Rahul");
        d1.reserveItem("Anuj");
    }
}
