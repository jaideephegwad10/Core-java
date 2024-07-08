class VacuumCleaner{

	static boolean isConnected = false;
	
	public static void turnOn(){
	
		if(isConnected==false){
			isConnected = true;
		System.out.println("VacuumCleaner is turned on..");
		}
		
	return ;	
	}
	
	public static void turnOff(){
	
		if(isConnected==true){
			isConnected = false;
		System.out.println("VacuumCleaner is turned off..");
		}
	return ;	
	}
}