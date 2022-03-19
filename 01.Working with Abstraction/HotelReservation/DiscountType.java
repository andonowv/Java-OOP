package HotelReservation;

public enum DiscountType {
    VIP(0.20),
    SECONDVISIT(0.10),
    NONE(0);

    private double discount;

    DiscountType (double discount){
        this.discount = discount;
    }
    public double getDiscount(){
        return this.discount;
    }
}
