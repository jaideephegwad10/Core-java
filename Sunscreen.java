class Sunscreen{

	    static String brandName = "Neutrogena";
        static String scent = "Unscented";
        static String productBenefits = "Non-Comedogenic";
        static int sunProtectionFactor = 50;
        static int itemWeight = 30;
        static int numberOfItems = 1;
        static double netQuantity = 30.0;
        static String skinType = "All";
        static String activeIngredients = "Helioplex";
        static String itemDimensions = "1 x 1 x 1 Millimeters";
        
    public static void main(String[] neutrogena){
    
        System.out.println("main started");
    
        System.out.println("The brand name of the sunscreen is "+brandName);
        System.out.println("The scent is "+scent);
        System.out.println("The product benefits are "+productBenefits);
        System.out.println("The sun protection factor is "+sunProtectionFactor+" SPF");
        System.out.println("The item weight is "+itemWeight+" grams");
        System.out.println("The number of items is "+numberOfItems);
        System.out.println("The net quantity is "+netQuantity+" millilitres");
        System.out.println("The sunscreen is suitable for "+skinType+" skin");
        System.out.println("The active ingredients are "+activeIngredients);
        System.out.println("The item dimensions (L x W x H) are "+itemDimensions);
        
        System.out.println("main ended");
    }
}
