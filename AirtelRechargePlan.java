class AirtelRechargePlan{

	public static int searchPlans(String planName){
	
		int planPrice ;
		
		if(planName == "50GB data" )	return planPrice = 361;
		
		if(planName == "1GB/day day for 30 days")	return	planPrice = 211;
		
		if(planName == "15GB data")	return	planPrice = 181;
		
		if(planName == "unlimited data for 2 days")	return	planPrice = 99;
		
		if(planName == "2GB/day for 365 days")	return	planPrice = 3599;
		
		if(planName == "2.5GB/day for 365 days")	return	planPrice = 3999;
		
		if(planName == "2.5GB/day for 84 days")	return	planPrice = 1199;
		
		if(planName == "3GB/day for 56 days")	return	planPrice = 838;
		
		if(planName == "Rs4237.29 talktime") return	planPrice = 5000;
			
		if(planName == "6GB data for 84 days")	return	planPrice = 509;
	
		if(planName == "3GB/day for 28 days")	return	planPrice = 449;
		
		if(planName == "25GB for 30 days")	return	planPrice = 335;
		
		if(planName == "60GB data for 1 month")return	planPrice = 609;
		
		if(planName == "6GB data for 77 days")	return	planPrice = 489;
		
		if(planName == "847.46 talktime")	return	planPrice = 100;
		
		else
			System.out.println(planName+" not found");
	return 0;	
	}
	
	public static int searchPlans(String planName, int quantity){
	
		int planPrice ;
		
		if(planName == "50GB data" )	return planPrice = quantity*361;
		
		if(planName == "1GB/day day for 30 days")	return	planPrice = quantity*211;
		
		if(planName == "15GB data")	return	planPrice = quantity*181;
		
		if(planName == "unlimited data for 2 days")	return	planPrice = quantity*99;
		
		if(planName == "2GB/day for 365 days")	return	planPrice = quantity*3599;
		
		if(planName == "2.5GB/day for 365 days")	return	planPrice = quantity*3999;
		
		if(planName == "2.5GB/day for 84 days")	return	planPrice = quantity*1199;
		
		if(planName == "3GB/day for 56 days")	return	planPrice = quantity*838;
		
		if(planName == "Rs4237.29 talktime") return	planPrice = quantity*5000;
			
		if(planName == "6GB data for 84 days")	return	planPrice = quantity*509;
	
		if(planName == "3GB/day for 28 days")	return	planPrice = quantity*449;
		
		if(planName == "25GB for 30 days")	return	planPrice = quantity*335;
		
		if(planName == "60GB data for 1 month")return	planPrice = quantity*609;
		
		if(planName == "6GB data for 77 days")	return	planPrice = quantity*489;
		
		if(planName == "847.46 talktime")	return	planPrice = quantity*100;
		
		else
			System.out.println(planName+" not found");
	return 0;	
	}
}