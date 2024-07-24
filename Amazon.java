class Amazon{

	static String productNames[] = {null,null,null,null,null,null};
	static int index = 0;
	
	public static boolean addProductName(String productName){
	
		boolean isProductNameAdded = false;
		
		if(index < productNames.length){
			
			if(productName!=null){
				productNames[index++] = productName;
				isProductNameAdded = true;
				System.out.println(productName+" added to the list");
			}
			else
				System.out.println("Tea name is invalid");
		}
		else
			System.out.println("Maximum number reached.. cannaot add "+productName);
		
		return isProductNameAdded;
	}
	
	public static void printProductNames(){
		System.out.println("Available tea are");
		for(String productName : productNames)
			System.out.println(productName);
	}
}