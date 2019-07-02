package business;

import java.util.List;

public class Book {
	
	private String title;
	private String isbn;
	private List<Author> authors;
	private int maxDuration;
	private int maxCheckoutLength;
	
	
	public Book(String title, String isbn, List<Author> authors, int maxDuration, int maxCheckoutLength) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.authors = authors;
		this.maxDuration = maxDuration;
		this.maxCheckoutLength = maxCheckoutLength;
	}


	public String getTitle() {
		return title;
	}


	public String getIsbn() {
		return isbn;
	}


	public List<Author> getAuthors() {
		return authors;
	}


	public int getMaxDuration() {
		return maxDuration;
	}


	public int getMaxCheckoutLength() {
		return maxCheckoutLength;
	}
	

}
