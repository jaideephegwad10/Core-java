class DebitCardRunner{

	public static void main(String[] run){
	
		DebitCard card1 = new DebitCard(432234, "Ananth", 7412896355557139L, "06/25", 433);
		card1.displayData();
		
		DebitCard card2 = new DebitCard(234567, "Aarav", 8765432101234567L, "07/26", 234);
        card2.displayData();
        
        DebitCard card3 = new DebitCard(345678, "Vihaan", 7654321012345678L, "08/27", 345);
        card3.displayData();
        
        DebitCard card4 = new DebitCard(456789, "Vivaan", 6543210123456789L, "09/28", 456);
		card4.displayData();
        
        DebitCard card5 = new DebitCard(567890, "Aditya", 5432101234567890L, "10/29", 567);
        card5.displayData();
        
        DebitCard card6 = new DebitCard(678901, "Arjun", 4321012345678901L, "11/30", 678);
        card6.displayData();
        
        DebitCard card7 = new DebitCard(789012, "Sai", 3210123456789012L, "12/31", 789);
        card7.displayData();
        
        DebitCard card8 = new DebitCard(890123, "Krishna", 2101234567890123L, "01/32", 890);
        card8.displayData();
	}
}