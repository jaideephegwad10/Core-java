class Conditioner{

		static String brandName = "Tresemme";
		static String itemForm  = "Liquid";
		static int  netQuantity = 190;
		static String hairType     = "Frizzy, Dry, Chemically Treated";
		static String materialFeature = "Natural";
		static String productBenefits = "smoothening";
		static String ageRange = "adult";
		static String scent = "Argon oil";
		static int numberOfItems = 1;
		
	public static void main(String[] tresemme){
	
		System.out.println("main started");
		
		System.out.println("The brand of the conditioner is "+brandName);
		System.out.println("The conditioner form is "+itemForm);
		System.out.println("The conditioner is made with "+materialFeature+" ingredients");
		System.out.println("The conditioner is suitable for "+hairType+" hair");
		System.out.println("The main benefit of the conditioner is "+productBenefits);
		System.out.println("The conditioner is for "+ageRange);
		System.out.println("The conditioner quantity in millilitres is "+netQuantity);
		System.out.println("The number of items is "+numberOfItems);
		System.out.println("The conditioner scent is "+scent);
		
		System.out.println("main ended");
	}
}