class Bank {
    int id;
    String name;
    String branchName;
    String ifscCode;
    String swiftCode;
    int noOfWorker;
    String branchManager;

	public Bank(){
		System.out.println("New object created");
	}
	
	public Bank(int id, String name, String branchName, String ifscCode, String swiftCode, int noOfWorker, String branchManager){
		System.out.println("New object created");
		
		this.id = id;
		this.name = name;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.swiftCode = swiftCode;
		this.noOfWorker = noOfWorker;
		this.branchManager = branchManager;
		
	}
	
    public void displayData() {
        System.out.println("Bank ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch Name: " + branchName);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("SWIFT Code: " + swiftCode);
        System.out.println("Number of Workers: " + noOfWorker);
        System.out.println("Branch Manager: " + branchManager);
        System.out.println("-------------------");
    }
}

