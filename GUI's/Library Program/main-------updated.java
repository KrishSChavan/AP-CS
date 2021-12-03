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
	JButton printNumOfBooks = addButton ("Print Library Count", 5,3,1,1);
	
	
    
    // Checking for button click
	
	public ArrayList<Object> library = new ArrayList<Object>();
	
//	Library lib = new Library();
	
    public void buttonClicked(JButton buttonObj) {
    	
    	if (buttonObj == addBook) {
//    		System.out.println(library);
        	AddBook addBookDlg = new AddBook(this, library);
        	addBookDlg.setVisible(true);
        	
//        	System.out.println(library);
        	
    	} else if (buttonObj == checkoutBook) {
//    		CheckOut checkOut = new CheckOut(this, library);
    	} else if (buttonObj == returnBook) {
    		
    	} else if (buttonObj == printAll) {
    		
    	} else if (buttonObj == printLate) {
    		
    	} else if (buttonObj == printBorrowed) {
    		
    	} else if (buttonObj == search) {
    		
    	} else if (buttonObj == printNumOfBooks) {
    		messageBox(library.size() + ", books in the library");
    	}
    	
    }
    
    

    // Creation of the frame
    
    public static void main(String[] args) {
        frm = new Main();
        frm.setTitle ("Le Library");
        frm.setSize (600, 250);
        frm.setVisible (true);
    }

}
