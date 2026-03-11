package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.entity.Book2;
@Repository
public interface Book2Repository extends CrudRepository<Book2, Integer> {

}
