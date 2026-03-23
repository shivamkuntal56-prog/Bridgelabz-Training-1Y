package FunctionalInterfaces.Question1;

import java.util.function.Predicate;

public class TemperatureSystem {
    public static void main(String[] args) {
        double threshold = 30;

        Predicate<Double> isHighTemp = temp -> temp > threshold;

        double currentTemp = 23.0;

        if(isHighTemp.test(currentTemp)){
            System.out.println("High Temperature");
        }
        else {
            System.out.println("Normal Temperature");
        }
    }
}
