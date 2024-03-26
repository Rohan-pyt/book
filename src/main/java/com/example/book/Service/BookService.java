package com.example.book.Service;

import com.example.book.Entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(Long id);

    Book addBook(Book book);

    Book updateBook(Long id, Book updatedBook);

   void   deleteBook(Long id);

}
