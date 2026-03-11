package com.yash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yash.entity.Book;
import com.yash.repository.BookRepository;
@SpringBootApplication
public class SbmsDataJpa2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbmsDataJpa2Application.class, args);
    }

    @Autowired
    BookRepository bookrepository;

    @Override
    public void run(String... args) throws Exception {

        Book books = new Book(null,"Yash",9.0);

        bookrepository.save(books);   // ✅ SAVE TO DATABASE
    }
}