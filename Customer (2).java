package com.xworkz.shoppingdetails.customer;

public class Customer {

    public String name;
    public String email;
    public long phoneNumber;
    public String address;

    public Customer(String name, String email, long phoneNumber, String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void getCustomerDetails(){

        System.out.println("getting customer details...");
        System.out.println("Customer Name : " + name);
        System.out.println("Customer Email : " + email);
        System.out.println("Customer Phone Number : " + phoneNumber);
        System.out.println("Customer Address : " + address);
        System.out.println("--------------------------------");
    }
}
