class Country {
    String countryName;
    int countryId;
    int noOfStates;
    String pm;
    long population;

    void displayData() {
        System.out.println("Country Name: " + countryName);
        System.out.println("Country ID: " + countryId);
        System.out.println("Number of States: " + noOfStates);
        System.out.println("Prime Minister: " + pm);
        System.out.println("Population: " + population);
        System.out.println("-------------------");
    }
}

