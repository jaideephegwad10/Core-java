class NandiniParlour{
	
	public static int getProductPriceByName(String productName){
	
		int productPrice ;
		
		if(productName == "1Ltr Toned Milk (Blue Packet)"){//1
			productPrice = 42;
		return productPrice ;
		}
		
		if(productName == "1Ltr Homogenised Toned Milk"){//2
			productPrice = 43;
		return productPrice ;
		}
		
		if(productName == "butter milk(200ml)"){//3
			productPrice = 46;
		return productPrice ;
		}
		
		if(productName == "lassi(200ml)"){//4
			productPrice = 48;
		return productPrice ;
		}
		
		if(productName == "Full Cream Milk"){//5
			productPrice = 55;
		return productPrice ;
		}
		
		if(productName == "slim milk"){//6
			productPrice = 40;
		return productPrice ;
		}
		
		if(productName == "curd(500g)"){//7
			productPrice = 23;
		return productPrice ;
		}
		
		if(productName == "paneer(200g)"){//8
			productPrice = 55;
		return productPrice ;
		}
		
		if(productName == "butter(100g)"){//9
			productPrice = 48;
		return productPrice ;
		}
		
		if(productName == "ghee(500g)"){//10
			productPrice = 300;
		return productPrice ;
		}
				
		else
			System.out.println(productName+" not found");
		return 0;
	}
}