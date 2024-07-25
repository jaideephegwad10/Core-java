import java.util.*;

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
	
	public static boolean updateBrandName(String oldBrandName, String newBrandName){
		System.out.println("update operation started");
		
		boolean isBrandNameUpdated = false;
		for(int position = 0; position < brandNames.length ; position++){
			
			if(brandNames[position] == oldBrandName){
				brandNames[position] = newBrandName;
				isBrandNameUpdated = true;
			}
		}
		if(!isBrandNameUpdated)
			System.out.println(oldBrandName+" not found");
		
		System.out.println("update operation ended");
	return isBrandNameUpdated;
	}
	
	public static boolean deleteBrandName(String delete){
		
		boolean isBrandNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<brandNames.length ; position++){
			if(brandNames[position]!=delete){
				brandNames[newPosition] = brandNames[position];
				newPosition++;
			}
			else
				isBrandNameDeleted = true;
		}
			brandNames = Arrays.copyOf(brandNames,newPosition);
			
			if(!isBrandNameDeleted)
				System.out.println(delete+" not found");
		return isBrandNameDeleted;	
	}
}