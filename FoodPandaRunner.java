class FoodPandaRunner {

    static String foodName = "Chicken Alfredo Pasta";
    
    public static void main(String[] args) {
        System.out.println("main started");
        
        int price = FoodPanda.getPriceOfFood(foodName,2);
        System.out.println("The price of " + foodName + " is " + price);
        
        System.out.println("main ended");
    }
}
