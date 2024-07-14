class FlightsInfoRunner{

	static String flightName = "Rajiv Gandhi International Airport - HYD";
	
	public static void main(String[] flight){
		System.out.println("main started");
		
		int price = FlightsInfo.getFlightPriceByDestinationName(flightName);
		System.out.println("The price for "+flightName+" from Kempegowda International Airport - BLR is "+price);
		
		System.out.println("main ended");
	}
}