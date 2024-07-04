class SmartWatch{

        static String operatingSystem = "android, ios";
        static String specialFeatures = "Sleep Monitor, Notifications, Heart Rate Monitor, Oxymeter (SpO2), Time Display, Distance Tracker, Multisport Tracker, Gesture Control";
        static String connectivityTechnology = "USB";
        static String wirelessCommunicationStandard = "Bluetooth";
        static String shape = "Rectangular";
         
    public static void main(String[] wearable){
    
        System.out.println("main started");

        System.out.println("The operating systems supported are "+operatingSystem);
        System.out.println("The special features are "+specialFeatures);
        System.out.println("The connectivity technology is "+connectivityTechnology);
        System.out.println("The wireless communication standard is "+wirelessCommunicationStandard);
        System.out.println("The shape of the smartwatch is "+shape);
        
        System.out.println("main ended");
    }
}
