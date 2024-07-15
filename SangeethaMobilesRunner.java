class SangeethaMobilesRunner{

	static String mobileName = "Iqoo Z9";
	
	public static void main(String[] mobile){
		System.out.println("main started");
		
		int price = SangeethaMobiles.mobilePriceByBrand(mobileName,2);
		System.out.println("The price of "+mobileName+" is "+price);
		
		System.out.println("main ended");
	}
}