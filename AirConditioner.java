class AirConditioner{

	static boolean isConnected 		= false;
	static int     currentValue		= 0;
	static int		maxTemperature	= 10;
	static int 		minTemperature	= 0;
	
	public static void onOrOff(){
	
		if(!isConnected){
			isConnected = true;
		System.out.println("AirConditioner is turned on..");
		}
		else if(isConnected){
			isConnected = false;
		System.out.println("AirConditioner is turned off..");
		}
	return ;	
	}
	
	public static void increaseTemperature(){
		System.out.println("increaseTemperature started");
		if(isConnected){
			if(currentValue<maxTemperature){
				currentValue++;
				System.out.println("current volume is "+currentValue);
			}
			else{
				System.out.println("max value reached");
			}
		}
		else{
			System.out.println("please turn on the device");
		}
		System.out.println("increaseTemperature ended");
	return ;	
	}
	
	public static void decreaseTemperature(){
		System.out.println("decreaseTemperature started");
		if(isConnected){
			if(currentValue>minTemperature){
				currentValue--;
				System.out.println("current temperature is "+currentValue);
			}
			else{
				System.out.println("min value reached");
			}
		}
		else{
			System.out.println("please turn on the device");
		}
		System.out.println("decreaseTemperature ended");
	return ;	
	}
}