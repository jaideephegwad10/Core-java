class Laptop{

	public static void main(String[] asus){
	
		System.out.println("main started");
		getFeatures();
		System.out.println("main ended");
	}
	
	public static void getFeatures(){
		
		String brandName = "ASUS";
		String modelName = "VivoBook 15 (2021)";
		String colour  = "Transparent Silver";
		int  hardDiskSpace  = 512;
		String cpuModel     = "Celeron N4020";
		int ramSize = 4;
		String operatingSystem = "Windows 11 Home";
		String specialFeature = "Fingerprint Reader, Backlit Keyboard, Anti Glare Coating";
		String graphicsCard = "Integrated";
		
		System.out.println("The laptop brand name is "+brandName);
		System.out.println("The model name is "+modelName);
		System.out.println("The colour is "+colour);
		System.out.println("Size of the hard disk is "+hardDiskSpace);
		System.out.println("The CPU model name is "+cpuModel);
		System.out.println("The size of ram is "+ramSize+"GB");
		System.out.println("The operating system used is "+operatingSystem);
		System.out.println("The graphics card is "+graphicsCard);
		
	}
}