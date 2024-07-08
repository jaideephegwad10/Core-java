class Television{

	static boolean isConnected = false;
	
	public static void turnOn(){
	
		if(isConnected==false){
			isConnected = true;
		System.out.println("TV has turned on..");
		}
		
	return ;	
	}
	
	public static void turnOff(){
	
		if(isConnected==true){
			isConnected = false;
		System.out.println("TV has turned off..");
		}
	return ;	
	}
}