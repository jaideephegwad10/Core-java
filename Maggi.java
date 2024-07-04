class Maggi{

	public static void main(String[] food){
	
		System.out.println("main Started");
		
		getFeatures();
		
		
		System.out.println("main ended");
	}
	
	public static void getFeatures(){
		
		double price = 75.0;
		int weightInGms = 420;
		String ingredients[] = {"Maida","Palm oil","Iodized salt","Wheat gluten","Thickeners","Acidity regulators & Humectant","Toastedd onion flakes","colour","Milk","Mustard","Oats","Soy"};
		String dietType = "Vegetarian";
		
		System.out.println("The price of Maggi is: "+price);
		System.out.println("The quantity is: "+weightInGms);
		System.out.println("The Diet type is: "+dietType);
		
		for(String ingredient : ingredients){
				
				System.out.println(ingredient);
		
		}
	
	
	}

}