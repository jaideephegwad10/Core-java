class BillRunner{

	public static void main(String[] args){
	
		Bill ref = new Bill();
		
		ref.billReferenceId = 123456;
		ref.billSequenceNo = 1;
		ref.billIssueDate = "30/07";
		ref.billDueDate = "10/08";
		ref.isBillPaid = true;
		ref.isBillLatest = true;
		ref.isFinalBill = true;
		ref.taxInclusiveBill = true;
		ref.billAmt = 345.87;    
	
		ref.displayElements();
			
		Bill ref1 = new Bill();
		
		ref1.billReferenceId = 1236786;
		ref1.billSequenceNo = 2;
		ref1.billIssueDate = "30/08";
		ref1.billDueDate = "10/09";
		ref1.isBillPaid = true;
		ref1.isBillLatest = true;
		ref1.isFinalBill = true;
		ref1.taxInclusiveBill = true;
		ref1.billAmt = 123.56;    
	
		ref1.displayElements();
		
		
		
		
		Bill ref2 = new Bill();
		
		ref2.billReferenceId = 745963;
		ref2.billSequenceNo = 3;
		ref2.billIssueDate = "30/09";
		ref2.billDueDate = "10/10";
		ref2.isBillPaid = true;
		ref2.isBillLatest = true;
		ref2.isFinalBill = true;
		ref2.taxInclusiveBill = true;
		ref2.billAmt = 852.21;    
	
		ref2.displayElements();
		
					Bill ref3 = new Bill();
		
		ref3.billReferenceId = 984712;
		ref3.billSequenceNo = 4;
		ref3.billIssueDate = "30/10";
		ref3.billDueDate = "10/11";
		ref3.isBillPaid = false;
		ref3.isBillLatest = false;
		ref3.isFinalBill = false;
		ref3.taxInclusiveBill = false;
		ref3.billAmt = 741.32;    
	
		ref3.displayElements();
		
					Bill ref4 = new Bill();
		
		ref4.billReferenceId = 654126;
		ref4.billSequenceNo = 5;
		ref4.billIssueDate = "30/11";
		ref4.billDueDate = "10/12";
		ref4.isBillPaid = true;
		ref4.isBillLatest = false;
		ref4.isFinalBill = false;
		ref4.taxInclusiveBill = true;
		ref4.billAmt = 963.78;    
	
		ref4.displayElements();
		
					Bill ref5 = new Bill();
		
		ref5.billReferenceId = 258963;
		ref5.billSequenceNo = 6;
		ref5.billIssueDate = "30/12";
		ref5.billDueDate = "10/01";
		ref5.isBillPaid = false;
		ref5.isBillLatest = true;
		ref5.isFinalBill = true;
		ref5.taxInclusiveBill = false;
		ref5.billAmt = 345.87;    
	
		ref5.displayElements();
		
					Bill ref6 = new Bill();
		
		ref6.billReferenceId = 412652;
		ref6.billSequenceNo = 7;
		ref6.billIssueDate = "30/01";
		ref6.billDueDate = "10/02";
		ref6.isBillPaid = true;
		ref6.isBillLatest = true;
		ref6.isFinalBill = false;
		ref6.taxInclusiveBill = false;
		ref6.billAmt = 789.87;    
	
		ref6.displayElements();
		
					Bill ref7 = new Bill();
		
		ref7.billReferenceId = 365412;
		ref7.billSequenceNo = 8;
		ref7.billIssueDate = "30/03";
		ref7.billDueDate = "10/04";
		ref7.isBillPaid = false;
		ref7.isBillLatest = false;
		ref7.isFinalBill = true;
		ref7.taxInclusiveBill = true;
		ref7.billAmt = 465.56;    
	
		ref7.displayElements();
		
					Bill ref8 = new Bill();
		
		ref8.billReferenceId = 951452;
		ref8.billSequenceNo = 9;
		ref8.billIssueDate = "30/04";
		ref8.billDueDate = "10/05";
		ref8.isBillPaid = false;
		ref8.isBillLatest = true;
		ref8.isFinalBill = false;
		ref8.taxInclusiveBill = true;
		ref8.billAmt = 369.54;    
	
		ref8.displayElements();
		
					Bill ref9 = new Bill();
		
		ref9.billReferenceId = 589743;
		ref9.billSequenceNo = 10;
		ref9.billIssueDate = "30/05";
		ref9.billDueDate = "10/06";
		ref9.isBillPaid = true;
		ref9.isBillLatest = false;
		ref9.isFinalBill = true;
		ref9.taxInclusiveBill = false;
		ref9.billAmt = 324.99;    
	
		ref9.displayElements();
	}
}