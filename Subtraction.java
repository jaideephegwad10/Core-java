class Subtraction{

	public static void main(String[] calculation){
	System.out.println("main Started");
	//invoking a method
	subtract(100, 20);
	subtract(67,38);		
	
	System.out.println("main ended");
	}

//method declaration
	public static void subtract(int num1 , int num2 ){
	
	System.out.println("subtract started");
	System.out.println(num1-num2);
	System.out.println("subtract ended");
return ;	
}
}