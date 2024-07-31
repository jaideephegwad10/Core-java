class Bill{

	//states or variables or references or fields
	int billReferenceId;
	int billSequenceNo;
	String billIssueDate;
	String billDueDate;
	boolean isBillPaid;
	boolean isBillLatest;
	boolean isFinalBill;
	boolean taxInclusiveBill;
	double billAmt;
	
	//behaviour
	public void displayElements(){
		System.out.println("-----------------------------------------------");
		System.out.println("Bill reference id:"+billReferenceId);
		System.out.println("Bill sequence number:"+billSequenceNo);
		System.out.println("Bill issued on:"+billIssueDate);
		System.out.println("Bill due date:"+billDueDate);
		System.out.println("Bill payment status:"+isBillPaid);
		System.out.println("Is Bill latest:"+isBillLatest);
		System.out.println("Is this final bill:"+isFinalBill);
		System.out.println("Is tax included:"+taxInclusiveBill);
		System.out.println("Total bill amount:"+billAmt);
		
	}
	
	
}