package com.xworkz.ordersdetails.orderItem;

import com.xworkz.ordersdetails.order.Order;
import com.xworkz.ordersdetails.product.Product;

public class OrderItem {

    public int id;
    Order order;
    Product product;
    public int quantity;

    public OrderItem(int id, Order order, Product product, int quantity) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
    }

    public void getOrderItemDetails(){
        System.out.println("getting ordered item details...");
        System.out.println("item id : " + id);
        System.out.println("order id : " + order.id);
        System.out.println("product : " + product.id);
        System.out.println("quantity : " + quantity);
        System.out.println("-------------------------------");
        order.getOrderDertails();
        product.getProductDetails();
    }
}
