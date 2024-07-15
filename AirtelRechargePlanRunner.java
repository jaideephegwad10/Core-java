class AirtelRechargePlanRunner{

	static String planName = "50GB data";

	public static void main(String[] recharge){
		System.out.println("main started");
		
		int price = AirtelRechargePlan.searchPlans(planName, 2);
		System.out.println("The Price of "+planName+" is "+ price);
		
		System.out.println("main started");
	}
}