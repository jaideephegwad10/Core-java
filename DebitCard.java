class DebitCard{

	int cardId;
	String cardHolderName;
	long cardNo;
	String expDate;
	int cvv;
	
	public void displayData(){
	
		System.out.println("Card details of this user are:");
		System.out.println("Card Id number	: "+cardId);
		System.out.println("Card holder name: "+cardHolderName);
		System.out.println("Card number	: "+cardNo);
		System.out.println("Card expiry date: "+expDate);
		System.out.println("Card cvv	: "+cvv);
		System.out.println("-------------------------------------");
	}
}