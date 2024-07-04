class Swiggy{

	public static void main(String[] online){
	
		System.out.println("main started");
		
		String nonVegStarters[]    = {"Chicken kabab","Chicken Tikka","Mutton Seekh kabab","Tandoori Chicken","Fish Fry","Prawn kabab","Chilly Chicken","Chicken 65","Chicken lollipop","Mutton chops"};
		String vegStarters[]	   = {"Paneer Tikka","Hara Bhara kabab","Veg Seekh kabab","Aloo Tikki","Gobi Manchurian","Babycorn fry","Mushroom Pepper Dry","Veg Spring Rolls","Mushroom Tikka","Veg Soups"};
		String nonVegMainCourses[]  = {"Chicken Biryani","Mutton Biryani","Mutton Rogan Josh","Butter Chicken","Fish Curry","Prawn Masala","Chicken Chettinad","Chicken Korma","Fish Moilee","Lamb Vindaloo"};
		String vegMainCourses[]	   = {"Veg Biryani","Mushroom Biryani","Jeera Rice","Ghee Rice","Noodles","Schezwan Friedrice","Parota","Veg Friedrice","Thai Basil Rice","Ginger Friedrice"};
		
		System.out.println("------------------------------------------------------------------ ");

		System.out.println("The list of Nonveg Starters are: ");
		/*System.out.println(nonVegStarters[0]+","+nonVegStarters[1]+","+nonVegStarters[2]+","+nonVegStarters[3]+","+nonVegStarters[4]+"\n"+
						   nonVegStarters[5]+","+nonVegStarters[6]+","+nonVegStarters[7]+","+nonVegStarters[8]+","+nonVegStarters[9]);*/
		
			for(String nonVegStarter : nonVegStarters){
			
			System.out.println(nonVegStarter);
		}
						   
		System.out.println("------------------------------------------------------------------ ");

		/*System.out.println("The list of veg Starters are: ");
		System.out.println(vegStarters[0]+","+vegStarters[1]+","+vegStarters[2]+","+vegStarters[3]+","+vegStarters[4]+"\n"+
						   vegStarters[5]+","+vegStarters[6]+","+vegStarters[7]+","+vegStarters[8]+","+vegStarters[9]);*/

			for(String vegStarter : vegStarters){
			
			System.out.println(vegStarter);
		}
		
	   System.out.println("------------------------------------------------------------------ ");
		
		System.out.println("The list of Nonveg Maincourse are: ");
		/*System.out.println(nonVegMainCourse[0]+","+nonVegMainCourse[1]+","+nonVegMainCourse[2]+","+nonVegMainCourse[3]+","+nonVegMainCourse[4]+"\n"+
						   nonVegMainCourse[5]+","+nonVegMainCourse[6]+","+nonVegMainCourse[7]+","+nonVegMainCourse[8]+","+nonVegMainCourse[9]);*/
			
				for(String nonVegMainCourse : nonVegMainCourses){
			
			System.out.println(nonVegMainCourse);
		}

		System.out.println("------------------------------------------------------------------ ");
						   
		System.out.println("The list of veg Maincourse are: ");				   
		/*System.out.println(vegMainCourse[0]+","+vegMainCourse[1]+","+vegMainCourse[2]+","+vegMainCourse[3]+","+vegMainCourse[4]+"\n"+
						   vegMainCourse[5]+","+vegMainCourse[6]+","+vegMainCourse[7]+","+vegMainCourse[8]+","+vegMainCourse[9]);*/
				
					for(String vegMainCourse : vegMainCourses){
			
			System.out.println(vegMainCourse);
		}

   		System.out.println("------------------------------------------------------------------ ");

		
				System.out.println("main ended");		   
					
	}
}