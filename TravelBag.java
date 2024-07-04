class TravelBag{

                
    public static void main(String[] fatmug){
    
        System.out.println("main started");
		
		getFeatures();
         
        System.out.println("main ended");
    }
	
	public static void getFeatures(){
		
		String brandName = "FATMUG";
        String material = "Polyester";
        String colour = "Black";
        String productDimensions = "38L x 26W x 9H Centimeters";
        String specialFeature = "Zip Closure";
        String recommendedUses = "Clothing";
        String closureType = "Zipper";
        String shape = "Rectangular";
        int numberOfItems = 1;
        String size = "Medium-Small";
		
		System.out.println("The brand name of the bag is "+brandName);
        System.out.println("The material is "+material);
        System.out.println("The colour is "+colour);
        System.out.println("The product dimensions are "+productDimensions);
        System.out.println("The special feature is "+specialFeature);
        System.out.println("The recommended use for the product is "+recommendedUses);
        System.out.println("The closure type is "+closureType);
        System.out.println("The shape is "+shape);
        System.out.println("The number of items is "+numberOfItems);
        System.out.println("The size is "+size);
       
	}
}
