class Netflix{
	static String email ;
	static String password;
	static String firstName;
	static String lastName;
	static long cardnumber;
	static String expiryDate;
	static int cvv;

	public static boolean createAccount(String emailIn, String passwordIn, String firstNameIn , String lastNameIn , long cardnumberIn, String expiryDateIn , int cvvIn){
		System.out.println("Creating account...");
		
		boolean isAccountCreated = false;
		
		email = emailIn;
		password = passwordIn;
		firstName = firstNameIn;
		lastName = lastNameIn;
		cardnumber = cardnumberIn;
		expiryDate = expiryDateIn;
		cvv = cvvIn;
		
		System.out.println("Account created successfully..");
		
		return isAccountCreated = true;
	}
	
	public static void readData(){
		System.out.println("fetching details...");
		
		System.out.println("email: "+email);
		System.out.println("password: "+password);
		System.out.println("first name: "+firstName);
		System.out.println("lastname: "+lastName);
		System.out.println("card number: "+cardnumber);
		System.out.println("expiry date: "+expiryDate);
		System.out.println("cvv: "+cvv);
		
	}
}