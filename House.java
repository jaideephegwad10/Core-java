class House {
    int houseNo;
    int noOfRooms;
    int noOfFloors;
    String houseName;
    double areaInSqrt;
    int noOfMembers;

    void displayData() {
        System.out.println("House Number: " + houseNo);
        System.out.println("Number of Rooms: " + noOfRooms);
        System.out.println("Number of Floors: " + noOfFloors);
        System.out.println("House Name: " + houseName);
        System.out.println("Area in Square Feet: " + areaInSqrt);
        System.out.println("Number of Members: " + noOfMembers);
        System.out.println("-------------------");
    }
}
