package Level_2;

import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void bookTicket() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        movieName = input.nextLine();

        System.out.print("Enter Seat Number: ");
        seatNumber = input.nextInt();

        System.out.print("Enter Ticket Price: ");
        price = input.nextDouble();
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket();
        ticket.displayTicket();
    }
}