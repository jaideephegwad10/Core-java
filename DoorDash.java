class DoorDash {

    public static int search(String foodName) {

        int foodPrice;

        if (foodName.equals("Pepperoni Pizza")) return foodPrice = 320;

        if (foodName.equals("Chicken Wings")) return foodPrice = 280;

        if (foodName.equals("Greek Salad")) return foodPrice = 230;

        if (foodName.equals("Fettuccine Alfredo")) return foodPrice = 420;

        if (foodName.equals("Beef Burger")) return foodPrice = 210;

        if (foodName.equals("Dragon Roll")) return foodPrice = 520;

        if (foodName.equals("Tom Yum Soup")) return foodPrice = 370;

        if (foodName.equals("Nachos")) return foodPrice = 160;

        else
            System.out.println(foodName + " not found");
        return 0;
    }

    public static int search(String foodName, int quantity) {

        int foodPrice;

        if (foodName.equals("Pepperoni Pizza")) return foodPrice = quantity * 320;

        if (foodName.equals("Chicken Wings")) return foodPrice = quantity * 280;

        if (foodName.equals("Greek Salad")) return foodPrice = quantity * 230;

        if (foodName.equals("Fettuccine Alfredo")) return foodPrice = quantity * 420;

        if (foodName.equals("Beef Burger")) return foodPrice = quantity * 210;

        if (foodName.equals("Dragon Roll")) return foodPrice = quantity * 520;

        if (foodName.equals("Tom Yum Soup")) return foodPrice = quantity * 370;

        if (foodName.equals("Nachos")) return foodPrice = quantity * 160;

        else
            System.out.println(foodName + " not found");
        return 0;
    }
}

