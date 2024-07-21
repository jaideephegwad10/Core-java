class FacebookRegistration{

	static String firstName ;
	static String surname ;
	static long mobileNumber ;
	static String newPassword;
	static String dob;
	static String gender;

	public static boolean createAccount(String firstNameIn ,String surnameIn ,String dobIn ,String genderIn ,String newPasswordIn ,long mobileNumberIn){
		boolean isAccountCreated = false;
		System.out.println("Creating account...");

		firstName = firstNameIn;
		surname = surnameIn;
		mobileNumber = mobileNumberIn;
		newPassword = newPasswordIn;
		dob = dobIn;
		gender = genderIn;

		System.out.println("Account created successfully..");

		return isAccountCreated = true;
	}
	
	public static void readData(){
		System.out.println("fetching details...");
		
		System.out.println("first name: "+firstName);
		System.out.println("surname: "+surname);
		System.out.println("mobile Number: "+mobileNumber);
		System.out.println("date of birth: "+dob);
		System.out.println("gender: "+gender);
		System.out.println("password: "+newPassword);
				
	}
}

