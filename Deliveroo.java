class Deliveroo {

    public static int search(String foodName) {

        int foodPrice;

        if (foodName.equals("Veggie Pizza")) return foodPrice = 330;

        if (foodName.equals("Garlic Bread")) return foodPrice = 190;

        if (foodName.equals("House Salad")) return foodPrice = 250;

        if (foodName.equals("Penne Arrabiata")) return foodPrice = 440;

        if (foodName.equals("Turkey Burger")) return foodPrice = 230;

        if (foodName.equals("Nigiri Sushi")) return foodPrice = 540;

        if (foodName.equals("Ramen")) return foodPrice = 390;

        if (foodName.equals("Burrito")) return foodPrice = 180;

        else
            System.out.println(foodName + " not found");
        return 0;
    }

    public static int search(String foodName, int quantity) {

        int foodPrice;

        if (foodName.equals("Veggie Pizza")) return foodPrice = quantity * 330;

        if (foodName.equals("Garlic Bread")) return foodPrice = quantity * 190;

        if (foodName.equals("House Salad")) return foodPrice = quantity * 250;

        if (foodName.equals("Penne Arrabiata")) return foodPrice = quantity * 440;

        if (foodName.equals("Turkey Burger")) return foodPrice = quantity * 230;

        if (foodName.equals("Nigiri Sushi")) return foodPrice = quantity * 540;

        if (foodName.equals("Ramen")) return foodPrice = quantity * 390;

        if (foodName.equals("Burrito")) return foodPrice = quantity * 180;

        else
            System.out.println(foodName + " not found");
        return 0;
    }
}


