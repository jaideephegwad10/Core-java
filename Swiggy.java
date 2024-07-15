class Swiggy {

    public static int getPriceOfFood(String foodName) {
    
        int foodPrice;
        
        if (foodName == "Butter Chicken") {//1
            foodPrice = 299;
            return foodPrice;
        }
        
        if (foodName == "Paneer Butter Masala") {//2
            foodPrice = 249;
            return foodPrice;
        }
        
        if (foodName == "Chicken Biryani") {//3
            foodPrice = 199;
            return foodPrice;
        }
        
        if (foodName == "Veg Pulao") {//4
            foodPrice = 149;
            return foodPrice;
        }
        
        if (foodName == "Mutton Rogan Josh") {//5
            foodPrice = 349;
            return foodPrice;
        }
        
        if (foodName == "Masala Dosa") {//6
            foodPrice = 99;
            return foodPrice;
        }
        
        if (foodName == "Chicken Tikka") {//7
            foodPrice = 299;
            return foodPrice;
        }
        
        if (foodName == "Gulab Jamun") {//8
            foodPrice = 50;
            return foodPrice;
        }
        
        if (foodName == "Paneer Tikka") {//9
            foodPrice = 249;
            return foodPrice;
        }
        
        if (foodName == "Fish Curry") {//10
            foodPrice = 299;
            return foodPrice;
        }
        
        if (foodName == "Chole Bhature") {//11
            foodPrice = 199;
            return foodPrice;
        }
        
        if (foodName == "Palak Paneer") {//12
            foodPrice = 229;
            return foodPrice;
        }
        
        if (foodName == "Pav Bhaji") {//13
            foodPrice = 149;
            return foodPrice;
        }
        
        if (foodName == "Rasgulla") {//14
            foodPrice = 50;
            return foodPrice;
        }
        
        if (foodName == "Paneer Kathi Roll") {//15
            foodPrice = 199;
            return foodPrice;
        }
        
        if (foodName == "Chicken Kathi Roll") {//16
            foodPrice = 229;
            return foodPrice;
        }
        
        if (foodName == "Veg Burger") {//17
            foodPrice = 99;
            return foodPrice;
        }
        
        if (foodName == "Chicken Burger") {//18
            foodPrice = 149;
            return foodPrice;
        }
        
        if (foodName == "Veg Pizza") {//19
            foodPrice = 249;
            return foodPrice;
        }
        
        if (foodName == "Chicken Pizza") {//20
            foodPrice = 299;
            return foodPrice;
        }
        
        else
            System.out.println(foodName + " not found");
        return 0;    
    }
}
