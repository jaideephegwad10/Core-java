package com.xworkz.shoppingdetails.shoppingBasket;

import com.xworkz.shoppingdetails.customer.Customer;

public class ShoppingBasket {

    public int shoppingBasketId;
    Customer customer;

    public ShoppingBasket(int shoppingBasketId, Customer customer) {
        this.shoppingBasketId = shoppingBasketId;
        this.customer = customer;
    }

    public void getShoppingBasketDetails(){

        System.out.println("getting shopping basket details...");
        System.out.println("shoppingBasketId : " + shoppingBasketId);
        System.out.println("customer email : " + customer.email);
        System.out.println("----------------------------------");
        customer.getCustomerDetails();
    }
}
