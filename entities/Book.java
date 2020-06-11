package com.SchoolLibDemo.restservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	

	@Id
	@GeneratedValue
	private Long bookId;
	
	@Column(name = "BOOK_TITLE", length=50, nullable=false, unique=true)
	private String bookTitle;
	
	@Column(name = "BOOK_AUTHOR", length=50, nullable=false, unique=false)
	private String bookAuthor;
	
	@Column(name = "LOC_REF", length=50, nullable=false, unique=true)
	private String locRef;
	
	@Column(name = "ALLOWED_CHECKOUT_DAYS", length=50, nullable=false, unique=false)
	private int	allowedCheckoutDays;
	
	@Column(name = "IS_CHECKED_OUT", length=2, nullable=false, unique=false)
	private boolean isCheckedOut;
	
	@Column(name = "PUT_ON_REQUEST", length=2, nullable=false, unique=false)
	private boolean putOnRequest;

	public Book(Long bookId, String bookTitle, String bookAuthor, String locRef, int allowedCheckoutDays,
			boolean isCheckedOut, boolean putOnRequest) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.locRef = locRef;
		this.allowedCheckoutDays = allowedCheckoutDays;
		this.isCheckedOut = isCheckedOut;
		this.putOnRequest = putOnRequest;
	}


	public Book() {
	}


	public Long getBookId() {
		return bookId;
	}


	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public String getLocRef() {
		return locRef;
	}


	public void setLocRef(String locRef) {
		this.locRef = locRef;
	}


	public int getAllowedCheckoutDays() {
		return allowedCheckoutDays;
	}


	public void setAllowedCheckoutDays(int allowedCheckoutDays) {
		this.allowedCheckoutDays = allowedCheckoutDays;
	}


	public boolean isCheckedOut() {
		return isCheckedOut;
	}


	public void setCheckedOut(boolean isCheckedOut) {
		this.isCheckedOut = isCheckedOut;
	}


	public boolean isPutOnRequest() {
		return putOnRequest;
	}


	public void setPutOnRequest(boolean putOnRequest) {
		this.putOnRequest = putOnRequest;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", locRef="
				+ locRef + ", allowedCheckoutDays=" + allowedCheckoutDays + ", isCheckedOut=" + isCheckedOut
				+ ", putOnRequest=" + putOnRequest + "]";
	}
	
}
