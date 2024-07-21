class FacebookRegistratonRunner{

	public static void main(String[] run){
		
		FacebookRegistration.createAccount("sachin", "Tendulkar", "24/06/1973", "male", "sarahtendulkar", 9876543210L);
		FacebookRegistration.readData();
	}
}