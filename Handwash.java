class Handwash{

		static String brandName = "Dettol";
        static int itemWeight  = 1500;
        static String itemDimensions = "22.9 x 10.2 x 30 Centimeters";
        static String scent = "Pine";
        static String ageRange = "Kid, Teen, Adult";
        static String skinType = "All";
        static int itemPackageQuantity = 1;
        static String productBenefits = "Moisturizing";
        static String specialFeature = "pH Balance";
        static String itemForm = "Liquid";
		
    public static void main(String[] dettol){
    
        System.out.println("main started");
        
        System.out.println("The brand of the body wash is "+brandName);
        System.out.println("The item weight is "+itemWeight+" grams");
        System.out.println("The item dimensions (L x W x H) are "+itemDimensions);
        System.out.println("The body wash scent is "+scent);
        System.out.println("The age range for the body wash is "+ageRange);
        System.out.println("The body wash is suitable for "+skinType+" skin");
        System.out.println("The item package quantity is "+itemPackageQuantity);
        System.out.println("The product benefit is "+productBenefits);
        System.out.println("The special feature is "+specialFeature);
        System.out.println("The item form is "+itemForm);
        
        System.out.println("main ended");
    }
}
