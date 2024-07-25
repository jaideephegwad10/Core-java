import java.util.*;

class JuiceShop{
	static String juiceNames[] = {null,null,null,null,null,null};
	static int index;

	public static boolean addJuiceName(String juiceName){
		boolean isJuiceNameAdded = false;
		if(index<juiceNames.length){
			if(juiceName != null){
				juiceNames[index++] = juiceName;
				isJuiceNameAdded = true;
				System.out.println(juiceName+" added to the menu");
			}
			else
				System.out.println("Juice Name is Invalid");

		}
		else
			System.out.println("Maximum number reached.. cannaot add "+juiceName);
			
		return isJuiceNameAdded;

	}

	public static void displayJuiceNames(){
		System.out.println("Available juices are:");
		for(String juiceName:juiceNames){
			System.out.println(juiceName);
		}

	}
	
	public static boolean updateJuiceName(String oldJuiceName, String newJuiceName){
		System.out.println("update operation started");
		
		boolean isJuiceNameUpdated = false;
		for(int position = 0; position < juiceNames.length ; position++){
			
			if(juiceNames[position] == oldJuiceName){
				juiceNames[position] = newJuiceName;
				isJuiceNameUpdated = true;
			}
		}
		if(!isJuiceNameUpdated)
			System.out.println(oldJuiceName+" not found");
		
		System.out.println("update operation ended");
	return isJuiceNameUpdated;
	}
	
	public static boolean deleteJuiceName(String delete){
		
		boolean isJuiceNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<juiceNames.length ; position++){
			if(juiceNames[position]!=delete){
				juiceNames[newPosition] = juiceNames[position];
				newPosition++;
			}
			else
				isJuiceNameDeleted = true;
		}
			juiceNames = Arrays.copyOf(juiceNames,newPosition);
			
			if(!isJuiceNameDeleted)
				System.out.println(delete+" not found");
		return isJuiceNameDeleted;	
	}
	
}