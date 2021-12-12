import java.util.*;

import javax.swing.*;
import BreezySwing.*;




public class AddBook extends GBDialog {

// Defining GUI elements	
	
    JLabel bookTitleLbl = addLabel ("Title:", 1,1,1,1);
    JTextField titleFld = addTextField ("", 1,2,5,1);
    JLabel bookAuthorLbl = addLabel ("Author:", 2,1,1,1);
    JTextField authorFld = addTextField ("", 2,2,5,1);
 
    JButton okBtn = addButton ("OK", 3,2,2,1);
    JButton cancelBtn = addButton ("CLOSE", 3,4,2,1);
    
    private ArrayList<Library> library;
    
	public AddBook(JFrame parent, ArrayList<Library> lib){
	    // The next few lines are part of every dialog
        super (parent);                                 // ** REQUIRED **
        setTitle ("Add Book");
        setDlgCloseIndicator ("Cancel");
        setSize (300, 200);
		
        this.library = lib;
    }
	
	// Button click event
	
	public void buttonClicked(JButton buttonObj){
        
        if (buttonObj == okBtn){
        	
        	if (!titleFld.getText().isBlank()) {
        		if (!authorFld.getText().isBlank()) {
        			
        			Library addBook = new Library(authorFld.getText(), titleFld.getText(), null, null);
        			
        			System.out.println("book added!");
                	
                	library.add(addBook);    	
                	
                    setDlgCloseIndicator ("OK");
                    
                    dispose();
        			
        		} else {
        			messageBox("Please fill in the AUTHOR field.");
        		}
        	} else {
        		messageBox("Please fill in the TITLE field.");
        	}
        	
        } else if (buttonObj == cancelBtn) {
        	dispose();
        }
        
    }
	
}
