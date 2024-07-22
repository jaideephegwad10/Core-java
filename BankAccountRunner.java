class BankAccountRunner {
    public static void main(String[] args) {
        boolean isAccountCreated = BankAccount.createAccount("jaideep", "123456789", "SBI", "Savings", 1000.50, "securePass123", "no 42/c sonennahalli bengaluru", "jaideep@gmail.com" , 1234567890L, "bllhq234");

        if (isAccountCreated) {
            BankAccount.readAccountData();
        } else {
            System.out.println("Account creation failed. Please check the input parameters.");
        }
    }
}