package com.example.book.Repository;

import com.example.book.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book,Long>{
}
