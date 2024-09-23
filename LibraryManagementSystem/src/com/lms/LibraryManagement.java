package com.lms;

import java.util.ArrayList;
import java.util.List;

// Step 3.4: Implement the Library interface in LibraryManagement
public class LibraryManagement implements Library {
    private List<Book> books;

    public LibraryManagement() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "LibraryManagement [books=" + books + "]";
    }
}
