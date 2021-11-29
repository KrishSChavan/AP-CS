import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class Library extends GBDialog {
	
	
	JLabel nameLbl = addLabel ("Name", 1,1,1,1);
    JTextField nameFld = addTextField ("", 1,2,5,1);
    JLabel payRateLbl = addLabel ("Pay Rate", 2,1,1,1);
    DoubleField payRateFld = addDoubleField (0, 2,2,5,1);
    JLabel daysLbl = addLabel ("Daily hours",3,1,1,1);
    IntegerField day1Fld = addIntegerField (0, 3,2,1,1);
    IntegerField day2Fld = addIntegerField (0, 3,3,1,1);
    IntegerField day3Fld = addIntegerField (0, 3,4,1,1);
    IntegerField day4Fld = addIntegerField (0, 3,5,1,1);
    IntegerField day5Fld = addIntegerField (0, 3,6,1,1);
 
    JButton okBtn = addButton ("OK", 4,2,2,1);
    JButton cancelBtn = addButton ("Cancel", 4,4,2,1);
	
	
	
	private ArrayList<String> library;
	
	public Library(JFrame parent, ArrayList<String> library2){
        // The next few lines are part of every dialog
        super (parent);                                 // ** REQUIRED **
        setTitle ("Edit Employee");
        setDlgCloseIndicator ("Cancel");                
        setSize (300, 200);   
                                  
        this.library = library2;
        nameFld.setText ("wow");
        payRateFld.setNumber (1);
        day1Fld.setNumber (2);
        day2Fld.setNumber (3);
        day3Fld.setNumber (4);
        day4Fld.setNumber (5);
        day5Fld.setNumber (6);
    }
		
	
}
