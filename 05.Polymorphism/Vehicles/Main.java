package Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] carTokens = scanner.nextLine().split("\\s+");
        String [] truckTokens = scanner.nextLine().split("\\s+");
        String [] busTokens = scanner.nextLine().split("\\s+");

        Car car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]), Double.parseDouble(carTokens[3]));
        Truck truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]), Double.parseDouble(truckTokens[3]));
        Bus bus = new Bus(Double.parseDouble(busTokens[1]), Double.parseDouble(busTokens[2]), Double.parseDouble(busTokens[3]));

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            try {
                switch (tokens[0]) {
                    case "Drive":
                        if (tokens[1].equals("Car")) {
                            System.out.println(car.drive(Double.parseDouble(tokens[2])));
                        } else if (tokens[1].equals("Truck")) {
                            System.out.println(truck.drive(Double.parseDouble(tokens[2])));
                        } else if (tokens[1].equals("Bus")) {
                            System.out.println(bus.drive(Double.parseDouble(tokens[2])));
                        }
                        break;
                    case "Refuel":
                        if (tokens[1].equals("Car")) {
                            car.refuel(Double.parseDouble(tokens[2]));
                        } else if (tokens[1].equals("Truck")) {
                            truck.refuel(Double.parseDouble(tokens[2]));
                        } else if (tokens[1].equals("Bus")) {
                            bus.refuel(Double.parseDouble(tokens[2]));
                        }
                        break;
                    case "DriveEmpty":
                        System.out.println(bus.drive(Double.parseDouble(tokens[2])));
                        break;
                }
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.printf("%s: %.2f\n", "Car", car.getFuelQuantity());
        System.out.printf("%s: %.2f\n", "Truck", truck.getFuelQuantity());
        System.out.printf("%s: %.2f", "Bus", bus.getFuelQuantity());
    }
}
