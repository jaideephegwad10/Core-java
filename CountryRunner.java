class CountryRunner {

    public static void main(String[] run) {
        
        Country country1 = new Country();
        country1.countryName = "India";
        country1.countryId = 1;
        country1.noOfStates = 28;
        country1.pm = "Narendra Modi";
        country1.population = 1380004385L;
        country1.displayData();
        
        Country country2 = new Country();
        country2.countryName = "United States";
        country2.countryId = 2;
        country2.noOfStates = 50;
        country2.pm = "Joe Biden";
        country2.population = 331002651L;
        country2.displayData();
        
        Country country3 = new Country();
        country3.countryName = "China";
        country3.countryId = 3;
        country3.noOfStates = 23;
        country3.pm = "Li Keqiang";
        country3.population = 1439323776L;
        country3.displayData();
        
        Country country4 = new Country();
        country4.countryName = "Russia";
        country4.countryId = 4;
        country4.noOfStates = 85;
        country4.pm = "Mikhail Mishustin";
        country4.population = 145912025L;
        country4.displayData();
        
        Country country5 = new Country();
        country5.countryName = "Brazil";
        country5.countryId = 5;
        country5.noOfStates = 26;
        country5.pm = "Jair Bolsonaro";
        country5.population = 212559417L;
        country5.displayData();
        
        Country country6 = new Country();
        country6.countryName = "Australia";
        country6.countryId = 6;
        country6.noOfStates = 6;
        country6.pm = "Scott Morrison";
        country6.population = 25687041L;
        country6.displayData();
        
        Country country7 = new Country();
        country7.countryName = "Japan";
        country7.countryId = 7;
        country7.noOfStates = 47;
        country7.pm = "Yoshihide Suga";
        country7.population = 126476461L;
        country7.displayData();
        
        Country country8 = new Country();
        country8.countryName = "Germany";
        country8.countryId = 8;
        country8.noOfStates = 16;
        country8.pm = "Angela Merkel";
        country8.population = 83783942L;
        country8.displayData();
    }
}
