class LinkedInAccountRunner {
    public static void main(String[] args) {
        boolean isAccountCreated = LinkedInAccount.createAccount("jaideep", "jaideep@gmail.com", "password123", "password123", "1234567890",
                                                                  "Software Engineer", "xworkz", "Bmsce", "engineering",
                                                                  "Electronics and Communication", "2024", "Java, Python, SQL");

        if (isAccountCreated) {
            LinkedInAccount.readAccountData();
        } else {
            System.out.println("Account creation failed. Please check the input parameters.");
        }
    }
}