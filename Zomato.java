class Zomato {

    public static int getPriceOfFood(String foodName) {
        
        int foodPrice;
        
        if (foodName == "Paneer Butter Masala") return foodPrice = 250;
        
        if (foodName == "Chicken Biryani") return foodPrice = 220;
        
        if (foodName == "Veg Biryani") return foodPrice = 180;
        
        if (foodName == "Paneer Tikka") return foodPrice = 230;
        
        if (foodName == "Butter Chicken") return foodPrice = 270;
        
        if (foodName == "Masala Dosa") return foodPrice = 100;
        
        if (foodName == "Plain Dosa") return foodPrice = 80;
        
        if (foodName == "Pav Bhaji") return foodPrice = 150;
        
        if (foodName == "Chole Bhature") return foodPrice = 170;
        
        if (foodName == "Rajma Chawal") return foodPrice = 190;
        
        if (foodName == "Palak Paneer") return foodPrice = 240;
        
        if (foodName == "Aloo Paratha") return foodPrice = 80;
        
        if (foodName == "Chicken Tikka") return foodPrice = 260;
        
        if (foodName == "Mutton Rogan Josh") return foodPrice = 320;
        
        if (foodName == "Fish Curry") return foodPrice = 300;
        
        if (foodName == "Veg Pulao") return foodPrice = 140;
        
        if (foodName == "Gulab Jamun") return foodPrice = 60;
        
        if (foodName == "Rasgulla") return foodPrice = 50;
        
        if (foodName == "Paneer Kathi Roll") return foodPrice = 210;
        
        if (foodName == "Chicken Kathi Roll") return foodPrice = 250;
        
        else
            System.out.println(foodName + " not found");
        return 0;    
    }
    
    public static int getPriceOfFood(String foodName, int quantity) {
        
        int foodPrice;
        
        if (foodName == "Paneer Butter Masala") return foodPrice = quantity * 250;
        
        if (foodName == "Chicken Biryani") return foodPrice = quantity * 220;
        
        if (foodName == "Veg Biryani") return foodPrice = quantity * 180;
        
        if (foodName == "Paneer Tikka") return foodPrice = quantity * 230;
        
        if (foodName == "Butter Chicken") return foodPrice = quantity * 270;
        
        if (foodName == "Masala Dosa") return foodPrice = quantity * 100;
        
        if (foodName == "Plain Dosa") return foodPrice = quantity * 80;
        
        if (foodName == "Pav Bhaji") return foodPrice = quantity * 150;
        
        if (foodName == "Chole Bhature") return foodPrice = quantity * 170;
        
        if (foodName == "Rajma Chawal") return foodPrice = quantity * 190;
        
        if (foodName == "Palak Paneer") return foodPrice = quantity * 240;
        
        if (foodName == "Aloo Paratha") return foodPrice = quantity * 80;
        
        if (foodName == "Chicken Tikka") return foodPrice = quantity * 260;
        
        if (foodName == "Mutton Rogan Josh") return foodPrice = quantity * 320;
        
        if (foodName == "Fish Curry") return foodPrice = quantity * 300;
        
        if (foodName == "Veg Pulao") return foodPrice = quantity * 140;
        
        if (foodName == "Gulab Jamun") return foodPrice = quantity * 60;
        
        if (foodName == "Rasgulla") return foodPrice = quantity * 50;
        
        if (foodName == "Paneer Kathi Roll") return foodPrice = quantity * 210;
        
        if (foodName == "Chicken Kathi Roll") return foodPrice = quantity * 250;
        
        else
            System.out.println(foodName + " not found");
        return 0;    
    }
}
