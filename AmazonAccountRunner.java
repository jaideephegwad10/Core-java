class AmazonAccountRunner {
    public static void main(String[] args) {
        String name = "John Doe";
        String email = "john.doe@example.com";
        String password = "securePassword123";
        String confirmPassword = "securePassword123";
        String mobileNumber = "1234567890";

        boolean isAccountCreated = AmazonAccount.createAccount("jaideep", "jaideep@gmail.com", "jai123@abc", "jai123@abc", 0);

        if (isAccountCreated) {
            AmazonAccount.readAccountData();
        } else {
            System.out.println("Account creation failed. Please check the input parameters.");
        }
    }
}