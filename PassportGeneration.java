class PassportGeneration{
	
	static String cpvLoc ;
	static String dcdrLoc ;
	static String userName ;
	static String userSurname ;
	static String userDob ;
	static String userEmail ;
	static boolean isEmailLoginSame ;
	static String userLoginId ;
	static String userPwd ;
	static String userConfirmPwd ;
	static String userHintQuess ;
	static String userHintAns ;
	static String userCaptcha ;
	
	public static boolean createUserPassport(String cpvLocation , String dcdrLocation , String givenName , String surname , String dob , 
										String email , boolean isEmailLoginSame , String loginId , String pwd , String confirmPwd, 
										String hintQuess , String hintAns , String captcha ){
	boolean isPassportCreated = false ;
	System.out.println("creating user details....");
		cpvLoc = cpvLocation;
		dcdrLoc = dcdrLocation;
		userName = givenName;
		userSurname = surname;
		userDob = dob;
		userEmail = email;
		userLoginId = loginId;
		userPwd = pwd;
		userConfirmPwd = confirmPwd;
		userHintQuess = hintQuess;
		userHintAns = hintAns;
		userCaptcha = captcha;
	System.out.println("User details created.");	
	isPassportCreated = true;	
		
	return isPassportCreated ;
	}
	
	public static void readUserData(){
		System.out.println("Fetching.... User details....");
		
			System.out.println("The cpv Location is "+cpvLoc);
			System.out.println("The dcdr Location is "+dcdrLoc);
			System.out.println("The given Name is "+userName);
			System.out.println("The surname is "+userSurname);
			System.out.println("The Date of Birth is "+userDob);
			System.out.println("The Email Id is "+userEmail);
			System.out.println("The Login Id is "+userLoginId);
			System.out.println("The password is "+userPwd);
			System.out.println("Confirm password:"+userConfirmPwd);
			System.out.println("Hint Question is "+userHintQuess);
			System.out.println("Hint answer is "+userHintAns);
			System.out.println("Captcha is "+userCaptcha);
			System.out.println("is passport created:"+isPassportCreated);
		
	}

}