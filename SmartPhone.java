class SmartPhone{

		
		
	public static void main(String[] iphone){
	
		System.out.println("main started");

		getFeatures();
		
		System.out.println("main ended");
	}
	
	public static void getFeatures(){
		
		String brandName = "Apple Iphone";
		String operatingSystem  = "ios 14";
		double  cpuSpeed  = 3.23;
		int memoryStorage  = 128;
		double screenSize = 6.1;
		
		System.out.println("the brand name is "+brandName);
		System.out.println("It works on os "+operatingSystem);
		System.out.println("The cpu speed is "+cpuSpeed+ " GHz");
		System.out.println("The memory storage is "+memoryStorage+" GB");
		System.out.println("The screen size is "+screenSize);
	}
}