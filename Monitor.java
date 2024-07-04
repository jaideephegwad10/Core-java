class Monitor{

		static String brandName = "MSI";
		static String resolution  = "FHD 1080p";
		static int  screenSize  = 22;
		static String aspectRatio  = "16:9";
		static String screenSurfaceDescription = "Flat";
		
	public static void main(String[] electronics){
	
		System.out.println("main started");

		System.out.println("The monitor brand name is "+brandName);
		System.out.println("It has a resolution of "+resolution);
		System.out.println("Its screen size is "+screenSize);
		System.out.println("Its aspect ratio is "+aspectRatio);
		System.out.println("The screen surface is "+screenSurfaceDescription);
		
		System.out.println("main ended");
	}
}