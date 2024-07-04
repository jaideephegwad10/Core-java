class Laptop{

		static String brandName = "ASUS";
		static String modelName = "VivoBook 15 (2021)";
		static String colour  = "Transparent Silver";
		static int  hardDiskSpace  = 512;
		static String cpuModel     = "Celeron N4020";
		static int ramSize = 4;
		static String operatingSystem = "Windows 11 Home";
		static String specialFeature = "Fingerprint Reader, Backlit Keyboard, Anti Glare Coating";
		static String graphicsCard = "Integrated";
		
	public  void main(String[] asus){
	
		System.out.println("main started");
	
		System.out.println("The laptop brand name is "+brandName);
		System.out.println("The model name is "+modelName);
		System.out.println("The colour is "+colour);
		System.out.println("Size of the hard disk is "+hardDiskSpace);
		System.out.println("The CPU model name is "+cpuModel);
		System.out.println("The size of ram is "+ramSize+"GB");
		System.out.println("The operating system used is "+operatingSystem);
		System.out.println("The graphics card is "+graphicsCard);
		
		System.out.println("main ended");
	}
}