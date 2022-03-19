package Animals;

public class Dog extends Animal{
    private String name;
    private String favouriteFood;

    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getName() {
        return name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected String explainSelf() {
        return String.format("I am %s and my favourite food is %s\n" +
                "DJAAF\n", name, favouriteFood);
    }
}
