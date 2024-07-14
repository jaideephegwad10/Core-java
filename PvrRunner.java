class PvrRunner{

	static String movieName = "Ugramm";
	
	public static void main(String[] movie){
		System.out.println("main started");
		
		int price = Pvr.searchMoviePriceByName(movieName);
		System.out.println("The price for "+movieName+" is "+price);
		
		System.out.println("main ended");
	}
}