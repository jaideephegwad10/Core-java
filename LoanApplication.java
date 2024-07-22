class LoanApplication {

    static String applicantName;
    static String dateOfBirth;
    static String address;
    static long mobileNumber;
    static String email;
    static double loanAmount;
    static String loanPurpose;
    static double annualIncome;
    static int creditScore;

    public static boolean applyForLoan(String name, String dob, String addr, long mobile, String mail, double amount, 
                                       String purpose, double income, int score) {
        System.out.println("Applying for loan...");

        boolean isApplicationSuccessful = false;
        boolean isNameValid = false;
        boolean isDobValid = false;
        boolean isAddressValid = false;
        boolean isMobileValid = false;
        boolean isEmailValid = false;
        boolean isAmountValid = false;
        boolean isPurposeValid = false;
        boolean isIncomeValid = false;
        boolean isScoreValid = false;

        if (name != null) {
            applicantName = name;
            isNameValid = true;
        } else {
            System.out.println("Applicant Name is invalid");
        }

        if (dob != null) {
            dateOfBirth = dob;
            isDobValid = true;
        } else {
            System.out.println("Date of Birth is invalid");
        }

        if (addr != null) {
            address = addr;
            isAddressValid = true;
        } else {
            System.out.println("Address is invalid");
        }

        if (mobile > 0) {
            mobileNumber = mobile;
            isMobileValid = true;
        } else {
            System.out.println("Mobile Number is invalid");
        }

        if (mail != null) {
            email = mail;
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid");
        }

        if (amount > 0) {
            loanAmount = amount;
            isAmountValid = true;
        } else {
            System.out.println("Loan Amount is invalid");
        }

        if (purpose != null) {
            loanPurpose = purpose;
            isPurposeValid = true;
        } else {
            System.out.println("Loan Purpose is invalid");
        }

        if (income > 0) {
            annualIncome = income;
            isIncomeValid = true;
        } else {
            System.out.println("Annual Income is invalid");
        }

        if (score >= 0) {
            creditScore = score;
            isScoreValid = true;
        } else {
            System.out.println("Credit Score is invalid");
        }

        if (isNameValid && isDobValid && isAddressValid && isMobileValid && isEmailValid && isAmountValid && isPurposeValid &&
            isIncomeValid && isScoreValid) {
            isApplicationSuccessful = true;
        }

        System.out.println("Loan application status: " + isApplicationSuccessful);
        return isApplicationSuccessful;
    }

    public static void readLoanApplicationData() {
        System.out.println("Fetching loan application details...");
        System.out.println("Applicant Name: " + applicantName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + email);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Loan Purpose: " + loanPurpose);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("Credit Score: " + creditScore);
    }
}

