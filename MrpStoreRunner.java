class MrpStoreRunner{

	public static void main(String[] Brand){
		System.out.println("main started");
		
		boolean isBrandNameAdded = MrpStore.addBrandName("Kingfisher");
				isBrandNameAdded = MrpStore.addBrandName("Royal Challenge");
				isBrandNameAdded = MrpStore.addBrandName("Old Monk");
				isBrandNameAdded = MrpStore.addBrandName("Signature");
				isBrandNameAdded = MrpStore.addBrandName("Royal Stag");
				isBrandNameAdded = MrpStore.addBrandName("Bacardi");
				isBrandNameAdded = MrpStore.addBrandName("Tuborg");
				isBrandNameAdded = MrpStore.addBrandName("Blenders");
				isBrandNameAdded = MrpStore.addBrandName("Sula Vineyaeds");
				isBrandNameAdded = MrpStore.addBrandName("McDowell's No.1 ");
		if(!isBrandNameAdded){
			
			MrpStore.printBrandNames();
		}
		else
			System.out.println("Brand name could not be added");
		boolean isBrandNameUpdated = MrpStore.updateBrandName("Tuborg", "Imperial Blue");
		if(!isBrandNameUpdated){
			
			MrpStore.printBrandNames();
		}
		else
			System.out.println("Brand name could not be updated");
		boolean isBrandNameDeleted = MrpStore.deleteBrandName("Signature");
			MrpStore.printBrandNames();
		
		System.out.println("main started");		
	}
}