class TourismCompanyRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        boolean isPlaceNameAdded = TourismCompany.addPlaceName("Taj Mahal");
        isPlaceNameAdded = TourismCompany.addPlaceName("Qutub Minar");
        isPlaceNameAdded = TourismCompany.addPlaceName("Red Fort");
        isPlaceNameAdded = TourismCompany.addPlaceName("Gateway of India");
        isPlaceNameAdded = TourismCompany.addPlaceName("India Gate");
        isPlaceNameAdded = TourismCompany.addPlaceName("Lotus Temple");
        isPlaceNameAdded = TourismCompany.addPlaceName("Extra Place");

        if (isPlaceNameAdded) {
            TourismCompany.printPlaceNames();
        } else
            System.out.println("Place name could not be added");
		boolean isPlaceNameUpdated = TourismCompany.updatePlaceName("Red Fort","kashmir");
			TourismCompany.printPlaceNames();
		boolean isPlaceNameDeleted = 	TourismCompany.deletePlaceName("India Gate");
			TourismCompany.printPlaceNames();
			
        System.out.println("main ended");
    }
}
