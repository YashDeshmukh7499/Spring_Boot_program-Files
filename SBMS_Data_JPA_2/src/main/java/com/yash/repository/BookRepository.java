package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.entity.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
     
}
