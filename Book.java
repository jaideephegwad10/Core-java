package com.xworkz.shoppingdetails.book;

import com.xworkz.shoppingdetails.author.Author;
import com.xworkz.shoppingdetails.publisher.Publisher;

public class Book {

    public boolean isBN;
    Publisher publisher;
    Author author;
    public int year;
    public String title;
    public double price;

    public Book(boolean isBN, Publisher publisher, Author author, int year, String title, double price) {
        this.isBN = isBN;
        this.publisher = publisher;
        this.author = author;
        this.year = year;
        this.title = title;
        this.price = price;
    }

    public void getBookDetails(){

        System.out.println("getting book details");
        System.out.println("Publisher Name : " + publisher.publisherName);
        System.out.println("Author Name : " + author.authorName);
        System.out.println("Year : " + year);
        System.out.println("Book Title : " + title);
        System.out.println("Book Price : " + price);
        System.out.println("--------------------------");
        author.getAuthorDetails();
        publisher.getPublisherDetails();
    }
}
