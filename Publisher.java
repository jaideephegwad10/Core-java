package com.xworkz.shoppingdetails.publisher;

public class Publisher {

    public String publisherName;
    public String publisherAddress;
    public long publisherPhoneNumber;
    public String publisherUrl;

    public Publisher(String publisherName, String publisherAddress, long publisherPhoneNumber, String publisherUrl) {
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
        this.publisherPhoneNumber = publisherPhoneNumber;
        this.publisherUrl = publisherUrl;
    }

    public void getPublisherDetails(){

        System.out.println("getting publisher details....");
        System.out.println("Publisher Name : " + publisherName);
        System.out.println("Publisher Address : " + publisherAddress);
        System.out.println("Publisher Phone Number : " + publisherPhoneNumber);
        System.out.println("Publisher Url : " + publisherUrl);

        System.out.println("----------------------------------");
    }
}
