package com.xworkz.shoppingdetails.shoppingBasketBooking;

import com.xworkz.shoppingdetails.book.Book;
import com.xworkz.shoppingdetails.shoppingBasket.ShoppingBasket;

public class ShoppingBasketBook {

    ShoppingBasket shoppingBasket;
    Book book;
    public int count;

    public ShoppingBasketBook(ShoppingBasket shoppingBasket, Book book, int count) {
        this.shoppingBasket = shoppingBasket;
        this.book = book;
        this.count = count;
    }

    public void getBookingDetails(){
        System.out.println("getting booking detals...");
        System.out.println("Shopping Basket Id : " + shoppingBasket.shoppingBasketId);
        System.out.println("is book new : " + book.isBN);
        System.out.println("number of books purchased : " + count);
        System.out.println("-------------------------");
        shoppingBasket.getShoppingBasketDetails();
        book.getBookDetails();
    }
}
