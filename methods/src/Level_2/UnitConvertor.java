package Level_2;

import java.util.Scanner;

public class UnitConvertor {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles = km * km2miles;
        return miles;
    }
    public static double convertMilesToKm(double mile) {
        double miles2km = 1.60934;
        double kms = mile * miles2km;
        return kms;
    }
    public static double convertMeterToFeet(double meter) {
        double meter2feet = 3.28084;
        double feets = meter * meter2feet;
        return feets;
    }
    public static double convertFeetToMeter(double feet) {
        double feet2meters = 0.3048;
        double meter = feet * feet2meters;
        return meter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        System.out.print("Enter the distance in miles: ");
        double mile = input.nextDouble();

        System.out.print("Enter the distance in meter: ");
        double meter = input.nextDouble();

        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();

        double output1 = convertKmToMiles(km);
        System.out.println("distance in miles : "+output1);

        double output2 = convertMilesToKm(mile);
        System.out.println("distance in km : "+output2);

        double output3 = convertMeterToFeet(meter);
        System.out.println("distance in feet : "+output3);

        double output4 = convertFeetToMeter(feet);
        System.out.println("distance in meter : "+output4);

    }
}