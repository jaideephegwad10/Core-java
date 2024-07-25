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
				isProductNameAdded = Amazon.addProductName("Shampoo");
				isProductNameAdded = Amazon.addProductName("Soap");
				isProductNameAdded = Amazon.addProductName("T-shirt");
								
		if(isProductNameAdded){
			Amazon.printProductNames();
		}
		else
			System.out.println("product name could not be added");
		
		boolean isProductNameUpdated = Amazon.updateProductName("Airpods","Headphones");
		if(isProductNameUpdated)
			Amazon.printProductNames();
		
		boolean isProductNameDeleted = Amazon.deleteProductName("Shoes");
		if(isProductNameDeleted)
			Amazon.printProductNames();
		
		System.out.println("main started");		
	}
}