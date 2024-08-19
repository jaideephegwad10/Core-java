package com.xworkz.shoppingdetails.author;

public class Author {

    public String authorName;
    public String authorAddress;
    public String authorUrl;

    public Author(String authorName, String authorAddress, String authorUrl) {
        this.authorName = authorName;
        this.authorAddress = authorAddress;
        this.authorUrl = authorUrl;
    }

    public void getAuthorDetails(){
        System.out.println("getting Author details...");
        System.out.println("Author Name : " + authorName);
        System.out.println("Author address : "+ authorAddress);
        System.out.println("Author URL : " +authorUrl);
        System.out.println("-------------------------------------");
    }
}
