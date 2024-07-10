<<<<<<< HEAD
class Blender{

	static boolean 	isConnected 	= false;
	static int 		currentSpeed	= 0;
	static int		maxSpeed		= 5;
	static int 		minSpeed		= 0;
	
	public static void onOrOff(){
	
		if(!isConnected){
			isConnected = true;
		System.out.println("Blender has turned on..");
		}
		
		else{
			isConnected = false;
		System.out.println("Blender has turned off..");
		}
	return ;	
	}
	
	public static void increaseSpeed(){
		
		System.out.println("increaseSpeed started");
		
		if(isConnected){
			
			if(currentSpeed<maxSpeed){
				currentSpeed++;
				System.out.println("current speed is "+currentSpeed);
			}
			else{
				System.out.println("speed is maximum");
			}
		}
		else{
			System.out.println("blender is off");
		} 
			
		System.out.println("increaseSpeed ended");
	return;	
	}
	
	public static void decreaseSpeed(){
		
		System.out.println("decreaseSpeed started");
		
		if(isConnected){
			
			if(currentSpeed>minSpeed){
				currentSpeed--;
				System.out.println("current speed is "+currentSpeed);
			}
			else{
				System.out.println("speed is minimum");
			}
		}
		else{
			System.out.println("blender is off");
		} 
			
		System.out.println("decreaseSpeed ended");
	return;	
	}
=======
class Blender{

	static boolean isConnected = false;
	
	public static void turnOn(){
	
		if(isConnected==false){
			isConnected = true;
		System.out.println("Blender has turned on..");
		}
		
	return ;	
	}
	
	public static void turnOff(){
	
		if(isConnected==true){
			isConnected = false;
		System.out.println("Blender has turned off..");
		}
	return ;	
	}
>>>>>>> origin/methodsUsingSeperateClass
}