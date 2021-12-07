import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	
	static JFrame frm;	
	
//	JLabel blank = addLabel("", 2, 1, 1, 1);
	
	
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
	
	Library lib = new Library("First Book Author", "First Book Title", "K", "01-01-2021");
	Library lib2 = new Library("1", "1", "A", "02-02-2021");
	Library lib3 = new Library("2", "2", "Smita", "03-03-2021");
	Library lib4 = new Library("3", "3", "Sand", "04-04-2021");
	Library nullBook = new Library("null!", "NULL!", null, null);
	
	boolean starterBookAdded = false;
	
    public void buttonClicked(JButton buttonObj) {
    	
    	if (!starterBookAdded) {
    		library.add(lib);
    		library.add(lib2);
    		library.add(lib3);
    		library.add(lib4);
    		library.add(nullBook);
    		header.setBackground(Color.pink);
    		starterBookAdded = true;
    	}
    	
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
    		messageBox("Created by the one and only, KRISH CHAVAN!", 320, 100);
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
