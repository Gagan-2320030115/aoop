package com.lms;


public interface Library {
    void addBook(Book book);
    void removeBook(Book book);
    Book findBookByIsbn(String isbn);
}
