class ZomatoRunner {

    static String foodName = "Paneer Butter Masala";
    
    public static void main(String[] args) {
        System.out.println("main started");
        
        int price = Zomato.getPriceOfFood(foodName);
        System.out.println("The price of " + foodName + " is " + price);
        
        System.out.println("main ended");
    }
}
