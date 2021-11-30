import java.util.*;

import javax.swing.*;
import BreezySwing.*;


public class AddBook extends GBDialog {

	JLabel bookTitleLbl = addLabel ("Title", 1,1,1,1);
    JTextField titleFld = addTextField ("", 1,2,5,1);
    JLabel bookAuthorLbl = addLabel ("Author", 2,1,1,1);
    JTextField authorFld = addTextField ("", 2,2,5,1);
//    JLabel daysLbl = addLabel ("Daily hours",3,1,1,1);
//    IntegerField day1Fld = addIntegerField (0, 3,2,1,1);
//    IntegerField day2Fld = addIntegerField (0, 3,3,1,1);
//    IntegerField day3Fld = addIntegerField (0, 3,4,1,1);
//    IntegerField day4Fld = addIntegerField (0, 3,5,1,1);
//    IntegerField day5Fld = addIntegerField (0, 3,6,1,1);
 
    JButton okBtn = addButton ("OK", 3,2,2,1);
    JButton cancelBtn = addButton ("Cancel", 3,4,2,1);
	
	
	
	public AddBook(JFrame parent){
	    // The next few lines are part of every dialog
        super (parent);                                 // ** REQUIRED **
        setTitle ("Add Book");
        setDlgCloseIndicator ("Cancel");  
        setSize (300, 200);
		
//        this.library = library2;
//        nameFld.setText ("wow");
//        payRateFld.setNumber (1);
//        day1Fld.setNumber (2);
//        day2Fld.setNumber (3);
//        day3Fld.setNumber (4);
//        day4Fld.setNumber (5);
//        day5Fld.setNumber (6);
    }
	
	
	public void buttonClicked(JButton buttonObj) {
    	
    	if (buttonObj == okBtn) {
    		Library lib = new Library();
    		lib.setBook(titleFld.getText(), authorFld.getText());
    	} else if (buttonObj == cancelBtn) {
    		
    	}
    	
    }
	
	
}
