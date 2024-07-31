class BankRunner {

    public static void main(String[] run) {
        
        Bank bank1 = new Bank();
        bank1.id = 789;
        bank1.name = "HDFC Bank";
        bank1.branchName = "MG Road";
        bank1.ifscCode = "HDFC0001234";
        bank1.swiftCode = "HDFCINBB";
        bank1.noOfWorker = 50;
        bank1.branchManager = "Rajesh Sharma";
        bank1.displayData();
        
        Bank bank2 = new Bank();
        bank2.id = 456;
        bank2.name = "ICICI Bank";
        bank2.branchName = "Whitefield";
        bank2.ifscCode = "ICIC0005678";
        bank2.swiftCode = "ICICINBB";
        bank2.noOfWorker = 45;
        bank2.branchManager = "Nisha Gupta";
        bank2.displayData();
        
        Bank bank3 = new Bank();
        bank3.id = 321;
        bank3.name = "State Bank of India";
        bank3.branchName = "Koramangala";
        bank3.ifscCode = "SBIN0003456";
        bank3.swiftCode = "SBININBB";
        bank3.noOfWorker = 60;
        bank3.branchManager = "Arvind Kumar";
        bank3.displayData();
        
        Bank bank4 = new Bank();
        bank4.id = 654;
        bank4.name = "Axis Bank";
        bank4.branchName = "Indiranagar";
        bank4.ifscCode = "UTIB0007890";
        bank4.swiftCode = "AXISINBB";
        bank4.noOfWorker = 40;
        bank4.branchManager = "Meena Singh";
        bank4.displayData();
        
        Bank bank5 = new Bank();
        bank5.id = 987;
        bank5.name = "Punjab National Bank";
        bank5.branchName = "HSR Layout";
        bank5.ifscCode = "PUNB0012345";
        bank5.swiftCode = "PUNBINBB";
        bank5.noOfWorker = 55;
        bank5.branchManager = "Suresh Verma";
        bank5.displayData();
        
        Bank bank6 = new Bank();
        bank6.id = 132;
        bank6.name = "Kotak Mahindra Bank";
        bank6.branchName = "Jayanagar";
        bank6.ifscCode = "KKBK0005678";
        bank6.swiftCode = "KKBKINBB";
        bank6.noOfWorker = 35;
        bank6.branchManager = "Priya Desai";
        bank6.displayData();
        
        Bank bank7 = new Bank();
        bank7.id = 579;
        bank7.name = "Bank of Baroda";
        bank7.branchName = "BTM Layout";
        bank7.ifscCode = "BARB0006789";
        bank7.swiftCode = "BARBINBB";
        bank7.noOfWorker = 42;
        bank7.branchManager = "Anil Joshi";
        bank7.displayData();
        
        Bank bank8 = new Bank();
        bank8.id = 346;
        bank8.name = "Canara Bank";
        bank8.branchName = "JP Nagar";
        bank8.ifscCode = "CNRB001234";
        bank8.swiftCode = "CNRBINBB";
        bank8.noOfWorker = 48;
        bank8.branchManager = "Pooja Reddy";
        bank8.displayData();
    }
}
