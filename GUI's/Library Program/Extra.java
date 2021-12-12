import java.util.*;

import javax.swing.*;
import BreezySwing.*;

public class Extra extends GBDialog {

	// Defining GUI elements
	
	JLabel header = addLabel ("Name:", 1,2,1,1);
	
	JTextField name = addTextField ("", 2,1,2,1);
	JButton enterName = addButton ("ENTER", 2,3,1,1);
	
	JButton loan = addButton("LOAN", 2,1,1,1);
	
	JButton returnBook = addButton ("RETURN", 2,1,1,1);
	
	JButton close = addButton ("CLOSE", 3,3,1,1);
	
	
	
	private ArrayList<Library> library;
	private JFrame frame;
	private int index;
	
	public Extra(JFrame frameMain, ArrayList<Library> lib, int bookIndex) {
		super(frameMain);
		setTitle ("Options");
        setSize (350, 200);
        setDlgCloseIndicator ("CLOSE");
        
        this.library = lib;
        this.frame = frameMain;
        this.index = bookIndex;
        
        loan.setVisible(false);
        returnBook.setVisible(false);
        
        if (((Library) library.get(index)).getBorrower() == null) {
    		header.setText("-" + ((Library) library.get(index)).getTitle() + " Options-");
    		loan.setVisible(true);
    		name.setVisible(false);
    		enterName.setVisible(false);
    	}
	}
	
	// Button click event
	
	public void buttonClicked(JButton buttonObj){
	
		if (buttonObj == enterName) {
			
			if (!name.getText().isBlank()) {
				
				header.setText("-" + ((Library) library.get(index)).getTitle() + " Options-");
				
				if (((Library) library.get(index)).getBorrower().equals(name.getText().trim())) {
	        		returnBook.setVisible(true);
	        		name.setVisible(false);
	        		enterName.setVisible(false);
	        	} else if (((Library) library.get(index)).getBorrower() != null) {
	        		name.setVisible(false);
	        		enterName.setVisible(false);
	        		messageBox("No options available. Sorry.");
	        		header.setText("No options available. Sorry.");
	        	}
				
			} else {
				messageBox("Please fill in the NAME field.");
			}
			
		} else if (buttonObj == loan) {
			
			dispose();
			
			CheckOut checkOut = new CheckOut(frame, library);
    		
    		checkOut.setVisible(true);
			
		} else if (buttonObj == returnBook) {
			
			dispose();
			
			ReturnBook returnBook = new ReturnBook(frame, library);
    		
    		returnBook.setVisible(true);
			
		} else if (buttonObj == close) {
			dispose();
		}
		
	}
	
	
	
}
