import java.time.LocalDate;

public class Library {
	
	String bookTitle;
	String bookAuthor;
	boolean isBorrowed;
	String borrower;
	String dateBorrowed;
	
	int booksInLibrary;
	
	public Library(String a, String t, boolean borrowed, String personBorrowing, String d) {
		this.bookAuthor = a;
		this.bookTitle = t;
		this.isBorrowed = borrowed;
		this.borrower = personBorrowing;
		this.dateBorrowed = d;
		
		booksInLibrary++;
	}
	
	
	public String getTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return bookAuthor;
	}
	
}
