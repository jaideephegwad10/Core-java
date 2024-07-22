class XworkzRegistrationRunner {
    public static void main(String[] args) {
        boolean isRegistered = XworkzRegistration.registerStudent("Jaideep", 9876543210L, 9876543210L, "jaideep@yahoo.com", 
                                                                  "1BM20EC059", "B.E.", "Computer Science", "vtu University", 2024, "Software Developer");

        if (isRegistered) {
            XworkzRegistration.readStudentData();
        } else {
            System.out.println("Registration failed. Please check the input parameters.");
        }
    }
}
