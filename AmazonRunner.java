class AmazonRunner{

	public static void main(String[] product){
		System.out.println("main started");
		
		boolean isProductNameAdded = Amazon.addProductName("Smartphone");
				isProductNameAdded = Amazon.addProductName("Smart tv");
				isProductNameAdded = Amazon.addProductName("Smart Watch");
				isProductNameAdded = Amazon.addProductName("Laptops");
				isProductNameAdded = Amazon.addProductName("Shoes");
				isProductNameAdded = Amazon.addProductName("Airpods");
				isProductNameAdded = Amazon.addProductName("Hair Oil");
				isProductNameAdded = Amazon.addProductName("Shampoo ");
				isProductNameAdded = Amazon.addProductName("Soap");
				isProductNameAdded = Amazon.addProductName("T-shirt");
								
		if(isProductNameAdded){
			Amazon.printProductNames();
		}
		else
			System.out.println("product name could not be added");
		
		System.out.println("main started");		
	}
}