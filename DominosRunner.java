class DominosRunner{

	static String pizzaName = "Primavera Gourmet-Pizza";
	
	public static void main(String[] pizza){
		System.out.println("main started");
		
		int price = Dominos.getPriceOfPizza(pizzaName);
		System.out.println("The price of "+pizzaName+" is "+price);
		
		System.out.println("main ended");
	}
}