class Swiggy {

    public static int getPriceOfFood(String foodName) {
    
        int foodPrice;
        
        if (foodName == "Butter Chicken") return foodPrice = 299;
        
        if (foodName == "Paneer Butter Masala") return foodPrice = 249;
        
        if (foodName == "Chicken Biryani")return foodPrice = 199;
        
        if (foodName == "Veg Pulao") return foodPrice = 149;
        
        if (foodName == "Mutton Rogan Josh") return foodPrice = 349;
        
        if (foodName == "Masala Dosa") return foodPrice = 99;
        
        if (foodName == "Chicken Tikka") return foodPrice = 299;
        
        if (foodName == "Gulab Jamun") return  foodPrice = 50;
        
        if (foodName == "Paneer Tikka") return foodPrice = 249;
        
        if (foodName == "Fish Curry") return foodPrice = 299;
        
        if (foodName == "Chole Bhature") return foodPrice = 199;
        
        if (foodName == "Palak Paneer") return foodPrice = 229;
        
        if (foodName == "Pav Bhaji") return foodPrice = 149;
        
        if (foodName == "Rasgulla") return foodPrice = 50;
        
        if (foodName == "Paneer Kathi Roll") return foodPrice = 199;
        
        if (foodName == "Chicken Kathi Roll") return foodPrice = 229;
        
        if (foodName == "Veg Burger") return foodPrice = 99;
        
        if (foodName == "Chicken Burger") return foodPrice = 149;
        
        if (foodName == "Veg Pizza")return foodPrice = 249;
        
        if (foodName == "Chicken Pizza") return foodPrice = 299;
        
        else
            System.out.println(foodName + " not found");
        return 0;    
    }
	
	public static int getPriceOfFood(String foodName,int quantity) {
    
        int foodPrice;
        
        if (foodName == "Butter Chicken") return foodPrice = 299*quantity;
        
        if (foodName == "Paneer Butter Masala") return foodPrice = 249*quantity;
        
        if (foodName == "Chicken Biryani")return foodPrice = 199*quantity;
        
        if (foodName == "Veg Pulao") return foodPrice = 149*quantity;
        
        if (foodName == "Mutton Rogan Josh") return foodPrice = 349*quantity;
        
        if (foodName == "Masala Dosa") return foodPrice = 99*quantity;
        
        if (foodName == "Chicken Tikka") return foodPrice = 299*quantity;
        
        if (foodName == "Gulab Jamun") return  foodPrice = 50*quantity;
        
        if (foodName == "Paneer Tikka") return foodPrice = 249*quantity;
        
        if (foodName == "Fish Curry") return foodPrice = 299*quantity;
        
        if (foodName == "Chole Bhature") return foodPrice = 199*quantity;
        
        if (foodName == "Palak Paneer") return foodPrice = 229*quantity;
        
        if (foodName == "Pav Bhaji") return foodPrice = 149*quantity;
        
        if (foodName == "Rasgulla") return foodPrice = 50*quantity;
        
        if (foodName == "Paneer Kathi Roll") return foodPrice = 199*quantity;
        
        if (foodName == "Chicken Kathi Roll") return foodPrice = 229*quantity;
        
        if (foodName == "Veg Burger") return foodPrice = 99*quantity;
        
        if (foodName == "Chicken Burger") return foodPrice = 149*quantity;
        
        if (foodName == "Veg Pizza")return foodPrice = 249*quantity;
        
        if (foodName == "Chicken Pizza") return foodPrice = 299*quantity;
        
        else
            System.out.println(foodName + " not found");
        return 0;    
    }
}
