class Hotel{

	public static void main(String[] menu){
			
			System.out.println("main Started");
			
			
			String hotelName = "Ayodhya Grand Hotel";
			String foodItems[] = {"idli","Wada","Masala Dosa","Tea","Coffee","Badam Milk","South Indian Meals","North Indian Meals","Jeera Rice","Veg Biryani","Rava Idly","Noodles","Onion Dosa","Curd Wada","Curd rice","Mushroom Biryani","Gobi Manchurian","Paneer Manchurian","Gobi Noodles","Veg Pulav","Lemon rice","capsicum rice","Butter Naan","Bonda Soup","Dal Fry"};
			
			System.out.println("Welcome to Ayodhya Grand");
			System.out.println("------------------------------------------------");
			System.out.println("The Food items available are:");
											/*System.out.println(foodMenu[0]+","+foodMenu[1]+","+foodMenu[2]+","+foodMenu[3]+","+foodMenu[4]+","+
																foodMenu[5]+","+foodMenu[6]+","+foodMenu[7]+","+foodMenu[8]+","+foodMenu[9]+","+
																foodMenu[10]+","+foodMenu[11]+","+foodMenu[12]+","+foodMenu[13]+","+foodMenu[14]+","+
																foodMenu[15]+","+foodMenu[16]+","+foodMenu[17]+","+foodMenu[18]+","+foodMenu[19]+","+
																foodMenu[20]+","+foodMenu[21]+","+foodMenu[22]+","+foodMenu[23]+","+foodMenu[24]);*/
				/* for(String foodItem : foodItems){
					
					System.out.println(foodItem);
				}	 */	


					for(int index=0;index < foodItems.length-1 ; index++){
						//returns value or ref
						 String value = foodItems[index];
						 System.out.println(value);
					}
			
			System.out.println("main ended");
	}
}