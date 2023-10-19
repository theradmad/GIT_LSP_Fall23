package org.howard.edu.lsp.midterm.problem1;

public class Driver {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1960);
        Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);

        
        System.out.println("Display of book1's title, author, and year: " + book1.toString());
        System.out.println("Display of book2's title, author, and year: " + book2.toString());
        System.out.println("Display of book3's title, author, and year: " + book3.toString());
        
        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));
        System.out.println("book2 equals book4: " + book2.equals(book4));
        System.out.println("book4 title: "+ book4.getTitle());
        System.out.println("book4 author: "+ book4.getAuthor());
        System.out.println("book4 year: "+ book4.getYear());
        System.out.println("Display of book4's title, author, and year: " + book4.toString());
        
        
        
    }
}