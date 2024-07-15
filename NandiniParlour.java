class NandiniParlour {
    
    public static int getProductPriceByName(String productName) {
        
        int productPrice;
        
        if (productName == "1Ltr Toned Milk (Blue Packet)") return productPrice = 42;
        
        if (productName == "1Ltr Homogenised Toned Milk") return productPrice = 43;
        
        if (productName == "butter milk(200ml)") return productPrice = 46;
        
        if (productName == "lassi(200ml)") return productPrice = 48;
        
        if (productName == "Full Cream Milk") return productPrice = 55;
        
        if (productName == "slim milk") return productPrice = 40;
        
        if (productName == "curd(500g)") return productPrice = 23;
        
        if (productName == "paneer(200g)") return productPrice = 55;
        
        if (productName == "butter(100g)") return productPrice = 48;
        
        if (productName == "ghee(500g)") return productPrice = 300;
        
        else
            System.out.println(productName + " not found");
        return 0;
    }
	
	public static int getProductPriceByName(String productName,int quantity) {
        
        int productPrice;
        
        if (productName == "1Ltr Toned Milk (Blue Packet)") return productPrice = 42*quantity;
        
        if (productName == "1Ltr Homogenised Toned Milk") return productPrice = 43*quantity;
        
        if (productName == "butter milk(200ml)") return productPrice = 46*quantity;
        
        if (productName == "lassi(200ml)") return productPrice = 48*quantity;
        
        if (productName == "Full Cream Milk") return productPrice = 55*quantity;
        
        if (productName == "slim milk") return productPrice = 40*quantity;
        
        if (productName == "curd(500g)") return productPrice = 23*quantity;
        
        if (productName == "paneer(200g)") return productPrice = 55*quantity;
        
        if (productName == "butter(100g)") return productPrice = 48*quantity;
        
        if (productName == "ghee(500g)") return productPrice = 300*quantity;
        
        else
            System.out.println(productName + " not found");
        return 0;
    }
	
}
