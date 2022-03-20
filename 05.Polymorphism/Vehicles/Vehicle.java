package Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    public void setTankCapacity (double tankCapacity){
        this.tankCapacity =tankCapacity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public String drive (double distance){
        double neededFuel = distance * fuelConsumption;
        DecimalFormat df = new DecimalFormat("#.##");
        String result = "needs refueling";
        if (fuelQuantity > neededFuel){
            this.fuelQuantity -= neededFuel;
            result = String.format("travelled %s km", df.format(distance));
        }
        return result;
    }
    public void refuel (double liters){
        if (liters + fuelQuantity > tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }if (liters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.fuelQuantity += liters;
    }
}
