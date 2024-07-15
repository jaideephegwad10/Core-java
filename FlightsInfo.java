class FlightsInfo {
    
    public static int getFlightPriceByDestinationName(String destinationName) {
        
        int ticketPrice;
        
        if (destinationName == "Chhatrapati Shivaji Maharaj International Airport - BOM") return ticketPrice = 4200;
        
        if (destinationName == "Indira Gandhi International Airport  - DEL") return ticketPrice = 5311;
        
        if (destinationName == "Chennai International Airport - DEL") return ticketPrice = 1500;
        
        if (destinationName == "Rajiv Gandhi International Airport - HYD") return ticketPrice = 2200;
        
        if (destinationName == "Netaji Subhas Chandra Bose International Airport - CCU") return ticketPrice = 5500;
        
        if (destinationName == "Pune International Airport - PNQ") return ticketPrice = 3800;
        
        if (destinationName == "Dabolim Airport - GOI") return ticketPrice = 2084;
        
        if (destinationName == "Sardar Vallabhbhai Patel International Airport - AMD") return ticketPrice = 3300;
        
        if (destinationName == "Jaipur International Airport - JAI") return ticketPrice = 5100;
        
        if (destinationName == "Cochin International Airport - COK") return ticketPrice = 1800;
        
        if (destinationName == "Trivandrum International Airport - TRV") return ticketPrice = 2400;
        
        if (destinationName == "Mangalore International Airport - IXE") return ticketPrice = 2600;
        
        if (destinationName == "Visakhapatnam Airport - VTZ") return ticketPrice = 3500;
        
        if (destinationName == "Chaudhary Charan Singh International Airport - LKO") return ticketPrice = 6000;
        
        if (destinationName == "Jay Prakash Narayan International Airport - PAT") return ticketPrice = 6800;
        
        if (destinationName == "Coimbatore International Airport - CJB") return ticketPrice = 1800;
        
        if (destinationName == "Dr. Babasaheb Ambedkar International Airport - NAG") return ticketPrice = 4000;
        
        if (destinationName == "Devi Ahilyabai Holkar International Airport - IDR") return ticketPrice = 4500;
        
        if (destinationName == "Biju Patnaik International Airport - BBI") return ticketPrice = 5700;
        
        if (destinationName == "Lal Bahadur Shastri International Airport - VNS") return ticketPrice = 6500;
        
        else
            System.out.println(destinationName + " not found");
        return 0;    
    }
	
	public static int getFlightPriceByDestinationName(String destinationName, int numberOfPerson) {
        
        int ticketPrice;
        
        if (destinationName == "Chhatrapati Shivaji Maharaj International Airport - BOM") return ticketPrice = 4200*numberOfPerson;
        
        if (destinationName == "Indira Gandhi International Airport  - DEL") return ticketPrice = 5311*numberOfPerson;
        
        if (destinationName == "Chennai International Airport - DEL") return ticketPrice = 1500*numberOfPerson;
        
        if (destinationName == "Rajiv Gandhi International Airport - HYD") return ticketPrice = 2200*numberOfPerson;
        
        if (destinationName == "Netaji Subhas Chandra Bose International Airport - CCU") return ticketPrice = 5500*numberOfPerson;
        
        if (destinationName == "Pune International Airport - PNQ") return ticketPrice = 3800*numberOfPerson;
        
        if (destinationName == "Dabolim Airport - GOI") return ticketPrice = 2084*numberOfPerson;
        
        if (destinationName == "Sardar Vallabhbhai Patel International Airport - AMD") return ticketPrice = 3300*numberOfPerson;
        
        if (destinationName == "Jaipur International Airport - JAI") return ticketPrice = 5100*numberOfPerson;
        
        if (destinationName == "Cochin International Airport - COK") return ticketPrice = 1800*numberOfPerson;
        
        if (destinationName == "Trivandrum International Airport - TRV") return ticketPrice = 2400*numberOfPerson;
        
        if (destinationName == "Mangalore International Airport - IXE") return ticketPrice = 2600*numberOfPerson;
        
        if (destinationName == "Visakhapatnam Airport - VTZ") return ticketPrice = 3500*numberOfPerson;
        
        if (destinationName == "Chaudhary Charan Singh International Airport - LKO") return ticketPrice = 6000*numberOfPerson;
        
        if (destinationName == "Jay Prakash Narayan International Airport - PAT") return ticketPrice = 6800*numberOfPerson;
        
        if (destinationName == "Coimbatore International Airport - CJB") return ticketPrice = 1800*numberOfPerson;
        
        if (destinationName == "Dr. Babasaheb Ambedkar International Airport - NAG") return ticketPrice = 4000*numberOfPerson;
        
        if (destinationName == "Devi Ahilyabai Holkar International Airport - IDR") return ticketPrice = 4500*numberOfPerson;
        
        if (destinationName == "Biju Patnaik International Airport - BBI") return ticketPrice = 5700*numberOfPerson;
        
        if (destinationName == "Lal Bahadur Shastri International Airport - VNS") return ticketPrice = 6500*numberOfPerson;
        
        else
            System.out.println(destinationName + " not found");
        return 0;    
    }
}
