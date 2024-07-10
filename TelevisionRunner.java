class TelevisionRunner{

	public static void main(String[] bpl){
	
		System.out.println("main started");
		
			Television.turnOn();
			Television.increaseVolume();
			Television.increaseVolume();
			Television.increaseVolume();
			
			Television.decreaseVolume();
			Television.decreaseVolume();
			Television.decreaseVolume();
			Television.turnOff();
		
		System.out.println("main ended");
	}
}