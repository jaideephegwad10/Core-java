class FanRunner{

	public static void main(String[] usha){
	
		System.out.println("main started");
		
		Fan.onOrOff();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.increaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.decreaseSpeed();
		Fan.onOrOff();
		
		System.out.println("main ended");
	}
}