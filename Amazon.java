import java.util.*;

class Amazon{

	static String productNames[] = {null,null,null,null,null,null};
	static int index = 0;
	
	public static boolean addProductName(String productName){								//create
	
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
	
	public static void printProductNames(){													//read
		System.out.println("Available tea are");
		for(String productName : productNames)
			System.out.println(productName);
	}
	
	public static boolean updateProductName(String oldProductName, String newProductName){				//update
		System.out.println("update operation started");
		
		boolean isProductNameUpdated = false;
		for(int position = 0; position < productNames.length ; position++){
			
			if(productNames[position] == oldProductName){
				productNames[position] = newProductName;
				isProductNameUpdated = true;
			}
		}
		if(!isProductNameUpdated)
			System.out.println(oldProductName+" not found");
		
		System.out.println("update operation ended");
	return isProductNameUpdated;
	}
	
	public static boolean deleteProductName(String delete){										//delete
		
		boolean isProductNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<productNames.length ; position++){
			if(productNames[position]!=delete){
				productNames[newPosition] = productNames[position];
				newPosition++;
			}
			else
				isProductNameDeleted = true;
		}
			productNames = Arrays.copyOf(productNames,newPosition);
			
			if(!isProductNameDeleted)
				System.out.println(delete+" not found");
		return isProductNameDeleted;	
	} 
}