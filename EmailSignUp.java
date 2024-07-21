class EmailSignUp{

	static String name; 
	static String surname;
	static String dob;
	static String gender;
	static String chooseGmailAddress;
	static String password;
	static long phoneNumber;

	public static boolean createAccount(String nameIn ,String surnameIn ,String dobIn ,String genderIn ,String gmailAddressIn ,String pw ,long phNo){
		boolean isAccountCreated = false;
		System.out.println("Creating account...");

		name = nameIn;
		surname = surnameIn;
		dob = dobIn;
		gender = genderIn;
		chooseGmailAddress = gmailAddressIn;
		password = pw;
		phoneNumber = phNo;

		System.out.println("Account created successfully..");

		return isAccountCreated = true;
	}
	
	public static void readData(){
		System.out.println("fetching details...");
		
		System.out.println("name: "+name);
		System.out.println("surname: "+surname);
		System.out.println("date of birth: "+dob);
		System.out.println("gender: "+gender);
		System.out.println("gamail address: "+chooseGmailAddress);
		System.out.println("password: "+password);
		System.out.println("phone number: "+phoneNumber);

		
	}
}

