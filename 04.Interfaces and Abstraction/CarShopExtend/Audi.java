package CarShopExtend;

public class Audi extends CarImpl implements Rentable{
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }
    public Integer getMinRentDay(){
        return getMinRentDay();
    }
    public Double getPricePerDay(){
        return getPricePerDay();
    }

    @Override
    public String toString() {
        return String.format("Minimum rental period of %d days. Price per day %f", minRentDay, pricePerDay);
    }
}
