class XworkzRegistration {

    static String fullName;
    static long contactNumber;
    static long whatsappNumber;
    static String emailId;
    static String usn;
    static String qualification;
    static String stream;
    static String collegeName;
    static int yearOfPassedOut;
    static String offeredAs;

    public static boolean registerStudent(String name, long contact, long whatsapp, String email, String usnIn, 
                                          String qualificationIn, String streamIn, String college, int year, String offer) {
        System.out.println("Registering student...");

        boolean isRegistrationSuccessful = false;
        boolean isNameValid = false;
        boolean isContactValid = false;
        boolean isWhatsappValid = false;
        boolean isEmailValid = false;
        boolean isUsnValid = false;
        boolean isQualificationValid = false;
        boolean isStreamValid = false;
        boolean isCollegeValid = false;
        boolean isYearValid = false;
        boolean isOfferedAsValid = false;

        if (name != null) {
            fullName = name;
            isNameValid = true;
        } else {
            System.out.println("Name is invalid");
        }

        if (contact > 0) {
            contactNumber = contact;
            isContactValid = true;
        } else {
            System.out.println("Contact Number is invalid");
        }

        if (whatsapp > 0) {
            whatsappNumber = whatsapp;
            isWhatsappValid = true;
        } else {
            System.out.println("Whatsapp Number is invalid");
        }

        if (email != null) {
            emailId = email;
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid");
        }

        if (usnIn != null) {
            usn = usnIn;
            isUsnValid = true;
        } else {
            System.out.println("USN is invalid");
        }

        if (qualificationIn != null) {
            qualification = qualificationIn;
            isQualificationValid = true;
        } else {
            System.out.println("Qualification is invalid");
        }

        if (streamIn != null) {
            stream = streamIn;
            isStreamValid = true;
        } else {
            System.out.println("Stream is invalid");
        }

        if (college != null) {
            collegeName = college;
            isCollegeValid = true;
        } else {
            System.out.println("College Name is invalid");
        }

        if (year > 0) {
            yearOfPassedOut = year;
            isYearValid = true;
        } else {
            System.out.println("Year of Passed Out is invalid");
        }

        if (offer != null) {
            offeredAs = offer;
            isOfferedAsValid = true;
        } else {
            System.out.println("Offered As is invalid");
        }

        if (isNameValid && isContactValid && isWhatsappValid && isEmailValid && isUsnValid && isQualificationValid && 
            isStreamValid && isCollegeValid && isYearValid && isOfferedAsValid) {
            isRegistrationSuccessful = true;
        }

        System.out.println("Registration status: " + isRegistrationSuccessful);
        return isRegistrationSuccessful;
    }

    public static void readStudentData() {
        System.out.println("Fetching student details...");
        System.out.println("Full Name: " + fullName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("WhatsApp Number: " + whatsappNumber);
        System.out.println("Email ID: " + emailId);
        System.out.println("USN: " + usn);
        System.out.println("Qualification: " + qualification);
        System.out.println("Stream: " + stream);
        System.out.println("College Name: " + collegeName);
        System.out.println("Year of Passed Out: " + yearOfPassedOut);
        System.out.println("Offered As: " + offeredAs);
    }
}

