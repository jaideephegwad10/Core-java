class PowerBank{

		static String brandName = "MI";
		static String connectorType  = "USB, Micro USB";
		static int  batteryCapacity  = 2000;
		static String colour     = "black";
		static String specialFeature = "Short Circuit Protection, Fast Charging";
		 
	public static void main(String[] battery){
	
		System.out.println("main started");
		
		System.out.println("The brand name is "+brandName);
		System.out.println("connector type is "+connectorType);
		System.out.println("Battery capacity is "+batteryCapacity);
		System.out.println("The colour of powerbank is  "+colour);
		System.out.println("Special feature of the powerbank is "+specialFeature);
		
		System.out.println("main ended");
	}
}