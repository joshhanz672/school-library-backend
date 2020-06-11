package com.SchoolLibDemo.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolLibDemo.restservices.repositories.BookRepository;
import com.SchoolLibDemo.restservices.entities.Book;

//Service
@Service
public class BookService {
	

	//Autowire the UserRepository
		@Autowired
		private BookRepository bookRepository;
		
		//getAllUsers Method
		public List<Book> getAllBooks() {
			return bookRepository.findAll();
			
		}
		
		//CreateBook Method
		
		public Book createBook(Book book)
		{
			return bookRepository.save(book);
			
		}
		
		//getUserById
		public Optional<Book> getBookByBookId(Long id)
		{
			Optional<Book> book = bookRepository.findById(id);
			
			return book;
		}
		
		//updateUserById2
		public Book updateBookByBookId(Long bookId, Book book)
		{
			book.setBookId(bookId);
			return bookRepository.save(book);
		}
		
		//deleteUserById
		public void deleteBookByBookId(Long bookId)
		{
			if (bookRepository.findById(bookId).isPresent() )
			{
				bookRepository.deleteById(bookId);
				
			}
		}
		
		
		//getBookByBookname
		
		public Book getBookByBookTitle(String bookname)
		{
			return bookRepository.findByBookTitle(bookname);
		}
}
