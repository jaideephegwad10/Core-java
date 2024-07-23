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
		System.out.println("creating user details....");

		boolean isPassportCreated = false ;
		isPassportCreated = validatePassportUserDetails(cpvLocation , dcdrLocation , givenName , surname , dob , email , isEmailLoginSame ,
														loginId , pwd , confirmPwd, hintQuess , hintAns , captcha);
		System.out.println(isPassportCreated);
		System.out.println(isEmailLoginSame);

	return isPassportCreated ;
	}
	
	public static boolean validatePassportUserDetails(String cpvLocation , String dcdrLocation , String givenName , String surname , String dob , 
										String email , boolean isEmailLoginSame , String loginId , String pwd , String confirmPwd, 
										String hintQuess , String hintAns , String captcha){
		
		boolean isCpvLocationValid = false;
		boolean isDcdrLocationValid = false;
		boolean isGivenNamevalid = false;
		boolean isSurnameValid = false;
		boolean isDobValid = false;
		boolean isEmailValid = false;
		boolean isLoginIdvalid = false;
		boolean isPwdvalid = false;
		boolean isConfirmPwdValid = false;
		boolean isHintQuessValid = false;
		boolean isHintAns = false;
		boolean isCaptchaValid = false;
		boolean isPassportValidated = false;
	
		if(cpvLocation != null){
			cpvLoc = cpvLocation;
			isCpvLocationValid = true;
		}
		else
			System.out.println("cpv location is invalid");

		if(dcdrLocation != null){
			dcdrLoc = dcdrLocation;				
			isDcdrLocationValid = true;
		}
		else
			System.out.println("dcdr location is invalid");
		
		if(givenName != null){
			userName = givenName;				
			isGivenNamevalid = true;
		}
		else
			System.out.println("givenName is invalid");

		if(surname != null){
			userSurname = surname;				
			isSurnameValid = true;
		}
		else
			System.out.println("surname is invalid");
		
		if(dob != null){
			userDob = dob;				
			isDobValid = true;
		}
		else
			System.out.println("dob is invalid");
		
		if(email != null){
			userEmail = email;				
			isEmailValid = true;
		}
		else
			System.out.println("email is invalid");
		
		if(loginId != null){
			userLoginId = loginId;				
			isLoginIdvalid = true;
		}
		else
			System.out.println("loginId is invalid");
		
		if(isEmailLoginSame == false){			
			System.out.println("isEmailLoginSame is invalid");
		}
		if(pwd != null){
			userPwd = pwd;			
			isPwdvalid = true;
		}
		else
			System.out.println("pwd is invalid");
		
		if(confirmPwd != null){
			userConfirmPwd = confirmPwd;
			isConfirmPwdValid = true;
		}
		else
			System.out.println("confirmPwd is invalid");
		
		if(hintQuess != null){
			userHintQuess = hintQuess;				
			isHintQuessValid = true;
		}
		else
			System.out.println("hintQuess is invalid");
		
		if(hintAns != null){
			userHintAns = hintAns;				
			isHintAns = true;
		}
		else
			System.out.println("hintAns is invalid");
		
		if(captcha != null){
			userCaptcha = captcha;				
			isCaptchaValid = true;
		}
		else
			System.out.println("captcha is invalid");
							
		if( isCpvLocationValid && isDcdrLocationValid && isGivenNamevalid && isSurnameValid && isDobValid && isEmailValid && isLoginIdvalid && isPwdvalid && isConfirmPwdValid && isHintQuessValid && isHintAns && isCaptchaValid && isEmailLoginSame ) isPassportValidated = true;	
		
/* System.out.println("isCaptchaValid: " + isCaptchaValid + 
                   ", isConfirmPwdValid: " + isConfirmPwdValid + 
                   ", isCpvLocationValid: " + isCpvLocationValid + 
                   ", isDcdrLocationValid: " + isDcdrLocationValid + 
                   ", isDobValid: " + isDobValid + 
                   ", isEmailLoginSame: " + isEmailLoginSame + 
                   ", isEmailValid: " + isEmailValid + 
                   ", isGivenNameValid: " + isGivenNamevalid + 
                   ", isHintAns: " + isHintAns + 
                   ", isHintQuessValid: " + isHintQuessValid + 
                   ", isLoginIdValid: " + isLoginIdvalid + 
                   ", isPassportValidated: " + isPassportValidated + 
                   ", isPwdValid: " + isPwdvalid + 
                   ", isSurnameValid: " + isSurnameValid); */
		return isPassportValidated;
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
		
		
	}
}