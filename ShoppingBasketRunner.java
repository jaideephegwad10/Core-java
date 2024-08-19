package com.xworkz.shoppingdetails;

import com.xworkz.shoppingdetails.author.Author;
import com.xworkz.shoppingdetails.book.Book;
import com.xworkz.shoppingdetails.customer.Customer;
import com.xworkz.shoppingdetails.publisher.Publisher;
import com.xworkz.shoppingdetails.shoppingBasket.ShoppingBasket;
import com.xworkz.shoppingdetails.shoppingBasketBooking.ShoppingBasketBook;

public class ShoppingBasketRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        Customer customer = new Customer("vivek", "vivek@gmail.com", 9876543212L, "#24, 2nd cross, kengeri");
        ShoppingBasket shoppingBasket = new ShoppingBasket(1, customer);
        Publisher publisher = new Publisher("punith", "#54 5th main road banashankari", 667987654L, "https://google.com/");
        Author author = new Author("Bharath", "#92, 3rd cross mariyappanapalya", "https://www.google.com/search?q=Bharathiraja&oq=bha&gs_lcrp=EgZjaHJvbWUqBggBEEUYOzIGCAAQRRg5MgYIARBFGDsyBggCEEUYOzIGCAMQRRg7MgcIBBAAGI8CMgcIBRAAGI8CMgcIBhAAGI8C0gEJMjAxNjlqMGo0qAIAsAIB&sourceid=chrome&ie=UTF-8");
        Book book = new Book(true, publisher, author, 2020, "", 259.90);
        ShoppingBasketBook shoppingBasketBook = new ShoppingBasketBook(shoppingBasket, book, 2);
        shoppingBasketBook.getBookingDetails();

        System.out.println("main ended");
    }
}
