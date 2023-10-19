package org.howard.edu.lsp.midterm.problem1;

public class Book {
	private String title;
	private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    
    
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
    
    public boolean equals(Object text) {
        if (this == text) {
            return true;
        }
        if (text == null || getClass() != text.getClass()) {
            return false;
        }
        Book otherBook = (Book) text;
        return title.equals(otherBook.title) && author.equals(otherBook.author);
    }
}
