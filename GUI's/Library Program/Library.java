import java.time.LocalDate;

public class Library {
	
	String bookTitle;
	String bookAuthor;
	String borrower;
	String dateBorrowed;
	
	int booksInLibrary;
	
	// Creating a new book
	
	public Library(String a, String t, String personBorrowing, String d) {
		this.bookAuthor = a;
		this.bookTitle = t;
		this.borrower = personBorrowing;
		this.dateBorrowed = d;
		
		booksInLibrary++;
	}
	
	
	// Getting attributes
	
	public String getTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return bookAuthor;
	}
	public String getBorrower() {
		return borrower;
	}
	public String getBorrowDate() {
		return dateBorrowed;
	}
	
	
	// Setting attributes
	
	public void setBorrower(String name) {
		this.borrower = name;
	}
	public void setBorrowDate(String date) {
		this.dateBorrowed = date;
	}
	
	
	// Getting the count of books in the library
	public int getBookCount() {
		return booksInLibrary;
	}
	
}
