package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List <Topping> toppings;

    public Pizza (String name, int countToppings){
        this.setName(name);
        this.setToppings(countToppings);
    }

    public void setName (String name){
        if (name.trim().isEmpty() || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }else {
            this.name = name;
        }
    }
    public void setToppings (int toppings){
        if (toppings < 0 || toppings > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }else {
            this.toppings = new ArrayList<>(toppings);
        }
    }

    public String getName() {
        return name;
    }
    public void setDough (Dough dough){
        this.dough = dough;
    }
    public void addTopping (Topping topping){
        this.toppings.add(topping);
    }
    public double getOverallCalories (){
        double sumCalories = this.dough.calculateCalories() + this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
        return sumCalories;
    }
}
