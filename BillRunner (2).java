class BillRunner{

	public static void main(String[] args){
	
		Bill ref = new Bill(123456, 1, "30/07", "10/08", true, true,true, true, 345.87);   
		ref.displayElements();
			
		Bill ref1 = new Bill(1236786,2, "30/08", "10/09", true, true, false, true,123.56);
		ref1.displayElements();
		
		Bill ref2 = new Bill(745963, 3, "30/09", "10/10", true, true, false, true, 852.21);	
		ref2.displayElements();
		
		Bill ref3 = new Bill(984712, 4, "30/10", "10/11", false, true, false, false, 741.32);
		ref3.displayElements();
		
		Bill ref4 = new Bill(654126, 5, "30/11", "10/12", true, true, false, true, 963.78 );	
		ref4.displayElements();
		
		Bill ref5 = new Bill(258963, 6, "30/12", "10/01", false, true, true, false, 345.87);
		ref5.displayElements();
		
		Bill ref6 = new Bill(412652, 7, "30/01", "10/02", true, true, false, false, 789.87);
		ref6.displayElements();
		
		Bill ref7 = new Bill(365412, 8, "30/03", "10/04", false, true, true, true, 465.56);
		ref7.displayElements();
		
		Bill ref8 = new Bill(951452, 9, "30/04", "10/05", false, true, false, true, 369.54);
		ref8.displayElements();
		
		Bill ref9 = new Bill(589743, 10, "30/05", "10/06", true, true, true, false, 324.99);
		ref9.displayElements();
	}
}