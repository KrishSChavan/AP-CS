package sorting;

import javax.swing.*;
import BreezySwing.*;

public class Search extends GBDialog {

	JTextField nameFld = addTextField("[Name Here]", 1,1,3,3);
	JButton ss = addButton("Sequential Search", 2,1,1,1);
	JButton bs = addButton("Binary Search", 2,3,1,1);
	
	JLabel blank = addLabel ("", 3,2,1,1);
	
	JButton b1 = addButton ("1", 4,2,1,1);
	JButton b2 = addButton ("2", 5,2,1,1);
	JButton b3 = addButton ("3", 6,2,1,1);
	JButton b4 = addButton ("4", 7,2,1,1);
	JButton b5 = addButton ("5", 8,2,1,1);
	
	JButton left = addButton ("<", 9,1,1,1);
	JButton right = addButton (">", 9,3,1,1);
	
	Person[] per;
	
	public Search(JFrame parent, Person[] people){
		// The next few lines are part of every dialog
        super (parent);                                 // ** REQUIRED **
        setTitle ("Search");
        setDlgCloseIndicator ("Cancel");
        setSize (400, 650);
        
        this.per = people;
	}
	
	
	
	
}
