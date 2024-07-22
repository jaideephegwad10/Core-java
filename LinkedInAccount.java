class LinkedInAccount {
    
    static String userName;
    static String userEmail;
    static String userPassword;
    static String userConfirmPassword;
    static String userPhoneNumber;
    static String userCurrentJob;
    static String userCompanyName;
    static String userCollege;
    static String userDegree;
    static String userFieldOfStudy;
    static String userGraduationYear;
    static String userSkills;

    public static boolean createAccount(String name, String email, String password, String confirmPassword, String phoneNumber, 
                                        String currentJob, String companyName, String college, String degree, 
                                        String fieldOfStudy, String graduationYear, String skills) {
        System.out.println("Creating LinkedIn account...");

        boolean isAccountCreated = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isPhoneNumberValid = false;
        boolean isCurrentJobValid = false;
        boolean isCompanyNameValid = false;
        boolean isCollegeValid = false;
        boolean isDegreeValid = false;
        boolean isFieldOfStudyValid = false;
        boolean isGraduationYearValid = false;
        boolean isSkillsValid = false;

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

        if (phoneNumber != null) {
            userPhoneNumber = phoneNumber;
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone Number is invalid");
        }

        if (currentJob != null) {
            userCurrentJob = currentJob;
            isCurrentJobValid = true;
        } else {
            System.out.println("Current Job is invalid");
        }

        if (companyName != null) {
            userCompanyName = companyName;
            isCompanyNameValid = true;
        } else {
            System.out.println("Company Name is invalid");
        }

        if (college != null) {
            userCollege = college;
            isCollegeValid = true;
        } else {
            System.out.println("College is invalid");
        }

        if (degree != null) {
            userDegree = degree;
            isDegreeValid = true;
        } else {
            System.out.println("Degree is invalid");
        }

        if (fieldOfStudy != null) {
            userFieldOfStudy = fieldOfStudy;
            isFieldOfStudyValid = true;
        } else {
            System.out.println("Field of Study is invalid");
        }

        if (graduationYear != null) {
            userGraduationYear = graduationYear;
            isGraduationYearValid = true;
        } else {
            System.out.println("Graduation Year is invalid");
        }

        if (skills != null) {
            userSkills = skills;
            isSkillsValid = true;
        } else {
            System.out.println("Skills are invalid");
        }

        if (isNameValid && isEmailValid && isPasswordValid && isConfirmPasswordValid && isPhoneNumberValid &&
            isCurrentJobValid && isCompanyNameValid && isCollegeValid && isDegreeValid && isFieldOfStudyValid &&
            isGraduationYearValid && isSkillsValid) {
            isAccountCreated = true;
        }

        System.out.println("Account creation status: " + isAccountCreated);
        return isAccountCreated;
    }

    public static void readAccountData() {
        System.out.println("Fetching account details...");
        System.out.println("Name: " + userName);
        System.out.println("Email: " + userEmail);
        System.out.println("Password: " + userPassword);
        System.out.println("Confirm Password: " + userConfirmPassword);
        System.out.println("Phone Number: " + userPhoneNumber);
        System.out.println("Current Job: " + userCurrentJob);
        System.out.println("Company Name: " + userCompanyName);
        System.out.println("College: " + userCollege);
        System.out.println("Degree: " + userDegree);
        System.out.println("Field of Study: " + userFieldOfStudy);
        System.out.println("Graduation Year: " + userGraduationYear);
        System.out.println("Skills: " + userSkills);
    }
}


