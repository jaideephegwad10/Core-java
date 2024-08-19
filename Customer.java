package com.xworkz.ordersdetails.customer;

public class Customer {
    public int id;
    public String name;
    public long phoneNo;

    public Customer(int id, String name, long phoneNo) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public void getCustomerDetails(){
        System.out.println("getting customer details...");
        System.out.println("Customer id : " + id);
        System.out.println("Customer Name : " + name);
        System.out.println("Customer Phone Number : " + phoneNo);
        System.out.println("--------------------------------");
    }
}
