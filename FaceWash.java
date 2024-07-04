class FaceWash{

    public static void main(String[] himalaya){
    
        System.out.println("main started");
        getFeatures();
        System.out.println("main ended");
    }
	
	public static void getFeatures(){
		
		String brandName = "Himalaya";
        double itemWeight  = 0.44;
        String itemDimensions = "14 x 8 x 17 Centimeters";
        String scent = "Neem";
        String ageRange = "Youth, Adult";
        String skinType = "Normal";
        int itemPackageQuantity = 1;
        String productBenefits = "Hydrating, Acne Prevention, Oil Control, Moisturizing";
        String specialFeature = "Unscented";
        String activeIngredients = "Neem, Turmeric";
		
        System.out.println("The brand name of the moisturizer is "+brandName);
        System.out.println("The item weight is "+itemWeight+" kg");
        System.out.println("The item dimensions are "+itemDimensions);
        System.out.println("The moisturizer scent is "+scent);
        System.out.println("The age range for the moisturizer is "+ageRange);
        System.out.println("The moisturizer is suitable for "+skinType+" skin");
        System.out.println("The item package quantity is "+itemPackageQuantity);
        System.out.println("The product benefits are "+productBenefits);
        System.out.println("The special feature is "+specialFeature);
        System.out.println("The active ingredients are "+activeIngredients);
        
	}
}
