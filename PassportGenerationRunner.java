class PassportGenerationRunner{

	public static void main(String[] run){
	
		boolean validate = PassportGeneration.createUserPassport("PO", "Bengaluru", "Jaideep A", "Hegwad", "02/10/2002", "jaideep.xorks@gmail.com", true, "po123", "123#abc$ppp", "123#abc$ppp", "what is your dog name", "tyson", "CAB4w5" );
		System.out.println(validate);
		if(validate==true){
			PassportGeneration.readUserData();
		}
		else {
            System.out.println("Account creation failed. Please check the input parameters.");
        }
	}	
	
}