class SuperMarket{
	
	public static void main(String[] Dmart){
		
		System.out.println("main started");
		
		String groceries[]   = {"rice","wheat","ragi","soya","sooji","atta","chana dal","maida","moong dal","masoor dal","toor dal","urad dal","Barley","Millet","Quinoa"};
		String vegetables[]  = {"carrot","beans","potato","tomato","beetroot","chilli","ladies finger","raddish","ginger","garlic","cucumber","onion","brinjal","bitter guard","pumpkin"};
		String perfumes[]    = {"Park Avenue","Fogg","Axe","Wild stone","Yardley","Skinn","Engage","Set Wet","Beardo","The Man","Envy","Oscar","Dior","LA' French","Calvin Klein"};
		String fruits[]      = {"Apple","Banana","Orange","Grapes","Strawberry","Blueberry","Mango","Pineapple","Watermelon","Peach","Plum","Cherry","Kiwi","Pear","Avacado"};
		String snacks[]		 = {"Chips","Pretzels","Popcorn","Granola Bars","Crackers","Trail Mix","Fruit Snacks","Cookies","Yogurt","Nuts","Cheese Sticks","Hummus","Rice Cakes","Jerky","Muffins"};
		String chocolates[]  = {"KitKat","Snickers","Twix","Hershey's","Mars","Milky Way","Toblerone","Ferrero Rocher","Lindt","Cadbury Dairy Milk","Nestlé Crunch","Ghirardelli","Godiva","Ritter Sport","Reese's Peanut Butter Cups"};
		String sweets[]      = {"Gulab Jamun","Jalebi","Rasgulla","Ladoo","Kaju Katli","Barfi","Peda","Mysore Pak","Rabri","Sandesh","Modak","Halwa","Malpua","Kheer","Basundi"};
		String iceCreams[]   = {"Kulfi","Rajbhog","Malai","Kesar Pista","Mango Delight","Pineapple Surprise","Sitaphal","Chikoo","Rose","Badam","Gulab Jamun","Butterscotch","Chocolate","Vanilla","Strawberry"};
		String alcohols[]    = {"Jack Daniel's","Amrut","Captain Morgan","Johnnie Walker","Jinro","Rum","Whisky","Brandi","gin","Beer","Tequila","Vodka","Royal Challenge","Kingfisher","McDowell's"};
		String coolDrinks[]  = {"Coca-Cola","Pepsi","Sprite","Fanta","Mountain Dew","7 Up","Dr Pepper","Gatorade","Red Bull","Monster","Snapple","Tropicana","Minute Maid","Nestea","Aquafina"};
		String biscuits[]    = {"Oreo","Digestive","Marie","Parle-G","Good Day","Bourbon","Nice","Cream Cracker","Jammie Dodgers","Rich Tea","Shortbread","Chocolate Chip","Anzac","Arrowroot","Ginger Nut"};
		String footWears[]   = {"Sneakers", "Loafers", "Sandals", "Boots", "Oxfords", "Flip-flops", "Heels", "Espadrilles", "Slippers", "Moccasins", "Clogs", "Wedges", "Trainers", "Brogues", "Platform shoes"};
		String clothes[]     = {"T-shirt", "Jeans", "Dress", "Skirt", "Sweater", "Jacket", "Coat", "Shorts", "Socks", "Shoes", "Hat", "Gloves", "Scarf", "Underwear", "Pajamas"};
		String cosmetics[]   = {"Lipstain","Foundation","Mascara","Eyeliner","Blush","Highlighter","Concealer","Bronzer","Eyeshadow","Lip gloss","Setting spray","Primer","BB cream","CC cream","Setting powder"};
		String milkProducts[] = {"Milk","Butter","Cheese","Yogurt","Cream","Ice cream","Condensed milk","Evaporated milk","Cottage cheese","Whipped cream","Sour cream","Milkshake","Cream cheese","Buttermilk","Ricotta"};
		String homeAppliances[] = {"Refrigerator","Washing machine","Television","Grinder","dish Washer","Speaker","Air Conditioner","Oven","Fan","Mixer","Water Purifier","Pressure Cooker","Toaster","Coffee Maker","Stove","Iron Box","Light Bulb","Kettle","Vacuum Cleaner","Clothes Dryer"};
		
		System.out.println("Welcome to Dmart");
		System.out.println("Here are the list of groceries: ");
		/* System.out.println(groceries[0]+","+groceries[1]+","+groceries[2]+","+groceries[3]+","+groceries[4]+"\n"+
							groceries[5]+","+groceries[6]+","+groceries[7]+","+groceries[8]+","+groceries[9]+"\n"+
							groceries[10]+","+groceries[11]+","+groceries[12]+","+groceries[13]+","+groceries[14]); */
							
		for(String grocery : groceries){
			
			System.out.println(grocery);
		}					
			System.out.println("-----------------------------------");	
			
		System.out.println("Here are the list of vegetables: ");
		/* System.out.println(vegetables[0]+","+vegetables[1]+","+vegetables[2]+","+vegetables[3]+","+vegetables[4]+"\n"+
							vegetables[5]+","+vegetables[6]+","+vegetables[7]+","+vegetables[8]+","+vegetables[9]+"\n"+
							vegetables[10]+","+vegetables[11]+","+vegetables[12]+","+vegetables[13]+","+vegetables[14]); */	
		
		for(String grocery : groceries){
			
			System.out.println(grocery);
		}
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of perfumes: ");
		/* System.out.println(perfumes[0]+","+perfumes[1]+","+perfumes[2]+","+perfumes[3]+","+perfumes[4]+"\n"+
							perfumes[5]+","+perfumes[6]+","+perfumes[7]+","+perfumes[8]+","+perfumes[9]+"\n"+
							perfumes[10]+","+perfumes[11]+","+perfumes[12]+","+perfumes[13]+","+perfumes[14]);
		 */	
		
		for(String perfume : perfumes){
			
			System.out.println(perfume);
		}
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of fruits: ");
		/* System.out.println(fruits[0]+","+fruits[1]+","+fruits[2]+","+fruits[3]+","+fruits[4]+"\n"+
							fruits[5]+","+fruits[6]+","+fruits[7]+","+fruits[8]+","+fruits[9]+"\n"+
							fruits[10]+","+fruits[11]+","+fruits[12]+","+fruits[13]+","+fruits[14]);
		 */	
			
		for(String fruit : fruits){
			
			System.out.println(fruit);
		}	
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of snacks: ");
		/* System.out.println(snacks[0]+","+snacks[1]+","+snacks[2]+","+snacks[3]+","+snacks[4]+"\n"+
							snacks[5]+","+snacks[6]+","+snacks[7]+","+snacks[8]+","+snacks[9]+"\n"+
							snacks[10]+","+snacks[11]+","+snacks[12]+","+snacks[13]+","+snacks[14]);
	 */	
		for(String snack : snacks){
			
			System.out.println(snack);
		}
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of chocolates: ");
		/* System.out.println(chocolates[0]+","+chocolates[1]+","+chocolates[2]+","+chocolates[3]+","+chocolates[4]+"\n"+
							chocolates[5]+","+chocolates[6]+","+chocolates[7]+","+chocolates[8]+","+chocolates[9]+"\n"+
							chocolates[10]+","+chocolates[11]+","+chocolates[12]+","+chocolates[13]+","+chocolates[14]);
		 */

		for(String chocolate : chocolates){
			
			System.out.println(chocolate);
		}
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of sweets: ");
		/* System.out.println(sweets[0]+","+sweets[1]+","+sweets[2]+","+sweets[3]+","+sweets[4]+"\n"+
							sweets[5]+","+sweets[6]+","+sweets[7]+","+sweets[8]+","+sweets[9]+"\n"+
							sweets[10]+","+sweets[11]+","+sweets[12]+","+sweets[13]+","+sweets[14]);
		 */	
		 
		for(String sweet : sweets){
			
			System.out.println(sweet);
		} 
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of iceCreams: ");
		/* System.out.println(iceCreams[0]+","+iceCreams[1]+","+iceCreams[2]+","+iceCreams[3]+","+iceCreams[4]+"\n"+
							iceCreams[5]+","+iceCreams[6]+","+iceCreams[7]+","+iceCreams[8]+","+iceCreams[9]+"\n"+
							alcohols[10]+","+iceCreams[11]+","+iceCreams[12]+","+iceCreams[13]+","+iceCreams[14]);
		 */	
		 
		for(String alcohol : alcohols){
			
			System.out.println(alcohol);
		} 
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of alcohols: ");
		/* System.out.println(alcohols[0]+","+alcohols[1]+","+alcohols[2]+","+alcohols[3]+","+alcohols[4]+"\n"+
							alcohols[5]+","+alcohols[6]+","+alcohols[7]+","+alcohols[8]+","+alcohols[9]+"\n"+
							alcohols[10]+","+alcohols[11]+","+alcohols[12]+","+alcohols[13]+","+alcohols[14]);
		 */
			
		for(String alcohol : alcohols){
			
			System.out.println(alcohol);
		}	
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of coolDrinks: ");
		/* System.out.println(coolDrinks[0]+","+coolDrinks[1]+","+coolDrinks[2]+","+coolDrinks[3]+","+coolDrinks[4]+"\n"+
							coolDrinks[5]+","+coolDrinks[6]+","+coolDrinks[7]+","+coolDrinks[8]+","+coolDrinks[9]+"\n"+
							coolDrinks[10]+","+coolDrinks[11]+","+coolDrinks[12]+","+coolDrinks[13]+","+coolDrinks[14]);	
		 */	
			
		for(String coolDrink : coolDrinks){
			
			System.out.println(coolDrink);
		}	
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of biscuits: ");
		/* System.out.println(biscuits[0]+","+biscuits[1]+","+biscuits[2]+","+biscuits[3]+","+biscuits[4]+"\n"+
							biscuits[5]+","+biscuits[6]+","+biscuits[7]+","+biscuits[8]+","+biscuits[9]+"\n"+
							biscuits[10]+","+biscuits[11]+","+biscuits[12]+","+biscuits[13]+","+biscuits[14]);
		 */
			
		for(String biscuit : biscuits){
			
			System.out.println(biscuit);
		}	
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of footWears: ");
		/* System.out.println(footWears[0]+","+footWears[1]+","+footWears[2]+","+footWears[3]+","+footWears[4]+"\n"+
							footWears[5]+","+footWears[6]+","+footWears[7]+","+footWears[8]+","+footWears[9]+"\n"+
							footWears[10]+","+footWears[11]+","+footWears[12]+","+footWears[13]+","+footWears[14]);
		 */	
			
		for(String footWear : footWears){
			
			System.out.println(footWear);
		}	
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of clothes: ");
		/* System.out.println(clothes[0]+","+clothes[1]+","+clothes[2]+","+clothes[3]+","+clothes[4]+"\n"+
							clothes[5]+","+clothes[6]+","+clothes[7]+","+clothes[8]+","+clothes[9]+"\n"+
							clothes[10]+","+clothes[11]+","+clothes[12]+","+clothes[13]+","+clothes[14]);
		 */	
			
		for(String cloth : clothes){
			
			System.out.println(cloth);
		}	
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of cosmetics: ");
		/* System.out.println(cosmetics[0]+","+cosmetics[1]+","+cosmetics[2]+","+cosmetics[3]+","+cosmetics[4]+"\n"+
							cosmetics[5]+","+cosmetics[6]+","+cosmetics[7]+","+cosmetics[8]+","+cosmetics[9]+"\n"+
							cosmetics[10]+","+cosmetics[11]+","+cosmetics[12]+","+cosmetics[13]+","+cosmetics[14]);
		 */	
		 
		for(String cosmetic : cosmetics){
			
			System.out.println(cosmetic);
		}	
			System.out.println("-----------------------------------");
			
		System.out.println("Here are the list of milkProducts: ");
		/* System.out.println(milkProducts[0]+","+milkProducts[1]+","+milkProducts[2]+","+milkProducts[3]+","+milkProducts[4]+"\n"+
							milkProducts[5]+","+milkProducts[6]+","+milkProducts[7]+","+milkProducts[8]+","+milkProducts[9]+"\n"+
							milkProducts[10]+","+milkProducts[11]+","+milkProducts[12]+","+milkProducts[13]+","+milkProducts[14]);					
		 */

		for(String milkProduct : milkProducts){
			
			System.out.println(milkProduct);
		}
			System.out.println("-----------------------------------");				
		
		System.out.println("Here are the list of Home Appliances: ");
		/* System.out.println(homeAppliances[0]+","+homeAppliances[1]+","+homeAppliances[2]+","+homeAppliances[3]+","+homeAppliances[4]+"\n"+
							homeAppliances[5]+","+homeAppliances[6]+","+homeAppliances[7]+","+homeAppliances[8]+","+homeAppliances[9]+"\n"+
							homeAppliances[10]+","+homeAppliances[11]+","+homeAppliances[12]+","+homeAppliances[13]+","+homeAppliances[14]+"\n"+
							homeAppliances[15]+","+homeAppliances[16]+","+homeAppliances[17]+","+homeAppliances[18]+","+homeAppliances[19]);					
		 */	
			
		for(String homeAppliance : homeAppliances){
			
			System.out.println(homeAppliance);
		}	
			System.out.println("-----------------------------------");
		
		System.out.println("main ended");
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}