class Shoes{

		

    public static void main(String[] reebok){

        System.out.println("main started");

		getFeatures();        

        System.out.println("main ended");
    }
	
	public static void getFeatures(){
		
		String materialType = "Mesh, Ethylene Vinyl";
        String closureType = "Lace-Up";
        String heelType = "Flat";
        String waterResistanceLevel = "Not Water Resistant";
        String soleMaterial = "Ethylene Vinyl Acetate";
        String style = "Running";
		
		System.out.println("The material type is "+materialType);
        System.out.println("The closure type is "+closureType);
        System.out.println("The heel type is "+heelType);
        System.out.println("The water resistance level is "+waterResistanceLevel);
        System.out.println("The sole material is "+soleMaterial);
        System.out.println("The style is "+style);
	}
}
