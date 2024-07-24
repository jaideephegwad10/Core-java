class JuiceShop{
	static String juiceNames[] = {null,null,null,null,null,null};
	static int index;

	public static boolean addJuiceName(String juiceName){
		boolean isJuiceNameAdded = false;
		if(index<juiceNames.length){
			if(juiceName != null){
				juiceNames[index++] = juiceName;
				isJuiceNameAdded = true;
				System.out.println(juiceName+" added to the menu");
			}
			else
				System.out.println("Juice Name is Invalid");

		}
		else
			System.out.println("Maximum number reached.. cannaot add "+juiceName);
			
		return isJuiceNameAdded;

	}

	public static void displayJuiceNames(){
		System.out.println("Available juices are:")
;		for(String juiceName:juiceNames){
			System.out.println(juiceName);
		}

	}
}