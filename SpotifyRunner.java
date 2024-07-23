class SpotifyRunner{

	public static void main(String[] run){
		
			boolean isValid = Spotify.createAccount("jaideep@gmail.com", "123@abcd", "jaideep", "21/07/2002", "male");
		
		if(isValid){
			Spotify.readData();
		}
		else
			System.out.println("Account creation failed. please check the input parameters");
	}
}