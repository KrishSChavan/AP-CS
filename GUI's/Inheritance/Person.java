import java.util.*;

import javax.swing.*;
import BreezySwing.*;


public class Person extends GBDialog {

	JLabel nameLbl = addLabel ("Name:", 1,1,1,1);
	JTextField nameFld = addTextField ("", 1,2,1,1);
	
	JButton okBtn = addButton ("OK", 3,2,2,1);
    JButton cancelBtn = addButton ("CLOSE", 3,4,2,1);
	
	public Person(JFrame frm) {
		super(frm);
		setTitle ("Create Person");
        setDlgCloseIndicator ("Cancel");
        setSize (300, 200);
	}
	
	
	public void buttonClicked(JButton buttonObj){
		
	}
	

}
