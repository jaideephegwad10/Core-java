class AirConditionerRunner{

	public static void main(String[] haier){
	
		System.out.println("main started");
		
		AirConditioner.onOrOff();
		AirConditioner.increaseTemperature();
		AirConditioner.increaseTemperature();
		AirConditioner.decreaseTemperature();
		AirConditioner.decreaseTemperature();
		AirConditioner.onOrOff();
		
		System.out.println("main ended");
	}
}