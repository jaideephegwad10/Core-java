class InstagramSignUp{

	static long mobileNumber;
	static String fullName;
	static String username;
	static String password;
	static String dob;
	static int confirmationCode;
	
	public static boolean createAccount(String fullNameIn ,String usernameIn ,String dobIn ,int confirmationCodeIn ,String passwordIn ,long mobileNumberIn){
		boolean isAccountCreated = false;
		System.out.println("Creating account...");

		fullName = fullNameIn;
		username = usernameIn;
		mobileNumber = mobileNumberIn;
		password = passwordIn;
		dob = dobIn;
		confirmationCode = confirmationCodeIn;

		System.out.println("Account created successfully..");

		return isAccountCreated = true;
	}
	
	public static void readData(){
		System.out.println("fetching details...");
		
		System.out.println("full name: "+fullName);
		System.out.println("username: "+username);
		System.out.println("mobile Number: "+mobileNumber);
		System.out.println("date of birth: "+dob);
		System.out.println("confirmation code: "+confirmationCode);
		System.out.println("password: "+password);
				
	}
}