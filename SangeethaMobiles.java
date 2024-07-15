class SangeethaMobiles {
    
    public static int mobilePriceByBrand(String mobileName) {
        
        int mobilePrice;
        
        if (mobileName == "Moto g85") return mobilePrice = 17999;
        
        if (mobileName == "Realme GT neo") return mobilePrice = 34000;
        
        if (mobileName == "Moto edge 50 fusion") return mobilePrice = 22999;
        
        if (mobileName == "Realme 12 plus") return mobilePrice = 17999;
        
        if (mobileName == "Realme Narzo 70 pro") return mobilePrice = 16999;
        
        if (mobileName == "Oneplus CE 4") return mobilePrice = 21999;
        
        if (mobileName == "Redmi note 13") return mobilePrice = 14999;
        
        if (mobileName == "Poco M6") return mobilePrice = 12999;
        
        if (mobileName == "Nothing CMF") return mobilePrice = 14999;
        
        if (mobileName == "Nothing 2a") return mobilePrice = 24000;
        
        if (mobileName == "Oppo F19") return mobilePrice = 24999;
        
        if (mobileName == "Iqoo Z9") return mobilePrice = 17999;
        
        if (mobileName == "Iphone 14 plus") return mobilePrice = 54999;
        
        if (mobileName == "Samsung m34") return mobilePrice = 13999;
        
        if (mobileName == "Vivo T3") return mobilePrice = 18999;
        
        else
            System.out.println(mobileName + " not found");
        return 0;
    }
    
    public static int mobilePriceByBrand(String mobileName, int quantity) {
        
        int mobilePrice;
        
        if (mobileName == "Moto g85") return mobilePrice = 17999 * quantity;
        
        if (mobileName == "Realme GT neo") return mobilePrice = 34000 * quantity;
        
        if (mobileName == "Moto edge 50 fusion") return mobilePrice = 22999 * quantity;
        
        if (mobileName == "Realme 12 plus") return mobilePrice = 17999 * quantity;
        
        if (mobileName == "Realme Narzo 70 pro") return mobilePrice = 16999 * quantity;
        
        if (mobileName == "Oneplus CE 4") return mobilePrice = 21999 * quantity;
        
        if (mobileName == "Redmi note 13") return mobilePrice = 14999 * quantity;
        
        if (mobileName == "Poco M6") return mobilePrice = 12999 * quantity;
        
        if (mobileName == "Nothing CMF") return mobilePrice = 14999 * quantity;
        
        if (mobileName == "Nothing 2a") return mobilePrice = 24000 * quantity;
        
        if (mobileName == "Oppo F19") return mobilePrice = 24999 * quantity;
        
        if (mobileName == "Iqoo Z9") return mobilePrice = 17999 * quantity;
        
        if (mobileName == "Iphone 14 plus") return mobilePrice = 54999 * quantity;
        
        if (mobileName == "Samsung m34") return mobilePrice = 13999 * quantity;
        
        if (mobileName == "Vivo T3") return mobilePrice = 18999 * quantity;
        
        else
            System.out.println(mobileName + " not found");
        return 0;
    }
}
