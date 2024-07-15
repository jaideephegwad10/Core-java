class SwiggyRunner {

    static String foodName = "Butter Chicken";
    
    public static void main(String[] args) {
        System.out.println("main started");
        
        int price = Swiggy.getPriceOfFood(foodName);
        System.out.println("The price of " + foodName + " is " + price);
        
        System.out.println("main ended");
    }
}
