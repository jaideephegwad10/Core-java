import java.util.*;

class MedicalStore{

	static String medicineNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int index = 0;
	
	public static boolean addMedicineName(String medicineName){
	
		boolean isMedicineNameAdded = false;
		
		if(index < medicineNames.length){
			
			if(medicineName!=null){
				medicineNames[index++] = medicineName;
				isMedicineNameAdded = true;
				System.out.println(medicineName+" added to the list");
			}
			else
				System.out.println("medicine name is invalid");
		}
		else
			System.out.println("Maximum number reached.. cannaot add "+medicineName);
		
		return isMedicineNameAdded;
	}
	
	public static void printMedicineNames(){
		System.out.println("Available tea are");
		for(String medicineName : medicineNames)
			System.out.println(medicineName);
	}
	
	public static boolean updateMedicineName(String oldMedicineName, String newMedicineName){
		System.out.println("update operation started");
		
		boolean isMedicineNameUpdated = false;
		for(int position = 0; position < medicineNames.length ; position++){
			
			if(medicineNames[position] == oldMedicineName){
				medicineNames[position] = newMedicineName;
				isMedicineNameUpdated = true;
			}
		}
		if(!isMedicineNameUpdated)
			System.out.println(oldMedicineName+" not found");
		
		System.out.println("update operation ended");
	return isMedicineNameUpdated;
	}
	
	public static boolean deleteMedicineName(String delete){
		
		boolean isMedicineNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<medicineNames.length ; position++){
			if(medicineNames[position]!=delete){
				medicineNames[newPosition] = medicineNames[position];
				newPosition++;
			}
			else
				isMedicineNameDeleted = true;
		}
			medicineNames = Arrays.copyOf(medicineNames,newPosition);
			
			if(!isMedicineNameDeleted)
				System.out.println(delete+" not found");
		return isMedicineNameDeleted;	
	}
	
}