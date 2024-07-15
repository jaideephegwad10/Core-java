class FoodPanda {

    public static int getPriceOfFood(String foodName) {
        
        int foodPrice;
        
        if (foodName == "Chicken Alfredo Pasta") return foodPrice = 349;
        
        if (foodName == "Veggie Delight Pizza") return foodPrice = 299;
        
        if (foodName == "Chicken Shawarma") return foodPrice = 199;
        
        if (foodName == "Falafel Wrap") return foodPrice = 149;
        
        if (foodName == "Mutton Kebab") return foodPrice = 399;
        
        if (foodName == "Paneer Tikka Masala") return foodPrice = 249;
        
        if (foodName == "Butter Naan") return foodPrice = 49;
        
        if (foodName == "Hakka Noodles") return foodPrice = 199;
        
        if (foodName == "Spring Rolls") return foodPrice = 149;
        
        if (foodName == "Chicken Fried Rice") return foodPrice = 229;
        
        if (foodName == "Veg Manchurian") return foodPrice = 199;
        
        if (foodName == "Pasta Arrabiata") return foodPrice = 279;
        
        if (foodName == "Chicken Caesar Salad") return foodPrice = 249;
        
        if (foodName == "Tandoori Chicken") return foodPrice = 349;
        
        if (foodName == "Paneer Butter Naan Combo") return foodPrice = 299;
        
        if (foodName == "Mango Lassi") return foodPrice = 99;
        
        if (foodName == "Veggie Burger") return foodPrice = 149;
        
        if (foodName == "Fish and Chips") return foodPrice = 349;
        
        if (foodName == "Spaghetti Bolognese") return foodPrice = 299;
        
        if (foodName == "Chocolate Brownie") return foodPrice = 129;
        
        else
            System.out.println(foodName + " not found");
        return 0;    
    }
    
    public static int getPriceOfFood(String foodName, int quantity) {
        
        int foodPrice;
        
        if (foodName == "Chicken Alfredo Pasta") return foodPrice = quantity * 349;
        
        if (foodName == "Veggie Delight Pizza") return foodPrice = quantity * 299;
        
        if (foodName == "Chicken Shawarma") return foodPrice = quantity * 199;
        
        if (foodName == "Falafel Wrap") return foodPrice = quantity * 149;
        
        if (foodName == "Mutton Kebab") return foodPrice = quantity * 399;
        
        if (foodName == "Paneer Tikka Masala") return foodPrice = quantity * 249;
        
        if (foodName == "Butter Naan") return foodPrice = quantity * 49;
        
        if (foodName == "Hakka Noodles") return foodPrice = quantity * 199;
        
        if (foodName == "Spring Rolls") return foodPrice = quantity * 149;
        
        if (foodName == "Chicken Fried Rice") return foodPrice = quantity * 229;
        
        if (foodName == "Veg Manchurian") return foodPrice = quantity * 199;
        
        if (foodName == "Pasta Arrabiata") return foodPrice = quantity * 279;
        
        if (foodName == "Chicken Caesar Salad") return foodPrice = quantity * 249;
        
        if (foodName == "Tandoori Chicken") return foodPrice = quantity * 349;
        
        if (foodName == "Paneer Butter Naan Combo") return foodPrice = quantity * 299;
        
        if (foodName == "Mango Lassi") return foodPrice = quantity * 99;
        
        if (foodName == "Veggie Burger") return foodPrice = quantity * 149;
        
        if (foodName == "Fish and Chips") return foodPrice = quantity * 349;
        
        if (foodName == "Spaghetti Bolognese") return foodPrice = quantity * 299;
        
        if (foodName == "Chocolate Brownie") return foodPrice = quantity * 129;
        
        else
            System.out.println(foodName + " not found");
        return 0;    
    }
}
