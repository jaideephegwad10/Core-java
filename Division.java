class Division{

	public static void main(String[] calculation){
	System.out.println("main Started");
	//invoking a method

		divide(100, 25);
	System.out.println("main ended");
		
	}
		//method declaration
		public static void divide(int num1, int num2){
		
		System.out.println("divide started");
		System.out.println(num1 / num2);
		System.out.println("divide ended");
		return ;
		}
}