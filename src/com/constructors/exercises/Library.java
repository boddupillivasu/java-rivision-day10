package com.constructors.exercises;

public class Library {

    // instance variables

    String bookTitle;
    String author;

    //static variables

    static String libraryName;

    // parameterized  Constructor
    public Library(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    // default constructor
    public Library() {

        bookTitle = "Unknown";
        author = "Unknown";
    }
    //static method

    public static String getLibraryName() {
        return libraryName = "central library";

    }

    //instance method

    void displayBookInfo() {
        System.out.println("the author is:" + author);
        System.out.println("the bookTitle  is:" + bookTitle);
    }

    public static void main(String[] args) {

        Library library;
        library = new Library();


        library.bookTitle = "java developer";

        library.author = "madhu samala";
        library.displayBookInfo();
        String libraryName1 = Library.getLibraryName();
        System.out.println(libraryName1);

    }

}
