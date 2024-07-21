class Spotify{
	
	static String email;
	static String setPassword;
	static String name ;
	static String dob ;
	static String gender;

	public static boolean createAccount(String emailIn, String setPasswordIn, String nameIn , String dobIn , String genderIn){
		System.out.println("Creating account...");
		
		boolean isAccountCreated = false;
		
		email = emailIn;
		setPassword = setPasswordIn;
		name = nameIn;
		dob = dobIn;
		gender = genderIn;
		
		System.out.println("Account created successfully..");
		
		return isAccountCreated = true;
	}
	
	public static void readData(){
		System.out.println("fetching details...");
		
		System.out.println("email: "+email);
		System.out.println("password: "+setPassword);
		System.out.println("name: "+name);
		System.out.println("date of birth: "+dob);
		System.out.println("gender: "+gender);
		
	}
}