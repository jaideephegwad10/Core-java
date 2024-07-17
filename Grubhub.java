class Grubhub {

    public static int search(String foodName) {

        int foodPrice;

        if (foodName.equals("Cheese Pizza")) return foodPrice = 310;

        if (foodName.equals("Buffalo Wings")) return foodPrice = 290;

        if (foodName.equals("Caprese Salad")) return foodPrice = 240;

        if (foodName.equals("Lasagna")) return foodPrice = 430;

        if (foodName.equals("Veggie Burger")) return foodPrice = 220;

        if (foodName.equals("California Roll")) return foodPrice = 530;

        if (foodName.equals("Pho")) return foodPrice = 380;

        if (foodName.equals("Quesadilla")) return foodPrice = 170;

        else
            System.out.println(foodName + " not found");
        return 0;
    }

    public static int search(String foodName, int quantity) {

        int foodPrice;

        if (foodName.equals("Cheese Pizza")) return foodPrice = quantity * 310;

        if (foodName.equals("Buffalo Wings")) return foodPrice = quantity * 290;

        if (foodName.equals("Caprese Salad")) return foodPrice = quantity * 240;

        if (foodName.equals("Lasagna")) return foodPrice = quantity * 430;

        if (foodName.equals("Veggie Burger")) return foodPrice = quantity * 220;

        if (foodName.equals("California Roll")) return foodPrice = quantity * 530;

        if (foodName.equals("Pho")) return foodPrice = quantity * 380;

        if (foodName.equals("Quesadilla")) return foodPrice = quantity * 170;

        else
            System.out.println(foodName + " not found");
        return 0;
    }
}


