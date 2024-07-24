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
}