class Sunscreen{
        
    public static void main(String[] neutrogena){
    
        System.out.println("main started");
		
		getFeatures();
         
        System.out.println("main ended");
    }
	
	public static void getFeatures(){
		
		String brandName = "Neutrogena";
        String scent = "Unscented";
        String productBenefits = "Non-Comedogenic";
        int sunProtectionFactor = 50;
        int itemWeight = 30;
        int numberOfItems = 1;
        double netQuantity = 30.0;
        String skinType = "All";
        String activeIngredients = "Helioplex";
        String itemDimensions = "1 x 1 x 1 Millimeters";
		
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
       
	}
}
