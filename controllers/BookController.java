package com.SchoolLibDemo.restservices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolLibDemo.restservices.entities.Book;
import com.SchoolLibDemo.restservices.services.BookService;
//import com.stacksimplify.restservices.entities2.book;
 

//Controller - 
@RestController
public class BookController {
	
	//Autowire the UserService
		@Autowired
		private BookService bookService;
		
		//getAllUsers Method
		@GetMapping("/books")
		public List<Book> getAllBooks()
		{
			return bookService.getAllBooks();
		}
		
		//Create User Method
		//@RequestBody Annotation
		//@PostMapping Annotation
		@PostMapping("/books")
		public Book createBook(@RequestBody Book book)
		{
			return bookService.createBook(book);
		}
		
		//getUserById
		@GetMapping("books/{id}")
		public Optional<Book> getBookByBookId(@PathVariable("id") Long id)
		{
			return bookService.getBookByBookId(id);
			
		}
		
		//updateUserById
		@PutMapping("/books/{id}")
		public Book updateBookByBookId(@PathVariable("id") Long id, @RequestBody Book book)
		{
			return bookService.updateBookByBookId(id, book);
		}
		
		//deleteUserById
		@DeleteMapping("/books/{id}")
		public void deleteBookByBookId(@PathVariable("id") Long id)
		{
			bookService.deleteBookByBookId(id);
		}
		
		//getUserByUserName
		@GetMapping("/books/bybooktitle/{bybooktitle}")
		public Book getBookByBookTitle(@PathVariable("bybooktitle") String bybooktitle)
		{
			return bookService.getBookByBookTitle(bybooktitle);
		}
		

}
