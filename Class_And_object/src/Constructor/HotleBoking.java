package Constructor;

import java.util.Scanner;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }
    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }
    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Guest Name: ");
        String g = input.nextLine();

        System.out.print("Enter Room Type: ");
        String r = input.nextLine();

        System.out.print("Enter Nights: ");
        int n = input.nextInt();

        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking(g, r, n);
        HotelBooking h3 = new HotelBooking(h2);
        System.out.println("\nDefault Booking:");
        h1.display();
        System.out.println("\nUser Booking:");
        h2.display();

        System.out.println("\nCopied Booking:");
        h3.display();
    }
}