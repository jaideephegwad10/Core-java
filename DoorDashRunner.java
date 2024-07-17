class DoorDashRunner {

    static String foodName = "Pepperoni Pizza";

    public static void main(String[] args) {
        System.out.println("main started");

        int price = DoorDash.search(foodName, 3);
        System.out.println("The price of " + foodName + " is " + price);

        System.out.println("main ended");
    }
}
