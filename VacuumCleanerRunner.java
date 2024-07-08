class VacuumCleanerRunner{

	public static void main(String[] run){
	
		System.out.println("main started");
		
		VacuumCleaner.turnOn();
		VacuumCleaner.turnOff();
		
		System.out.println("main ended");
	}
}