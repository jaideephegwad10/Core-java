class BotttleRunner{

	public static void main(String[] run){
	
		Bottle ref = new Bottle();
		
		ref.brandName = "milton";
		ref.price = 120.00;
		System.out.println(ref);
		System.out.println("Brand Name is "+ref.brandName);
		System.out.println("Price is "+ref.price);
		
		Bottle ref1 = new Bottle();
		
		ref.brandName = "tupper ware";
		ref.price = 70.00;
		System.out.println("Brand Name is "+ref1.brandName);
		System.out.println("Price is "+ref1.price);
		
		Bottle ref4 = new Bottle();
		
		ref4.brandName = "Aquafina";
		ref4.price = 30.99;
		System.out.println("Brand Name is "+ref4.brandName);
		System.out.println("Price is "+ref4.price);
		
		Bottle ref5 = new Bottle();
		
		ref5.brandName = "Aquapure";
		ref5.price = 55.00;
		System.out.println("Brand Name is "+ref5.brandName);
		System.out.println("Price is "+ref5.price);
		
		Bottle ref2 = new Bottle("Bisleri", 20.00);
		
		System.out.println("Brand Name is "+ref2.brandName);
		System.out.println("Price is "+ref2.price);
		
		Bottle ref3 = new Bottle("Kinley",25.00);
		
		System.out.println("Brand Name is "+ref3.brandName);
		System.out.println("Price is "+ref3.price);
	
	}
	
}