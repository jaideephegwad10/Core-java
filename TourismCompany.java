import java.util.*;

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
	
	public static boolean updatePlaceName(String oldPlaceName, String newPlaceName){
		System.out.println("update operation started");
		
		boolean isPlaceNameUpdated = false;
		for(int position = 0; position < placeNames.length ; position++){
			
			if(placeNames[position] == oldPlaceName){
				placeNames[position] = newPlaceName;
				isPlaceNameUpdated = true;
			}
		}
		if(!isPlaceNameUpdated)
			System.out.println(oldPlaceName+" not found");
		
		System.out.println("update operation ended");
	return isPlaceNameUpdated;
	}
	
	public static boolean deletePlaceName(String delete){
		
		boolean isPlaceNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<placeNames.length ; position++){
			if(placeNames[position]!=delete){
				placeNames[newPosition] = placeNames[position];
				newPosition++;
			}
			else
				isPlaceNameDeleted = true;
		}
			placeNames = Arrays.copyOf(placeNames,newPosition);
			
			if(!isPlaceNameDeleted)
				System.out.println(delete+" not found");
		return isPlaceNameDeleted;	
	}
}

