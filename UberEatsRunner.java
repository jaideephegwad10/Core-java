class UberEatsRunner {

    static String foodName = "Margherita Pizza";

    public static void main(String[] args) {
        System.out.println("main started");

        int price = UberEats.search(foodName, 2);
        System.out.println("The price of " + foodName + " is " + price);

        System.out.println("main ended");
    }
}
