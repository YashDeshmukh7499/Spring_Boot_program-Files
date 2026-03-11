package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.entity.Book;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
 List<Book> findByName(String name);

 List<Book> findByPrice(double price);
}
