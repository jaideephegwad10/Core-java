class Trimmer{

		static String recommendedUses = "Beard, Hair, Head";
        static String colour = "Black";
        static String hairType = "All";
        static double itemWeight = 0.74;
        static String brandName = "Philips";
        static String powerSource = "Battery Powered";
        static String material = "Plastic";
        static String specialFeature = "Cordless, Rechargeable, Detachable, Fast Charge, Multigroomer, Self-sharpening blades";
        static String itemDimensions = "29.1 x 15.1 x 23.8 Centimeters";
        static String bladeMaterial = "Rubber, self sharpening stainless steel blades";
        

    public static void main(String[] philips){
    
        System.out.println("main started");
        
        System.out.println("Recommended uses for the product: " + recommendedUses);
        System.out.println("Colour: " + colour);
        System.out.println("Hair type: " + hairType);
        System.out.println("Item weight: " + itemWeight + " kilograms");
        System.out.println("Brand: " + brandName);
        System.out.println("Power source: " + powerSource);
        System.out.println("Material: " + material);
        System.out.println("Special features: " + specialFeature);
        System.out.println("Item dimensions (L x W x H): " + itemDimensions);
        System.out.println("Blade material: " + bladeMaterial);
        
        System.out.println("main ended");
    }
}
