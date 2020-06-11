package com.SchoolLibDemo.restservices.Hello;

public class BookDetails {

	private String bookTitle;
	private String authorName;
	private String locRef;
	
	//Fields constructor
	public BookDetails(String bookTitle, String authorName, String locRef) {
		super();
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.locRef = locRef;
	}
	
	
	
	//ToString method
		@Override
		public String toString() {
			return "BookDetails [title=" + bookTitle + ", authorName=" + authorName + ", "
					+ "Library of Congress Call Number =" + locRef + "]";
		}



		public String getBookTitle() {
			return bookTitle;
		}



		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}



		public String getAuthorName() {
			return authorName;
		}



		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}



		public String getLocRef() {
			return locRef;
		}



		public void setLocRef(String locRef) {
			this.locRef = locRef;
		}
}
