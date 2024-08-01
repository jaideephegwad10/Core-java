class Country {
    String countryName;
    int countryId;
    int noOfStates;
    String pm;
    long population;

		public Country(){
			System.out.println("New object created");
		}
		
		public Country(String countryName, int countryId, int noOfStates, String pm, long population){
			System.out.println("New object created");
			
			this.countryName = countryName;
			this.countryId = countryId;
			this.noOfStates = noOfStates;
			this.pm = pm;
			this.population = population;
		}
		
    public void displayData() {
        System.out.println("Country Name: " + countryName);
        System.out.println("Country ID: " + countryId);
        System.out.println("Number of States: " + noOfStates);
        System.out.println("Prime Minister: " + pm);
        System.out.println("Population: " + population);
        System.out.println("-------------------");
    }
}

