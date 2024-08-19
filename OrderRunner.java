package com.xworkz.ordersdetails;

import com.xworkz.ordersdetails.customer.Customer;
import com.xworkz.ordersdetails.order.Order;
import com.xworkz.ordersdetails.orderItem.OrderItem;
import com.xworkz.ordersdetails.product.Product;

public class OrderRunner {
    public static void main(String[] args) {
        Customer customer = new Customer(123, "Jaideep", 987654345L);
        Order order = new Order(43,customer);
        Product product = new Product(234353,"Samsung M35","Samsung Galaxy M35 5G (Moonlight Blue,6GB RAM,128GB Storage)| Corning Gorilla Glass Victus+| AnTuTu Score 595K+ | Vapour Cooling Chamber | 6000mAh Battery | 120Hz Super AMOLED Display| Without Charger");
        OrderItem orderItem = new OrderItem(4543, order, product, 1);
        orderItem.getOrderItemDetails();
    }
}
