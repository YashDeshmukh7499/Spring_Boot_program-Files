package com.yash.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Book2 {
    

	
	 @Id
	private Integer id;
	private String name;
	private double price;
	
	
	
	 
	
}
