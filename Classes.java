//Comilang, Tayshaun
//CITCS 1N-A

package com.mycompany.classes;

// Class definition for Book
class Book {
    
    // Attributes
    private String title, author;
    private int yearPublished;

    // Constructor to initialize the attributes
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
}

public class Classes {

    public static void main(String[] args) {
        
        // Create an object of the Book class and assign values
        Book book = new Book("My Husband is Mafia Boss", "Jayron Zapanta", 2014);
        
        // Print the details of the book
        book.displayBookDetails();
    }
}