class AmazonAccount {
    
    static String userName;
    static String userEmail;
    static String userPassword;
    static String userConfirmPassword;
    static long userMobileNumber;
    
    public static boolean createAccount(String name, String email, String password, String confirmPassword, long mobileNumber) {
        System.out.println("Creating Amazon account...");

        boolean isAccountCreated = false;
        isAccountCreated = validateAmazonUsersDetails(name , email, password, confirmPassword, mobileNumber);
        if(isAccountCreated) System.out.println("Account creation status: " + isAccountCreated);
        return isAccountCreated;
    }
	public static boolean validateAmazonUsersDetails(String name, String email, String password, String confirmPassword, long mobileNumber){
		
		boolean isAccountValid = false;
		boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isMobileNumberValid = false;

        if (name != null) {
            userName = name;
            isNameValid = true;
        } else {
            System.out.println("Name is invalid");
        }

        if (email != null) {
            userEmail = email;
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid");
        }

        if (password != null) {
            userPassword = password;
            isPasswordValid = true;
        } else {
            System.out.println("Password is invalid");
        }

        if (confirmPassword != null) {
            userConfirmPassword = confirmPassword;
            isConfirmPasswordValid = true;
        } else {
            System.out.println("Confirm Password is invalid");
        }

        if (mobileNumber != 0) {
            userMobileNumber = mobileNumber;
            isMobileNumberValid = true;
        } else {
            System.out.println("Mobile Number is invalid");
        }

        if (isNameValid && isEmailValid && isPasswordValid && isConfirmPasswordValid && isMobileNumberValid) {
            isAccountValid = true;
        }
	return isAccountValid;
	}

    public static void readAccountData(){
        System.out.println("Fetching account details...");
        System.out.println("Name: " + userName);
        System.out.println("Email: " + userEmail);
        System.out.println("Password: " + userPassword);
        System.out.println("Confirm Password: " + userConfirmPassword);
        System.out.println("Mobile Number: " + userMobileNumber);
    }
}


