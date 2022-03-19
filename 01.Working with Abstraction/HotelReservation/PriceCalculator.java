package HotelReservation;

public class PriceCalculator {
    private DiscountType discountType;
    private Season season;
    private int numOfDays;
    private double pricePerDay;


    public PriceCalculator(DiscountType discountType, Season season, int numOfDays, double pricePerDay) {
        this.discountType = discountType;
        this.season = season;
        this.numOfDays = numOfDays;
        this.pricePerDay = pricePerDay;
    }

    public double getFinalPrice (){
        return numOfDays * pricePerDay * season.getValue() * (1 - discountType.getDiscount());
    }
}
