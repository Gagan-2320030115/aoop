package com.lms;

public class Client {
    public static void main(String[] args) {
        
        LibraryManagement library = new LibraryManagement();

        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");

        Member member1 = new Member("John Doe", "M001");

       
        library.addBook(book1);
        library.addBook(book2);

        
        member1.borrowBook(book1);

       
        System.out.println("Library:");
        System.out.println(library);
        System.out.println("Member:");
        System.out.println(member1);

        
        member1.returnBook(book1);

        
        System.out.println("Member after returning book:");
        System.out.println(member1);
    }
}
