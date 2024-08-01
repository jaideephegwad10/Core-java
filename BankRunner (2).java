class BankRunner {

    public static void main(String[] run) {
        
        Bank bank1 = new Bank( 789, "HDFC Bank", "MG Road", "HDFC0001234", "HDFCINBB", 50, "Rajesh Sharma");
        bank1.displayData();
        
        Bank bank2 = new Bank( 456, "ICICI Bank", "Whitefield", "ICIC0005678", "ICICINBB", 45, "Nisha Gupta");
        bank2.displayData();
        
        Bank bank3 = new Bank(321, "State Bank of India", "Koramangala", "SBIN0003456", "SBININBB", 60, "Arvind Kumar");
        bank3.displayData();
        
        Bank bank4 = new Bank(654,  "Axis Bank", "Indiranagar", "UTIB0007890", "AXISINBB", 40, "Meena Singh");
        bank4.displayData();
        
        Bank bank5 = new Bank(987, "Punjab National Bank", "HSR Layout","PUNB0012345", "PUNBINBB", 55, "Suresh Verma");
        bank5.displayData();
        
        Bank bank6 = new Bank(132, "Kotak Mahindra Bank", "Jayanagar","KKBK0005678", "KKBKINBB", 35, "Priya Desai");
        bank6.displayData();
        
        Bank bank7 = new Bank(579, "Bank of Baroda",  "BTM Layout", "BARB0006789", "BARBINBB", 42, "Anil Joshi");
        bank7.displayData();
        
        Bank bank8 = new Bank( 346, "Canara Bank", "JP Nagar", "CNRB001234", "CNRBINBB", 48, "Pooja Reddy");
        bank8.displayData();
    }
}
