class UberEats {

    public static int search(String foodName) {

        int foodPrice;

        if (foodName.equals("Margherita Pizza")) return foodPrice = 300;

        if (foodName.equals("BBQ Chicken Pizza")) return foodPrice = 350;

        if (foodName.equals("Caesar Salad")) return foodPrice = 250;

        if (foodName.equals("Spaghetti Carbonara")) return foodPrice = 400;

        if (foodName.equals("Cheeseburger")) return foodPrice = 200;

        if (foodName.equals("Sushi Platter")) return foodPrice = 500;

        if (foodName.equals("Pad Thai")) return foodPrice = 350;

        if (foodName.equals("Tacos")) return foodPrice = 150;

        else
            System.out.println(foodName + " not found");
        return 0;
    }

    public static int search(String foodName, int quantity) {

        int foodPrice;

        if (foodName.equals("Margherita Pizza")) return foodPrice = quantity * 300;

        if (foodName.equals("BBQ Chicken Pizza")) return foodPrice = quantity * 350;

        if (foodName.equals("Caesar Salad")) return foodPrice = quantity * 250;

        if (foodName.equals("Spaghetti Carbonara")) return foodPrice = quantity * 400;

        if (foodName.equals("Cheeseburger")) return foodPrice = quantity * 200;

        if (foodName.equals("Sushi Platter")) return foodPrice = quantity * 500;

        if (foodName.equals("Pad Thai")) return foodPrice = quantity * 350;

        if (foodName.equals("Tacos")) return foodPrice = quantity * 150;

        else
            System.out.println(foodName + " not found");
        return 0;
    }
}

