class MrpStore{

	static String brandNames[] = {null,null,null,null,null,null,null,null,null,null,null};
	static int index = 0;
	
	public static boolean addBrandName(String brandName){
	
		boolean isBrandNameAdded = false;
		
		if(index < brandNames.length){
			
			if(brandName!=null){
				brandNames[index++] = brandName;
				isBrandNameAdded = true;
				System.out.println(brandName+" added to the list");
			}
			else
				System.out.println("brand name is invalid");
		}
		else
			System.out.println("Maximum number reached.. cannaot add "+brandName);
		
		return isBrandNameAdded;
	}
	
	public static void printBrandNames(){
		System.out.println("Available brands are");
		for(String brandName : brandNames)
			System.out.println(brandName);
	}
}