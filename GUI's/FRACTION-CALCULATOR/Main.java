import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame{

	// Initializing different parts of the GUI
	
	JLabel Numerator1 				= addLabel ("Numerator 1:", 	1,1,1,1);
	IntegerField numerator1Field	= addIntegerField (1,           1,2,1,1);
	JLabel Denominator1 			= addLabel ("Denominator 1:", 	2,1,1,1);
	IntegerField denominator1Field	= addIntegerField (1,           2,2,1,1);
	
	JLabel Numerator2 				= addLabel ("Numerator 2:", 	3,1,1,1);
	IntegerField numerator2Field	= addIntegerField (1,           3,2,1,1);
	JLabel Denominator2 			= addLabel ("Denominator 2:", 	4,1,1,1);
	IntegerField denominator2Field	= addIntegerField (1,           4,2,1,1);
	
	JButton calculateButton         = addButton ("Multiply",        5,2,1,1);
	
	JTextField answerfield	= addTextField ("Enter 2 fractions above",    6,2,1,1);
	JLabel answerlabel 		= addLabel ("Answer:", 						  6,1,1,1);

	MyClass myClass = new MyClass();
	
	
	// sets the answer field to an error message to the user
	private void printErr(String errMessage) {
		answerfield.setText(errMessage);
	}
	
	public void buttonClicked(JButton buttonObj){
    	
        if (buttonObj == calculateButton){
        	
        	// set the two numerators and denominators
        	myClass.setDenominators(denominator1Field.getNumber(), denominator2Field.getNumber());
        	myClass.setNumerators(numerator1Field.getNumber(), numerator2Field.getNumber());
        	
        	   	      	
        	// Error checking
        	
        	if (denominator1Field.getNumber() == 0 || denominator2Field.getNumber() == 0) {
        		printErr("No 0 allowed in denominator");
        	} else {
        		if (denominator1Field.getNumber() == denominator2Field.getNumber() && numerator1Field.getNumber() == numerator2Field.getNumber()) {
            		if (denominator1Field.getNumber() == numerator1Field.getNumber() && denominator2Field.getNumber() == numerator2Field.getNumber()) {
            			printErr("1 / 1");        			
            		}
        	} else {
        				
    			myClass.GCF();
    			
        		if (myClass.finalDenominator == 1) {
            		answerfield.setText(myClass.finalNumerator + "");
            	} else {
            		if (myClass.finalNumerator < 0 && myClass.finalDenominator < 0) {
            			answerfield.setText(Math.abs(myClass.finalNumerator) + " / " + Math.abs(myClass.finalDenominator));
            		} else {
            			answerfield.setText(myClass.finalNumerator + " / " + myClass.finalDenominator);
            		}
            	}
        	}
        	
        }     
       
        	
        }
     
    }
	
	
	// Creates GUI
	public static void main(String[] args) {
		JFrame frm = new Main();
		frm.setTitle ("Fraction Calculator");
		frm.setSize (500, 200);
		frm.setVisible (true);
	}
}
