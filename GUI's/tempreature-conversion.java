import javax.swing.*;
import BreezySwing.*;

public class GUI extends GBFrame{
			
	    JLabel degreesFahrenheitLabel      = addLabel ("Degrees Fahrenheit", 1,1,1,1);
	    DoubleField degreesFahrenheitField = addDoubleField (32.0,           1,2,1,1);
	    JLabel degreesCelsiusLabel         = addLabel ("Degrees Celsius",    2,1,1,1);
	    DoubleField degreesCelsiusField    = addDoubleField (0.0,            2,2,1,1);
	    JButton fToCButton                 = addButton ("F to C",            3,1,1,1);
	    JButton cToFButton                 = addButton ("C to F",            3,2,1,1);
	    
    // Use if/else statement to determine which button is clicked
	    	    
	    public void buttonClicked(JButton buttonObj){
	        double fahrenheit, celsius;
	        if (buttonObj == fToCButton){
	            fahrenheit = degreesFahrenheitField.getNumber();
	            celsius = (fahrenheit  - 32) * 5.0 / 9.0;
	            degreesCelsiusField.setNumber (celsius);
	        }
	        else {
	            celsius = degreesCelsiusField.getNumber();
	            fahrenheit = celsius * 9.0 / 5.0 + 32;
	            degreesFahrenheitField.setNumber (fahrenheit);
	        }           
	    }

	    public static void main(String[] args){
	        JFrame frm = new GUI();
	        frm.setTitle ("Temperature Conversion");
	        frm.setSize (550, 200);
	        frm.setVisible (true);
	   }

}
