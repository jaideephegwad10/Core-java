class WashingMachine{

	static boolean isConnected = false;
	
	public static void turnOn(){
	
		if(isConnected==false){
			isConnected=true;
		System.out.println("Washing Machine has turned on..");
		}
	}
	
	public static void turnOff(){
	
		if(isConnected==true){
			isConnected = false;
		System.out.println("Washing Machine has turned off..");
		}
	}
}