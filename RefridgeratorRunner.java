class RefridgeratorRunner{

	public static void main(String[] samsung){
	
		System.out.println("main started");
		
		Refridgerator.onOrOff();
		Refridgerator.increaseTemperature();
		Refridgerator.increaseTemperature();
		Refridgerator.decreaseTemperature();
		Refridgerator.decreaseTemperature();
		Refridgerator.onOrOff();
		
		System.out.println("main ended");
	}
}