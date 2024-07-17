class JustEatRunner {

    static String foodName = "Hawaiian Pizza";

    public static void main(String[] args) {
        System.out.println("main started");

        int price = JustEat.search(foodName, 1);
        System.out.println("The price of " + foodName + " is " + price);

        System.out.println("main ended");
    }
}