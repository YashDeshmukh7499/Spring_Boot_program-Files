package com.yash;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yash.entity.Book2;
import com.yash.repository.Book2Repository;

@SpringBootApplication
public class SbmsDataJpa4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbmsDataJpa4Application.class, args);
	}
    @Autowired
	Book2Repository book2repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Book2 book2=new Book2(1,"Yash",9999);
		Book2 book3=new Book2(2,"ashish",888);
		Book2 book4=new Book2(3,"darshan",888);
		Book2 book5=new Book2(4,"vedant",488);
		Book2 book6=new Book2(5,"vikarnt",838);
//		List<Book2> asList = Arrays.asList(book3,book4,book5,book6);
//		book2repository.saveAll(asList);
		
//		book2repository.save(book3);
//		Iterable<Book2> all = book2repository.findAll();
//		all.forEach(i->System.out.println(i));
	//	book2repository.findAll().forEach(i->System.err.println(i));
		
		 Optional<Book2> byId = book2repository.findById(9);
		 if(byId.isPresent()) {
			 System.out.println(byId.get());
		 }
		 else {
			 System.out.println("its not present");
		 }
	}

}
