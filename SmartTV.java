class SmartTV{

       
        
    public static void main(String[] onePlus){
    
        System.out.println("main started");

        getFeatures();
        
        System.out.println("main ended");
    }
	
	public static void getFeatures(){
		
		String brandName = "OnePlus";
        int screenSize = 43;
        String displayTechnology = "LED";
        String resolution = "4K";
        int refreshRate = 60;
        String specialFeature = "Browser";
        String includedComponents = "1 LED TV, 2 Table Stand Base, 1 User Manual, 1 Remote Control, 1 AV IN Adapter, 1 AC Cord, 2 AAA Battery";
        String connectivityTechnology = "Wi-Fi, USB, Ethernet, HDMI";
        String aspectRatio = "16:9";
        String productDimensions = "14.1D x 106W x 63H Centimeters";
		
		System.out.println("The brand name of the is "+brandName);
        System.out.println("The screen size is "+screenSize+" inches");
        System.out.println("The display technology is "+displayTechnology);
        System.out.println("The resolution is "+resolution);
        System.out.println("The refresh rate is "+refreshRate+" Hz");
        System.out.println("The special feature is "+specialFeature);
        System.out.println("The included components are "+includedComponents);
        System.out.println("The connectivity technology is "+connectivityTechnology);
        System.out.println("The aspect ratio is "+aspectRatio);
        System.out.println("The product dimensions are "+productDimensions);
	}
}
