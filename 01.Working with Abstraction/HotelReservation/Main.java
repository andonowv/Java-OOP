package HotelReservation;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] tokens = scanner.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(tokens[0]);
        int numberOfDays = Integer.parseInt(tokens[1]);
        String season = tokens [2].toUpperCase(Locale.ROOT);
        String discountType = tokens [3].toUpperCase(Locale.ROOT);

        PriceCalculator priceCalculator = new PriceCalculator(DiscountType.valueOf(discountType), Season.valueOf(season), numberOfDays, pricePerDay);

        System.out.printf("%.2f", priceCalculator.getFinalPrice());

    }
}
