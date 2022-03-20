package Vehicles;

public class Car extends Vehicle{
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive(double distance) {
        String result = "Car " + super.drive(distance);
        return result;
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + 0.9);
    }
}
