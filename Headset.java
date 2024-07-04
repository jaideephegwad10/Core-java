class Headset{

	public static void main(String[] jbl){
	
		System.out.println("main started");
		getFeatures();
		System.out.println("main ended");
	}
	
	public static void getFeatures(){
		
		String brandName = "JBL";
		String colour  = "Blank";
		int  impedance  = 16;
		String earPlacement  = "In Ear";
		String formFactor = "In Ear";
		
		System.out.println("The brand name of headset is "+brandName);
		System.out.println("The colour is "+colour);
		System.out.println("The type of ear placement is "+earPlacement);
		System.out.println("The form factor is "+formFactor);
		System.out.println("The impedance is "+impedance+" ohms");
		
	}
}