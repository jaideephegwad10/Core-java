class Spotify{
	
	static String email;
	static String setPassword;
	static String name ;
	static String dob ;
	static String gender;

	public static boolean createAccount(String emailIn, String setPasswordIn, String nameIn , String dobIn , String genderIn){
		System.out.println("Creating account...");
		
		boolean isAccountCreated = false;
		
		isAccountCreated = validateSpotifyUserDetails(emailIn,setPasswordIn,nameIn,dobIn,genderIn);
		
		System.out.println("Account created successfully..");
		
		return isAccountCreated;
	}
	
	public static boolean validateSpotifyUserDetails(String emailIn, String setPasswordIn, String nameIn , String dobIn , String genderIn){
		
		boolean isAccountValid = false;
		boolean isEmailValid = false;
		boolean isPasswordValid = false;
		boolean isNameValid = false;
		boolean isDobValid = false;
		boolean isGenderValid = false;
		
		if(emailIn!=null){
			email = emailIn;
			isEmailValid = true;
		}
		else
			System.out.println("email is invalid");
		
		if(setPasswordIn!=null){
			setPassword = setPasswordIn;
			isPasswordValid = true;
		}
		else
			System.out.println("password is invalid");
		
		if(nameIn!=null){
			name = nameIn;
			isNameValid = true;
		}
		else
			System.out.println("name is invalid");

		if(dobIn!=null){
			dob = dobIn;
			isDobValid = true;
		}
		else
			System.out.println("dob is invalid");
		
		if(genderIn!=null){
			gender = genderIn;
			isGenderValid = true;
		}
		else
			System.out.println("gender is invalid");

		if(isEmailValid && isPasswordValid && isNameValid && isDobValid && isGenderValid) isAccountValid = true;
		
		return isAccountValid;	
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