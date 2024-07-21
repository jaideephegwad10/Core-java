class EmailSignUpRunner{

	public static void main(String[] run){
		
		EmailSignUp.createAccount("virat", "kohli", "04/11/1988", "male" , "virat.1010@gmail.com", "anushka&aakay", 9876543210L);
		EmailSignUp.readData();
	}
}