import java.awt.Dialog;
import java.util.*;

import javax.swing.*;
import BreezySwing.*;




public class AddBook extends GBDialog {

	JLabel bookTitleLbl = addLabel ("Title:", 1,1,1,1);
    JTextField titleFld = addTextField ("", 1,2,5,1);
    JLabel bookAuthorLbl = addLabel ("Author:", 2,1,1,1);
    JTextField authorFld = addTextField ("", 2,2,5,1);
    
//    JLabel bookBorrowerLbl = addLabel ("Your Name:", 3,1,1,1);
//    JTextField borrowerFld = addTextField ("", 3,2,5,1);
//    
//    JLabel daysLbl = addLabel ("Date DD/MM/YY",4,1,1,1);
//    IntegerField dayFld = addIntegerField (0, 4,3,1,1);
//    IntegerField monthFld = addIntegerField (0, 4,2,1,1);
//    IntegerField yearFld = addIntegerField (0, 4,4,1,1);
////    IntegerField day4Fld = addIntegerField (0, 3,5,1,1);
////    IntegerField day5Fld = addIntegerField (0, 3,6,1,1);
 
    JButton okBtn = addButton ("OK", 3,2,2,1);
    JButton cancelBtn = addButton ("Cancel", 3,4,2,1);
    
    public ArrayList<Object> library;
    
	public AddBook(JFrame parent, ArrayList<Object> lib){
	    // The next few lines are part of every dialog
        super (parent);                                 // ** REQUIRED **
        setTitle ("Add Book");
        setDlgCloseIndicator ("Cancel");
        setSize (300, 200);
		
        this.library = lib;
        
        System.out.println();
        
//        this.library = library2;
//        nameFld.setText ("wow");
//        payRateFld.setNumber (1);
//        day1Fld.setNumber (2);
//        day2Fld.setNumber (3);
//        day3Fld.setNumber (4);
//        day4Fld.setNumber (5);
//        day5Fld.setNumber (6);
    }
	
	public int doubleAmnt(String str) {
		if (str.length() == 1) {
    		str = 0 + "" + str;	
    	}
		return Integer.parseInt(str);
	}
	
	public void buttonClicked(JButton buttonObj){
        // The choice of buttons is entirely up to the programmer
        // HOWEVER, pull down menus are NOT available.
        if (buttonObj == okBtn){
        	
//        	int day = doubleAmnt(dayFld.getText());
//        	if (day > 31) {
//        		messageBox("Invalid day entered");
//        	}
//        	
//        	int month = doubleAmnt(monthFld.getText());
//        	if (month > 12) {
//        		messageBox("Invalid month entered");
//        	}
//        	
//        	
//        	int year = doubleAmnt(yearFld.getText());
//        	
//        	
//        	String fullDate = "" + day + month + year;
//        	
//        	System.out.println(fullDate);
        	
        	Library addBook = new Library(authorFld.getText(), titleFld.getText(), false, null, null);
        	
        	System.out.println(addBook);
        	
        	library.add(addBook);
        	
        	
        	
        	System.out.println(((Library) library.get(0)).getTitle());
        	
        	
            setDlgCloseIndicator ("OK");
        }
        dispose();
    }
	
}
