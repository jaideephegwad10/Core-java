class SpeakerRunner{
	
	static boolean connect;
	public static void main(String[] jbl){
	
	System.out.println("main started");
	
	connect = Speaker.onOrOff();
	System.out.println("is speaker connected :"+connect);
	Speaker.increaseVolume();
	
		connect = Speaker.onOrOff();
	System.out.println("is speaker connected :"+connect);
		Speaker.increaseVolume();
		Speaker.decreaseVolume();
		connect = Speaker.onOrOff();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
	System.out.println("is speaker connected :"+connect);
		connect = Speaker.onOrOff();
	System.out.println("is speaker connected :"+connect);
	
System.out.println("main ended");	
	}
}