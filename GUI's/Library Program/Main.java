import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	
	static JFrame frm;
	
	JLabel instructions = addLabel("Le Library", 1, 3, 1, 1);
	
	
	JLabel blank = addLabel("", 2, 1, 1, 1);
	
	
	JButton addBook = addButton ("Add Book", 3,1,1,1);
	JButton checkoutBook = addButton ("Checkout Book", 3,2,1,1);
	JLabel blank2 = addLabel("", 3, 3, 1, 1);
	JButton search = addButton ("Search", 3,4,1,1);
	JButton printAll = addButton ("Print All", 3,5,1,1);
	
	
	
	
	
//	JLabel text1 = addLabel("Book 1", 3, 1, 1, 1);
//	JLabel text2 = addLabel("Book 1", 3, 2, 1, 1);
//	JLabel text3 = addLabel("Book 1", 3, 3, 1, 1);
//	JLabel text4 = addLabel("Book 1", 3, 4, 1, 1);
//	JLabel text5 = addLabel("Book 1", 3, 5, 1, 1);
	
	
	
//	
//	JTextField textField = addTextField("", 3, 1, 1, 1);
//
//    JLabel blank2 = addLabel("", 4, 1, 1, 1);
//
//    JButton enterBtn = addButton ("Finished", 5,2,1,1);
//    JButton clearBtn = addButton ("Clear", 5,3,2,1);
    
    // Checking for button click
    
	ArrayList<String> library = new ArrayList<String>();
	
	
    public void buttonClicked(JButton buttonObj) {
    	
    	System.out.println(library);
    	
    	Library dlg = new Library(this, library);
    	dlg.setVisible (true);
    	
    }
    
    

    // Creation of the frame
    
    public static void main(String[] args) {
        frm = new Main();
        frm.setTitle ("Le Library");
        frm.setSize (600, 250);
        frm.setVisible (true);
    }

}
