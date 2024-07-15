class FoodPanda {

    public static int getPriceOfFood(String foodName) {
    
        int foodPrice;
        
        if (foodName == "Chicken Alfredo Pasta") {//1
            foodPrice = 349;
            return foodPrice;
        }
        
        if (foodName == "Veggie Delight Pizza") {//2
            foodPrice = 299;
            return foodPrice;
        }
        
        if (foodName == "Chicken Shawarma") {//3
            foodPrice = 199;
            return foodPrice;
        }
        
        if (foodName == "Falafel Wrap") {//4
            foodPrice = 149;
            return foodPrice;
        }
        
        if (foodName == "Mutton Kebab") {//5
            foodPrice = 399;
            return foodPrice;
        }
        
        if (foodName == "Paneer Tikka Masala") {//6
            foodPrice = 249;
            return foodPrice;
        }
        
        if (foodName == "Butter Naan") {//7
            foodPrice = 49;
            return foodPrice;
        }
        
        if (foodName == "Hakka Noodles") {//8
            foodPrice = 199;
            return foodPrice;
        }
        
        if (foodName == "Spring Rolls") {//9
            foodPrice = 149;
            return foodPrice;
        }
        
        if (foodName == "Chicken Fried Rice") {//10
            foodPrice = 229;
            return foodPrice;
        }
        
        if (foodName == "Veg Manchurian") {//11
            foodPrice = 199;
            return foodPrice;
        }
        
        if (foodName == "Pasta Arrabiata") {//12
            foodPrice = 279;
            return foodPrice;
        }
        
        if (foodName == "Chicken Caesar Salad") {//13
            foodPrice = 249;
            return foodPrice;
        }
        
        if (foodName == "Tandoori Chicken") {//14
            foodPrice = 349;
            return foodPrice;
        }
        
        if (foodName == "Paneer Butter Naan Combo") {//15
            foodPrice = 299;
            return foodPrice;
        }
        
        if (foodName == "Mango Lassi") {//16
            foodPrice = 99;
            return foodPrice;
        }
        
        if (foodName == "Veggie Burger") {//17
            foodPrice = 149;
            return foodPrice;
        }
        
        if (foodName == "Fish and Chips") {//18
            foodPrice = 349;
            return foodPrice;
        }
        
        if (foodName == "Spaghetti Bolognese") {//19
            foodPrice = 299;
            return foodPrice;
        }
        
        if (foodName == "Chocolate Brownie") {//20
            foodPrice = 129;
            return foodPrice;
        }
        
        else
            System.out.println(foodName + " not found");
        return 0;    
    }
}
