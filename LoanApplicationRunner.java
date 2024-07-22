class LoanApplicationRunner {
    public static void main(String[] args) {
        boolean isLoanApplied = LoanApplication.applyForLoan("rajanikanth", "01-01-1950", "123 Main St", 9876543210L, 
                                                             "john.doe@example.com", 500000, "Home Renovation", 600000, 750);

        if (isLoanApplied) {
            LoanApplication.readLoanApplicationData();
        } else {
            System.out.println("Loan application failed. Please check the input parameters.");
        }
    }
}
