class WashingMachineRunner{

	public static void main(String[] bosch){
	
		System.out.println("main started");
		
		WashingMachine.onOrOff();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.onOrOff();
		
		System.out.println("main ended");
	}
}