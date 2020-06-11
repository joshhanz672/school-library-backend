package com.SchoolLibDemo.restservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SchoolLibDemo.restservices.entities.Book;

	//Repository
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	Book findByBookTitle(String username);
		
	 
}



