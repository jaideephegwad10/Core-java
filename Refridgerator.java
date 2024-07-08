class Refridgerator{

	static boolean isConnected = false;
	
	public static void turnOn(){
	
		if(isConnected==false){
			isConnected = true;
		System.out.println("Fridge has turned on..");
		}
		
	return ;	
	}
	
	public static void turnOff(){
	
		if(isConnected==true){
			isConnected = false;
		System.out.println("Fridge has turned off..");
		}
	return ;	
	}
}
}