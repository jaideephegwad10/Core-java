package com.xworkz.ordersdetails.order;

import com.xworkz.ordersdetails.customer.Customer;

public class Order {

    public int id;
    Customer customer;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public void getOrderDertails(){
        System.out.println("getting order details...");
        System.out.println("Order Id : " + id);
        System.out.println("Customer Id : " + customer.id);
        System.out.println("------------------------");
        customer.getCustomerDetails();
    }
}
