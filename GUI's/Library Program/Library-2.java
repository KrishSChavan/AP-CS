

public class Library {
		
	String bookTitle;
	String bookAuthor;
	
	public String getAuthor() {
		return bookAuthor;
	}
	
	public String getTitle() {
		return bookTitle;
	}
	
	
	public void setBook(String title, String author) {
		this.bookAuthor = author;
		this.bookTitle = title;
	}
	
}
