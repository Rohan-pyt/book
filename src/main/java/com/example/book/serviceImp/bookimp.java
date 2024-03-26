package com.example.book.serviceImp;

import com.example.book.Entity.Book;
import com.example.book.Exception.ResourceNotfoundException;
import com.example.book.Repository.BookRepository;
import com.example.book.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookimp implements BookService {

    @Autowired
    private BookRepository bookrepo;


    @Override
    public List<Book> getAllBooks() {
        return bookrepo.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookrepo.findById(id).orElseThrow(()->new ResourceNotfoundException("Book not found at ID"+id));
    }

    @Override
    public Book addBook(Book book) {
        return bookrepo.save(book);
    }

    @Override
    public Book updateBook(Long id, Book updatedbook) {
        Book book = bookrepo.findById(id).orElseThrow(()-> new ResourceNotfoundException("Book not found at ID"+id));
        book.setTitle(updatedbook.getTitle());
        book.setAuthor(updatedbook.getAuthor());

        return bookrepo.save(book);
        }

    @Override
    public void deleteBook(Long id) {
      Book book=  bookrepo.findById(id).orElseThrow(()->new ResourceNotfoundException("Book not found with id "+id));
        bookrepo.delete(book);
    }


}
