class DebitCardRunner{

	public static void main(String[] run){
	
		DebitCard card1 = new DebitCard();
		card1.cardId = 432234;
		card1.cardHolderName = "Ananth";
		card1.cardNo = 7412896355557139L;
		card1.expDate = "06/25";
		card1.cvv = 433;
		card1.displayData();
		
		DebitCard card2 = new DebitCard();
        card2.cardId = 234567;
        card2.cardHolderName = "Aarav";
        card2.cardNo = 8765432101234567L;
        card2.expDate = "07/26";
        card2.cvv = 234;
        card2.displayData();
        
        DebitCard card3 = new DebitCard();
        card3.cardId = 345678;
        card3.cardHolderName = "Vihaan";
        card3.cardNo = 7654321012345678L;
        card3.expDate = "08/27";
        card3.cvv = 345;
        card3.displayData();
        
        DebitCard card4 = new DebitCard();
        card4.cardId = 456789;
        card4.cardHolderName = "Vivaan";
        card4.cardNo = 6543210123456789L;
        card4.expDate = "09/28";
        card4.cvv = 456;
        card4.displayData();
        
        DebitCard card5 = new DebitCard();
        card5.cardId = 567890;
        card5.cardHolderName = "Aditya";
        card5.cardNo = 5432101234567890L;
        card5.expDate = "10/29";
        card5.cvv = 567;
        card5.displayData();
        
        DebitCard card6 = new DebitCard();
        card6.cardId = 678901;
        card6.cardHolderName = "Arjun";
        card6.cardNo = 4321012345678901L;
        card6.expDate = "11/30";
        card6.cvv = 678;
        card6.displayData();
        
        DebitCard card7 = new DebitCard();
        card7.cardId = 789012;
        card7.cardHolderName = "Sai";
        card7.cardNo = 3210123456789012L;
        card7.expDate = "12/31";
        card7.cvv = 789;
        card7.displayData();
        
        DebitCard card8 = new DebitCard();
        card8.cardId = 890123;
        card8.cardHolderName = "Krishna";
        card8.cardNo = 2101234567890123L;
        card8.expDate = "01/32";
        card8.cvv = 890;
        card8.displayData();
	}
}