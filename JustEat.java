class JustEat {

    public static int search(String foodName) {

        int foodPrice;

        if (foodName.equals("Hawaiian Pizza")) return foodPrice = 340;

        if (foodName.equals("Mozzarella Sticks")) return foodPrice = 210;

        if (foodName.equals("Garden Salad")) return foodPrice = 260;

        if (foodName.equals("Chicken Alfredo")) return foodPrice = 450;

        if (foodName.equals("Salmon Burger")) return foodPrice = 240;

        if (foodName.equals("Tempura Sushi")) return foodPrice = 550;

        if (foodName.equals("Miso Soup")) return foodPrice = 400;

        if (foodName.equals("Chimichanga")) return foodPrice = 190;

        else
            System.out.println(foodName + " not found");
        return 0;
    }

    public static int search(String foodName, int quantity) {

        int foodPrice;

        if (foodName.equals("Hawaiian Pizza")) return foodPrice = quantity * 340;

        if (foodName.equals("Mozzarella Sticks")) return foodPrice = quantity * 210;

        if (foodName.equals("Garden Salad")) return foodPrice = quantity * 260;

        if (foodName.equals("Chicken Alfredo")) return foodPrice = quantity * 450;

        if (foodName.equals("Salmon Burger")) return foodPrice = quantity * 240;

        if (foodName.equals("Tempura Sushi")) return foodPrice = quantity * 550;

        if (foodName.equals("Miso Soup")) return foodPrice = quantity * 400;

        if (foodName.equals("Chimichanga")) return foodPrice = quantity * 190;

        else
            System.out.println(foodName + " not found");
        return 0;
    }
}


