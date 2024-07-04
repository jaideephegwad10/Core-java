class IceCream{
		
		
    public static void main(String[] amul){
    
        System.out.println("main started");
        
        getFeatures();
        System.out.println("main ended");
    }
	
	public static void getFeatures(){
		
		String brandName = "Amul";
        String speciality = "suitable for vegetarians";
        int itemWeight = 1;
        int packageWeight = 1;
        String packageInformation = "Tub";
        
		System.out.println("The brand  name of the dairy product is "+brandName);
        System.out.println("The speciality is "+speciality);
        System.out.println("The item weight is "+itemWeight+" kilograms");
        System.out.println("The package weight is "+packageWeight+" kilograms");
        System.out.println("The package information is "+packageInformation);
        		
	}
}
