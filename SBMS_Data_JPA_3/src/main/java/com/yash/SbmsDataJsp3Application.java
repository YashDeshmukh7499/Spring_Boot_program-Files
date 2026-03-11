package com.yash;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.yash.entity.Book;
import com.yash.repository.BookRepository;

@SpringBootApplication
public class SbmsDataJsp3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbmsDataJsp3Application.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		bookRepository.findByPrice(799).forEach(i->System.err.println(i));
//	List<Book> byName = bookRepository.findByPrice(799);
//	byName.forEach(i->System.err.println(i));
		// TODO Auto-generated method stu
//		Book b1 = new Book(1,"Atomic Habits",799);
//		Book b2 = new Book(2,"Rich Dad Poor Dad",450);
//		Book b3 = new Book(3,"Think and Grow Rich",500);
//		Book b4 = new Book(4,"The Alchemist",350);
//		Book b5 = new Book(5,"Ikigai",400);
//		Book b6 = new Book(6,"Deep Work",650);
//		Book b7 = new Book(7,"The Power of Habit",550);
//		Book b8 = new Book(8,"Start With Why",600);
//		Book b9 = new Book(9,"Zero to One",700);
//		Book b10 = new Book(10,"The 4 Hour Work Week",750);
//		Book b11 = new Book(11,"Steve Jobs",900);
//		Book b12 = new Book(12,"The Psychology of Money",650);
//		Book b13 = new Book(13,"Can't Hurt Me",800);
//		Book b14 = new Book(14,"Think Like a Monk",500);
//		Book b15 = new Book(15,"Do Epic Shit",450);
//		Book b16 = new Book(16,"Sapiens",850);
//		Book b17 = new Book(17,"Homo Deus",900);
//		Book b18 = new Book(18,"The Subtle Art of Not Giving a F",700);
//		Book b19 = new Book(19,"The Lean Startup",650);
//		Book b20 = new Book(20,"Rework",600);

//		List<Book> asList = Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20);
//		bookRepository.saveAll(asList);

		// Sorting

//		Sort ascending = Sort.by("name").ascending();
//		bookRepository.findAll(ascending).forEach(i->System.err.println(i));
//		
//		pagination

//		int reqpage=1;
//		PageRequest pagerequest = PageRequest.of(reqpage-1, 44);
//		Page<Book> page = bookRepository.findAll(pagerequest);
//		List<Book> content = page.getContent();
//		content.forEach(i->System.err.println(i));

		// Filteration
//		Book b = new Book();
//		b.setName("atomic habits");
//		b.setId(1);
//		Example<Book> of = Example.of(b);
//		List<Book> all = bookRepository.findAll(of);
//		all.forEach(i -> System.err.println(i));

	}

}
