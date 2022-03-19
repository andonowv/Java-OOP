package PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping (String toppingType, double weight){
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }
    private void setToppingType (String toppingType){
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") ||
        toppingType.equals("Sauce")){
            this.toppingType= toppingType;
        }else {
            String massage = String.format("Cannot place %s on top of your pizza.", toppingType);
            throw new IllegalArgumentException(massage);
        }
    }
    private void setWeight (double weight){
        if (weight >= 1 && weight <= 50){
            this.weight = weight;
        }else {
            String massage = String.format("%s weight should be in the range [1..50].", toppingType);
            throw new IllegalArgumentException(massage);
        }
    }
    public double calculateCalories (){
        double toppingsModifiers = getToppingsModifiers(toppingType);
        double calories = (2 * weight) * toppingsModifiers;
        return calories;
    }

    private double getToppingsModifiers(String toppingType) {
        if (toppingType.equals("Meat")){
            return 1.2;
        }else if (toppingType.equals("Veggies")){
            return 0.8;
        }else if (toppingType.equals("Cheese")){
            return 1.1;
        }else if (toppingType.equals("Sauce")){
            return 0.9;
        }
        return 0;
    }
}
