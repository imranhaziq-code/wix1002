package S1_2324;

import java.util.*;
import java.io.*;

public class Q2a {
    public static void main(String[] args) {
        Book b1 = new Book("Sonagi", "Ryu Sun Jae", 2023);
        b1.DisplayInfo();
    }
}

class Book {
    private String title;
    private String author;
    private int yearPublished;
    
    public Book (String tit, String aut, int year) {
        this.title = tit;
        this.author = aut;
        this.yearPublished = year;
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
    
    public void DisplayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
    
}