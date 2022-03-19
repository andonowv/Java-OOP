package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough (String flourType, String bakingTechnique, double weight){
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }
    private void setWeight (double weight){
        if (weight >= 1 && weight <= 200){
            this.weight = weight;
        }else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }
    private void setFlourType (String flourType){
        if (flourType.equals("White") || flourType.equals("Wholegrain")){
            this.flourType = flourType;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }
    private void setBakingTechnique (String bakingTechnique){
        if (bakingTechnique.equals("Crispy")|| bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }
    public double calculateCalories (){
        double typeFlour = this.getFlourModifiers(this.flourType);
        double bakingTypeTechnique = this.getTechniqueModifiers(this.bakingTechnique);
        double calories = (2 * this.weight) * typeFlour * bakingTypeTechnique;
        return calories;
    }

    private double getTechniqueModifiers(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy")){
            return 0.9;
        }else if (bakingTechnique.equals("Chewy")){
            return 1.1;
        }else if (bakingTechnique.equals("Homemade")){
            return 1.0;
        }
        return 0;
    }

    private double getFlourModifiers(String flourType) {
        if (flourType.equals("White")){
            return 1.5;
        }else if (flourType.equals("Wholegrain")){
            return 1.0;
        }
        return 0;
    }

}
