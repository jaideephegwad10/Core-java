class BlenderRunner{

	public static void main(String[] usha){
	
		System.out.println("main started");
		
		Blender.onOrOff();
		Blender.increaseSpeed();
		Blender.increaseSpeed();
		Blender.decreaseSpeed();
		Blender.decreaseSpeed();
		Blender.onOrOff();
		
		System.out.println("main ended");
	}
}