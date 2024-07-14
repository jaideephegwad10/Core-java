class FlightsInfo{
	
	public static int getFlightPriceByDestinationName(String flightName){
	
		int ticketPrice ;
		
		if(flightName == "Chhatrapati Shivaji Maharaj International Airport - BOM"){//1
			ticketPrice = 4200;
		return ticketPrice ;
		}
		
		if(flightName == "Indira Gandhi International Airport  - DEL"){//2
			ticketPrice = 5311;
		return ticketPrice ;
		}
		
		if(flightName == "Chennai International Airport - DEL"){//3
			ticketPrice = 1500;
		return ticketPrice ;
		}
		
		if(flightName == "Rajiv Gandhi International Airport - HYD"){//4
			ticketPrice = 2200;
		return ticketPrice ;
		}
		
		if(flightName == "Netaji Subhas Chandra Bose International Airport - CCU"){//5
			ticketPrice = 5500;
		return ticketPrice ;
		}
		
		if(flightName == "Pune International Airport - PNQ"){//6
			ticketPrice = 3800;
		return ticketPrice ;
		}
		
		if(flightName == "Dabolim Airport - GOI"){//7
			ticketPrice = 2084;
		return ticketPrice ;
		}
		
		if(flightName == "Sardar Vallabhbhai Patel International Airport - AMD"){//8
			ticketPrice = 3300;
		return ticketPrice ;
		}
		
		if(flightName == "Jaipur International Airport - JAI"){//9
			ticketPrice = 5100;
		return ticketPrice ;
		}
		
		if(flightName == "Cochin International Airport - COK"){//10
			ticketPrice = 1800;
		return ticketPrice ;
		}
		
		if(flightName == "Trivandrum International Airport - TRV"){//11
			ticketPrice = 2400;
		return ticketPrice ;
		}
		
		if(flightName == "Mangalore International Airport - IXE"){//12
			ticketPrice = 2600;
		return ticketPrice ;
		}
		
		if(flightName == "Visakhapatnam Airport - VTZ"){//13
			ticketPrice = 3500;
		return ticketPrice ;
		}
		
		if(flightName == "Chaudhary Charan Singh International Airport - LKO"){//14
			ticketPrice = 6000;
		return ticketPrice ;
		}
		
		if(flightName == "Jay Prakash Narayan International Airport - PAT"){//15
			ticketPrice = 6800;
		return ticketPrice ;
		}
		
		if(flightName == "Coimbatore International Airport - CJB"){//16
			ticketPrice = 1800;
		return ticketPrice ;
		}
		
		if(flightName == "Dr. Babasaheb Ambedkar International Airport - NAG"){//17
			ticketPrice = 4000;
		return ticketPrice ;
		}
		
		if(flightName == "Devi Ahilyabai Holkar International Airport - IDR"){//18
			ticketPrice = 4500;
		return ticketPrice ;
		}
		
		if(flightName == "Biju Patnaik International Airport - BBI"){//19
			ticketPrice = 5700;
		return ticketPrice ;
		}
		
		if(flightName == "Lal Bahadur Shastri International Airport - VNS"){//20
			ticketPrice = 6500;
		return ticketPrice ;
		}
		
		else
			System.out.println(flightName+" not found");
	return 0;	
	}
}