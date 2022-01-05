import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	static JFrame frm;	
	
	
	JButton person = addButton ("Person", 1,1,1,1);
	JButton student = addButton ("Student", 2,1,1,1);
	JButton undergrad = addButton ("Undergraduate", 3,1,1,1);
	JButton grad = addButton ("Graduate", 4,1,1,1);
    
    // Checking for button click
	
    public void buttonClicked(JButton buttonObj) {
    	
    	if (buttonObj == person) {
    		Person createPerson = new Person(this);
        	createPerson.setVisible(true);
    	} else if (buttonObj == student) {
    		
    	} else if (buttonObj == undergrad) {
    		
    	} else if (buttonObj == grad) {
    		
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
