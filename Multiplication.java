class Multiplication{

	public static void main(String[] calculation){
	
		System.out.println("main Started");
		//invoking a method
		multiply(23, 12);
		
		System.out.println("main ended");
	}

	//method declaration
	public static void multiply(int num1 , int num2 ){
		
		System.out.println("Multply Started");
		System.out.println(num1 * num2 );		
		System.out.println("Multiply ended");
	return ;
	}
}