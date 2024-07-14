class AirtelRechargePlan{

	public static int searchPlans(String planName){
	
		int planPrice ;
		
		if(planName == "50GB data" ){//1
			planPrice = 361;
		return planPrice ;
		}
		
		if(planName == "1GB/day day for 30 days"){//2
			planPrice = 211;
		return planPrice ;
		}
		
		if(planName == "15GB data"){//3
			planPrice = 181;
		return planPrice ;
		}
		
		if(planName == "unlimited data for 2 days"){//4
			planPrice = 99;
		return planPrice ;
		}
		
		if(planName == "2GB/day for 365 days"){//5
			planPrice = 3599;
		return planPrice ;
		}
		
		if(planName == "2.5GB/day for 365 days"){//6
			planPrice = 3999;
		return planPrice ;
		}
		
		if(planName == "2.5GB/day for 84 days"){//7
			planPrice = 1199;
		return planPrice ;
		}
		
		if(planName == "3GB/day for 56 days"){//8
			planPrice = 838;
		return planPrice ;
		}
		
		if(planName == "Rs4237.29 talktime"){//9
			planPrice = 5000;
		return planPrice ;
		}
		
		if(planName == "6GB data for 84 days"){//10
			planPrice = 509;
		return planPrice ;
		}
		
		if(planName == "3GB/day for 28 days"){//11
			planPrice = 449;
		return planPrice ;
		}
		
		if(planName == "25GB for 30 days"){//12
			planPrice = 335;
		return planPrice ;
		}
		
		if(planName == "60GB data for 1 month"){//13
			planPrice = 609;
		return planPrice ;
		}
		
		if(planName == "6GB data for 77 days"){//14
			planPrice = 489;
		return planPrice ;
		}
		
		if(planName == "847.46 talktime"){//15
			planPrice = 1000;
		return planPrice ;
		}
		
		else
			System.out.println(planName+" not found");
	return 0;	
	}
}