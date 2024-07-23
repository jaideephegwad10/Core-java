class BankAccount {

    static String accountHolderName;
    static String accountNumber;
    static String bankName;
    static String accountType;
    static double accountBalance;
    static String accountPassword;
    static String address;
    static String email;
    static long mobileNumber;
    static String panCard;

    public static boolean createAccount(String name, String number, String bank, String type, double balance, 
                                        String password, String address, String email, long mobile, String pan) {
        System.out.println("Creating Bank account...");

        boolean isAccountCreated = false;
        
        return isAccountCreated = validateAccountDetails( name,  number,  bank,  type,  balance, 
															password,  address,  email,  mobile,  pan);
    }

	public static boolean validateAccountDetails(String name, String number, String bank, String type, double balance, 
                                        String password, String address, String email, long mobile, String pan){
		
		boolean isAccountValid = false;
		boolean isNameValid = false;
        boolean isNumberValid = false;
        boolean isBankValid = false;
        boolean isTypeValid = false;
        boolean isBalanceValid = false;
        boolean isPasswordValid = false;
        boolean isAddressValid = false;
        boolean isEmailValid = false;
        boolean isMobileValid = false;
        boolean isPanValid = false;

        if (name != null) {
            accountHolderName = name;
            isNameValid = true;
        } else {
            System.out.println("Name is invalid");
        }

        if (number != null) {
            accountNumber = number;
            isNumberValid = true;
        } else {
            System.out.println("Account Number is invalid");
        }

        if (bank != null) {
            bankName = bank;
            isBankValid = true;
        } else {
            System.out.println("Bank Name is invalid");
        }

        if (type != null) {
            accountType = type;
            isTypeValid = true;
        } else {
            System.out.println("Account Type is invalid");
        }

        if (balance >= 0) {
            accountBalance = balance;
            isBalanceValid = true;
        } else {
            System.out.println("Account Balance is invalid");
        }

        if (password != null) {
            accountPassword = password;
            isPasswordValid = true;
        } else {
            System.out.println("Account Password is invalid");
        }

        if (address != null) {
            address = address;
            isAddressValid = true;
        } else {
            System.out.println("Address is invalid");
        }

        if (email != null) {
            email = email;
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid");
        }

        if (mobile > 0) {
            mobileNumber = mobile;
            isMobileValid = true;
        } else {
            System.out.println("Mobile Number is invalid");
        }

        if (pan != null) {
            panCard = pan;
            isPanValid = true;
        } else {
            System.out.println("PAN Card is invalid");
        }

        if (isNameValid && isNumberValid && isBankValid && isTypeValid && isBalanceValid && isPasswordValid &&
            isAddressValid && isEmailValid && isMobileValid && isPanValid) {
            isAccountValid = true;
        }
		return isAccountValid;
	}
	
    public static void readAccountData() {
        System.out.println("Fetching account details...");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Account Password: " + accountPassword);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("PAN Card: " + panCard);
    }
}

