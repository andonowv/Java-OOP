package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    private static final double COFFEE_MILLILITERS = 50;
    private static final BigDecimal COFFEE_PRICE = new BigDecimal(3.50);
    private double caffeine;
    public Coffee (String name, double coffeine){
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = coffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
