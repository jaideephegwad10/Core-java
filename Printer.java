class Printer{

        static String brandName = "Canon";
        static String connectivityTechnology = "Wi-Fi, USB";
        static String printingTechnology = "Inkjet";
        static String specialFeatures = "Scan To E-Mail, Print through Canon SELPHY App, Mac OS X v10.8.5 (compatible), Windows 10, Windows 8, Windows 7 SP1, Windows Vista SP2 (compatible), Low cost cartridge, Auto Power On, Flatbed Scanner";
        static String colour = "White/Blue";
        static String modelName = "Pixma";
        static String printerOutput = "Colour";
        static int maxPrintSpeedColour = 4;
        static int maxPrintSpeedMonochrome = 8;
        static int itemWeight = 3500;
		
    public static void main(String[] canon){
    
        System.out.println("main started");

        System.out.println("The brand name of the printer is "+brandName);
        System.out.println("The connectivity technology is "+connectivityTechnology);
        System.out.println("The printing technology is "+printingTechnology);
        System.out.println("The special features are "+specialFeatures);
        System.out.println("The colour of the printer is "+colour);
        System.out.println("The model name is "+modelName);
        System.out.println("The printer output is "+printerOutput);
        System.out.println("The maximum print speed for colour is "+maxPrintSpeedColour+" ppm");
        System.out.println("The maximum print speed for monochrome is "+maxPrintSpeedMonochrome+" ppm");
        System.out.println("The item weight is "+itemWeight+" grams");
        
        System.out.println("main ended");
    }
}
