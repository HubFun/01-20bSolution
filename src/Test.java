class Test {

   static private void printInfo (Drink drink){

        System.out.printf("Drink o nazwie %s oraz cenie %.2f , składa się z następujących składników:\n" +
                "%s, %s, %s",drink.getName(), drink.getPrice(),  drink.getDrinkIngredient().getIngredient1(), drink.getDrinkIngredient().getIngredient2(),drink.getDrinkIngredient().getIngredient3());
        System.out.printf(", o pojemnościach odpowiednio: %.2f ml, %.2f ml oraz %.2f ml. \n ", drink.getDrinkIngredient().getAmount1(),drink.getDrinkIngredient().getAmount2(),drink.getDrinkIngredient().getAmount3());

        if(drink.isIntoxicant())
            System.out.println("Drink zawiera alkohol.");
        else
            System.out.println("Drink nie zawiera alkoholu.");

        System.out.printf("Pojemność drinka wynosi %.2f : ml \n", drink.getDrinkIngredient().getAmount1()+drink.getDrinkIngredient().getAmount2()+drink.getDrinkIngredient().getAmount3());

    }

    public static void main(String[] args) {

        DrinkIngredient wooWooIngredient;
        wooWooIngredient = new DrinkIngredient("Cranberry Juice","Vodka", "Peachy Liqueur", 140, 40, 40 );
        Drink wooWoo = new Drink ("Woo Woo", 36.99, true, wooWooIngredient );
        printInfo(wooWoo);

    }

}
