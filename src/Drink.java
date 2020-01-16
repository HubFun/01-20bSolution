class Drink {

    private String name;
    private double price;
    private boolean isIntoxicant;
    private DrinkIngredient drinkIngredient;

    public Drink(String name, double price, boolean isIntoxicant, DrinkIngredient drinkIngredient) {
        this.name = name;
        this.price = price;
        this.isIntoxicant = isIntoxicant;
        this.drinkIngredient = drinkIngredient;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    boolean isIntoxicant() {
        return isIntoxicant;
    }

    DrinkIngredient getDrinkIngredient() {
        return drinkIngredient;
    }

}

