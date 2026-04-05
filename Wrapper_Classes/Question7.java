package Assignment14;

import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {

        double[] prices = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> list = new ArrayList<>();
        for (double price:prices){
            list.add(price);
        }
        double highest = list.get(0);
        double sum = 0;
        for(double price: list){
            if(price>highest){
                highest=price;
            }
            sum +=price;
        }
        double average = sum / list.size();

        System.out.println("Prices: " + list);
        System.out.println("Highest Price: " + highest);
        System.out.println("Average Price: " + average);
    }
}
