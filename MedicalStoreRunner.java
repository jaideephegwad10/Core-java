class MedicineStoreRunner{

	public static void main(String[] tea){
		System.out.println("main started");
		
		boolean isMedicineNameAdded = MedicalStore.addMedicineName("Paracetamol");
				isMedicineNameAdded = MedicalStore.addMedicineName("Aspirin");
				isMedicineNameAdded = MedicalStore.addMedicineName("Amoxilin");
				isMedicineNameAdded = MedicalStore.addMedicineName("Metformin");
				isMedicineNameAdded = MedicalStore.addMedicineName("Omeprazole");
				isMedicineNameAdded = MedicalStore.addMedicineName("Ibuprofen");
				isMedicineNameAdded = MedicalStore.addMedicineName("Atorvastatin");
				isMedicineNameAdded = MedicalStore.addMedicineName("Omeprazole");
				isMedicineNameAdded = MedicalStore.addMedicineName("Lisinopril");
				isMedicineNameAdded = MedicalStore.addMedicineName("Hydrochlorothiazide");
				
		if(isMedicineNameAdded){
			MedicalStore.printMedicineNames();
		}
		else
			System.out.println("medicine name could not be added");
		
		System.out.println("main started");		
	}
}