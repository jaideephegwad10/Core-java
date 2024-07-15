class Zomato {

    public static int getPriceOfFood(String foodName) {
    
        int foodPrice;
        
        if (foodName == "Paneer Butter Masala") {//1
            foodPrice = 250;
            return foodPrice;
        }
        
        if (foodName == "Chicken Biryani") {//2
            foodPrice = 220;
            return foodPrice;
        }
        
        if (foodName == "Veg Biryani") {//3
            foodPrice = 180;
            return foodPrice;
        }
        
        if (foodName == "Paneer Tikka") {//4
            foodPrice = 230;
            return foodPrice;
        }
        
        if (foodName == "Butter Chicken") {//5
            foodPrice = 270;
            return foodPrice;
        }
        
        if (foodName == "Masala Dosa") {//6
            foodPrice = 100;
            return foodPrice;
        }
        
        if (foodName == "Plain Dosa") {//7
            foodPrice = 80;
            return foodPrice;
        }
        
        if (foodName == "Pav Bhaji") {//8
            foodPrice = 150;
            return foodPrice;
        }
        
        if (foodName == "Chole Bhature") {//9
            foodPrice = 170;
            return foodPrice;
        }
        
        if (foodName == "Rajma Chawal") {//10
            foodPrice = 190;
            return foodPrice;
        }
        
        if (foodName == "Palak Paneer") {//11
            foodPrice = 240;
            return foodPrice;
        }
        
        if (foodName == "Aloo Paratha") {//12
            foodPrice = 80;
            return foodPrice;
        }
        
        if (foodName == "Chicken Tikka") {//13
            foodPrice = 260;
            return foodPrice;
        }
        
        if (foodName == "Mutton Rogan Josh") {//14
            foodPrice = 320;
            return foodPrice;
        }
        
        if (foodName == "Fish Curry") {//15
            foodPrice = 300;
            return foodPrice;
        }
        
        if (foodName == "Veg Pulao") {//16
            foodPrice = 140;
            return foodPrice;
        }
        
        if (foodName == "Gulab Jamun") {//17
            foodPrice = 60;
            return foodPrice;
        }
        
        if (foodName == "Rasgulla") {//18
            foodPrice = 50;
            return foodPrice;
        }
        
        if (foodName == "Paneer Kathi Roll") {//19
            foodPrice = 210;
            return foodPrice;
        }
        
        if (foodName == "Chicken Kathi Roll") {//20
            foodPrice = 250;
            return foodPrice;
        }
        
        else
            System.out.println(foodName + " not found");
        return 0;    
    }
}
