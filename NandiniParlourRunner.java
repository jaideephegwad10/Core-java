class NandiniParlourRunner{

	static String productName = "slim milk";
	
	public static void main(String[] milk){
		System.out.println("main started");
		
		int price = NandiniParlour.getProductPriceByName(productName,3);
		System.out.println("The price of "+productName+" is "+price);
		
		System.out.println("main ended");
	}
}