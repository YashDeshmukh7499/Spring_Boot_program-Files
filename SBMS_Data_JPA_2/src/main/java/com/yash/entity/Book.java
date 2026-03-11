package com.yash.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;

    private String book_name;
    private Double book_price;

    // ✅ Default constructor (required by JPA)
    public Book() {
    }

    // Parameterized constructor
    public Book(Integer book_id, String book_name, Double book_price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_price = book_price;
    }

    // getters & setters
}