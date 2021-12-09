import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	static JFrame frm;	
	
	
	JButton addBook = addButton ("Add Book", 3,1,1,1);
	JButton checkoutBook = addButton ("Loan Book", 3,2,1,1);
	JButton returnBook = addButton ("Return Book", 3,3,1,1);
	JButton printAll = addButton ("Print All", 4,1,1,1);
	JButton printLate = addButton ("Print Late Books", 4,2,1,1);
	JButton printBorrowed = addButton ("Print Borrowed", 4,3,1,1);
	JButton search = addButton ("Search", 5,1,1,1);
	
	JButton header = addButton ("Krish's Library", 5, 2,1,1);
	
	JButton printNumOfBooks = addButton ("Print Library Count", 5,3,1,1);
    
    // Checking for button click
	
	ArrayList<Library> library = new ArrayList<Library>();
	
	Library lib = new Library("Dr. Seuss", "Cat In The Hat", null, null);
	
	public Main() {
		header.setBackground(Color.pink);
		header.setForeground(Color.white);
		header.setFont (new Font ("Verdana", Font.BOLD, 24));
		
		addBook.setBackground(Color.gray);
		checkoutBook.setBackground(Color.gray);
		returnBook.setBackground(Color.gray);
		printAll.setBackground(Color.gray);
		printLate.setBackground(Color.gray);
		printBorrowed.setBackground(Color.gray);
		search.setBackground(Color.gray);
		printNumOfBooks.setBackground(Color.gray);
		
		addBook.setForeground(Color.white);
		checkoutBook.setForeground(Color.white);
		returnBook.setForeground(Color.white);
		printAll.setForeground(Color.white);
		printLate.setForeground(Color.white);
		printBorrowed.setForeground(Color.white);
		search.setForeground(Color.white);
		printNumOfBooks.setForeground(Color.white);
		
		
		library.add(lib);
	}
	
    public void buttonClicked(JButton buttonObj) {
    	
    	if (buttonObj == addBook) {
        	AddBook addBookDlg = new AddBook(this, library);
        	
        	addBookDlg.setVisible(true);
        	
    	} else if (buttonObj == checkoutBook) {
    		CheckOut checkOut = new CheckOut(this, library);
    		
    		checkOut.setVisible(true);
    		
    	} else if (buttonObj == returnBook) {
    		ReturnBook returnBook = new ReturnBook(this, library);
    		
    		returnBook.setVisible(true);
    		
    	} else if (buttonObj == printAll) {
    		String labelStr = " # | TITLE | AUTHOR" + '\n' + '\n';
    		
    		for (int i=0; i<library.size(); i++) {
    			labelStr += i+1 + ". " + ((Library) library.get(i)).getTitle() + " | Author: " + ((Library) library.get(i)).getAuthor() + '\n' + '\n';
            }
            messageBox(labelStr, 550, 350);
    		
    	} else if (buttonObj == printLate) {
    		
    		
    		String lateStr = "TITLE | BORROWER | # OF DAYS LATE" + '\n' + '\n';
    		
    		for (int i=0; i<library.size(); i++) {
    			
    			if (((Library) library.get(i)).getBorrower() != null) {
    				String loanDate = ((Library) library.get(i)).getBorrowDate();
    				
    				String day = loanDate.substring(0, 2);
    				String month = loanDate.substring(3, 5);
    				String year = loanDate.substring(6);
    				
    				loanDate = year+"-"+month+"-"+day;
    				
    				LocalDate dateBefore = LocalDate.parse(loanDate);
    				
    				long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, LocalDate.now());
    				
    				if (noOfDaysBetween > 14) {
    					lateStr += ((Library) library.get(i)).getTitle() + " | Borrowed by: " + ((Library) library.get(i)).getBorrower() + " | Days late: " + (noOfDaysBetween - 14) + '\n' + '\n';
    				}
    				
    				
    			}
    			
    		}
    		
    		messageBox(lateStr, 550, 350);
    		
    		
    	} else if (buttonObj == printBorrowed) {
    		String labelStr = " # | TITLE | BORROWER | DATE BORROWED" + '\n' + '\n';
    		
    		for (int i=0; i<library.size(); i++) {
            	if (((Library) library.get(i)).getBorrower() != null) {
            		labelStr += i+1 + ". " + ((Library) library.get(i)).getTitle() + " | Borrowed by: " + ((Library) library.get(i)).getBorrower() + " | Borrowed on: " + ((Library) library.get(i)).getBorrowDate() + '\n' + '\n';
            	}
            }
            messageBox(labelStr, 550, 350);
    		
    	} else if (buttonObj == search) {
    		Search search = new Search(this, library);
    		
    		search.setVisible(true);
    		
    	} else if (buttonObj == printNumOfBooks) {
//    		messageBox(library.size() + ", books in the library");
    		if (lib.getBookCount() == 1) {
    			messageBox(lib.getBookCount() + ", book in the library.");
    		} else {
    			messageBox(lib.getBookCount() + ", books in the library.");
    		}
    	} else if (buttonObj == header) {
    		messageBox("If program is broken - Created by Dhruvan Prakash." + '\n' + '\n' + "If program works correctly - Created by the marvelous, one and only, KRISH CHAVAN!", 600, 150);
    	}
    	
    }
    
    

    // Creation of the frame
    
    public static void main(String[] args) {
        frm = new Main();
        frm.setTitle ("Krish's Library");
        frm.setSize (600, 250);
        frm.setVisible (true);
    }

}
