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
	
	public DebitCard(){System.out.println("New object created");}
	
	public DebitCard(int cardId, String cardHolderName, long cardNo, String expDate, int cvv){
		System.out.println("New object created");
		
		this.cardId = cardId;
		this.cardHolderName = cardHolderName;
		this.cardNo = cardNo;
		this.expDate = expDate;
		this.cvv = cvv;
	}
}









