class DslrCamera{

    public static void main(String[] sony) {
    
        System.out.println("main started");
		
        String compatibleMountings = "Sony E";
        String photoSensorTechnology = "CMOS";
        String supportedFileFormat = "aps-c";
        String imageStabilisation = "Optical";
        int maximumFocalLength = 50; 
        int opticalZoom = 3; 
        double maximumAperture = 3.5; 
        String meteringDescription = "Evaluative";
        String brand = "Sony";
        String modelName = "Alpha";
        
        System.out.println("The camera's compatible mountings are " + compatibleMountings);
        System.out.println("The photo sensor technology is " + photoSensorTechnology);
        System.out.println("The supported file format is " + supportedFileFormat);
        System.out.println("The image stabilisation is " + imageStabilisation);
        System.out.println("The maximum focal length is " + maximumFocalLength + " millimeters");
        System.out.println("The optical zoom is " + opticalZoom + "x");
        System.out.println("The maximum aperture is " + maximumAperture + " millimeters");
        System.out.println("The metering description is " + meteringDescription);
        System.out.println("The brand name is " + brand);
        System.out.println("The model name is " + modelName);
        
        System.out.println("main ended");
    }
	
	
}
