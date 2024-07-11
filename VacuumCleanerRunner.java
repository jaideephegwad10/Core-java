class VacuumCleanerRunner{

	public static void main(String[] run){
	
		System.out.println("main started");
		
		VacuumCleaner.onOrOff();
		VacuumCleaner.increaseSpeed();
		VacuumCleaner.increaseSpeed();
		VacuumCleaner.increaseSpeed();
		VacuumCleaner.decreaseSpeed();
		VacuumCleaner.decreaseSpeed();
		VacuumCleaner.decreaseSpeed();
		VacuumCleaner.onOrOff();
		
		System.out.println("main ended");
	}
}