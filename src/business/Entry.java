package business;

import java.time.LocalDate;

public class Entry {
	
	private Book book;
	private LocalDate date;
	private LocalDate dueDate;
	
	
	public Entry(Book book, LocalDate date, LocalDate dueDate) {
		super();
		this.book = book;
		this.date = date;
		this.dueDate = dueDate;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public Book getBook() {
		return book;
	}
	
	

}
