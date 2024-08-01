class CountryRunner {

    public static void main(String[] run) {
        
        Country country1 = new Country("India", 1, 28, "Narendra Modi", 1380004385L);
        country1.displayData();
        
        Country country2 = new Country("United States", 2, 50, "Joe Biden", 331002651L);
        country2.displayData();
        
        Country country3 = new Country("China",3 , 23, "Li Keqiang", 1439323776L);
        country3.displayData();
        
        Country country4 = new Country("Russia",4,85,"Mikhail Mishustin",145912025L);
        country4.displayData();
        
        Country country5 = new Country( "Brazil",5,26,"Jair Bolsonaro",212559417L);
        country5.displayData();
        
        Country country6 = new Country("Australia",6,6,"Scott Morrison",25687041L);
        country6.displayData();
        
        Country country7 = new Country("Japan",7,47,"Yoshihide Suga",126476461L);
        country7.displayData();
        
        Country country8 = new Country("Germany",8,16,"Angela Merkel",83783942L);
        country8.displayData();
    }
}
