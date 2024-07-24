class TourismCompany {

    static String placeNames[] = {null, null, null, null, null, null};
    static int index = 0;

    public static boolean addPlaceName(String placeName) {

        boolean isPlaceNameAdded = false;

        if (index < placeNames.length) {

            if (placeName != null) {
                placeNames[index++] = placeName;
                isPlaceNameAdded = true;
                System.out.println(placeName + " added to the list");
            } else
                System.out.println("Place name is invalid");
        } else
            System.out.println("Maximum number reached.. cannot add " + placeName);

        return isPlaceNameAdded;
    }

    public static void printPlaceNames() {
        System.out.println("Available places are");
        for (String placeName : placeNames)
            System.out.println(placeName);
    }
}

