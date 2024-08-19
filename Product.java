package com.xworkz.ordersdetails.product;

public class Product {

    public int id;
    public String name;
    public String description;

    public Product(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void getProductDetails(){

        System.out.println("getting product details..");
        System.out.println("Product id : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Description : " + description);

    }
}
