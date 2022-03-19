package Animals;

public class Cat extends Animal{
    private String name;
    private String favouriteFood;

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    @Override
    protected String explainSelf() {
        return String.format("I am %s and my favourite food is %s\n" +
                "MEEOW\n", name, favouriteFood);
    }
}
