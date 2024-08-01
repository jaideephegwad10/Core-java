class SocialMedia {
    int id;
    String name;
    String profileName;
    String email;
	
	public SocialMedia(){
		System.out.println("New object created");
	}
	
	public SocialMedia(int id, String name, String profileName, String email){
		System.out.println("New object created");
		
		this.id = id;
		this.name = name;
		this.profileName = profileName;
		this.email = email;
	}
	
    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Profile Name: " + profileName);
        System.out.println("Email: " + email);
        System.out.println("-------------------");
    }
}

