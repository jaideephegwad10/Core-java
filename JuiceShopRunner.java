class JuiceShopRunner{

	public static void main(String[] juice){
		System.out.println("main started");
		
		boolean isJuiceNameAdded = JuiceShop.addJuiceName("Mango");
				isJuiceNameAdded = JuiceShop.addJuiceName("Butterfruit");
				isJuiceNameAdded = JuiceShop.addJuiceName("orange");
				isJuiceNameAdded = JuiceShop.addJuiceName("watermelon");
				isJuiceNameAdded = JuiceShop.addJuiceName("apple");
				isJuiceNameAdded = JuiceShop.addJuiceName("musk melon");
				isJuiceNameAdded = JuiceShop.addJuiceName("lime");
		//if(isJuiceNameAdded){
			JuiceShop.displayJuiceNames();
		/* }
		else
			System.out.println("Juice name could not be added"); */
		
		System.out.println("main ended");		
	}
}