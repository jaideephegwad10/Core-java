class Monitor{


	public static void main(String[] electronics){
	
		System.out.println("main started");
		getFeatures();
		
		System.out.println("main ended");
	}
	
	public static void getFeatures(){
		
		String brandName = "MSI";
		String resolution  = "FHD 1080p";
		int  screenSize  = 22;
		String aspectRatio  = "16:9";
		String screenSurfaceDescription = "Flat";
		
		System.out.println("The monitor brand name is "+brandName);
		System.out.println("It has a resolution of "+resolution);
		System.out.println("Its screen size is "+screenSize);
		System.out.println("Its aspect ratio is "+aspectRatio);
		System.out.println("The screen surface is "+screenSurfaceDescription);
		
	}
}