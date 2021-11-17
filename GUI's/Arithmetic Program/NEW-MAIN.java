import java.util.InputMismatchException;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	
	static JFrame frm;
	
	JLabel instructions = addLabel("TYPE AN EQUATION", 1, 2, 1, 1);
	
	JLabel blank = addLabel("", 2, 1, 1, 1);
	
	JTextField textField = addTextField("", 3, 1, 4, 1);

    JLabel blank2 = addLabel("", 4, 1, 1, 1);

    JButton enterBtn = addButton ("Finished", 5,1,1,1);
    JButton clearBtn = addButton ("Clear", 5,3,2,1);
    
    String text = "";
    
    // Checking for button click
    
    public void buttonClicked(JButton buttonObj){
    	
    	// On the click of the enter button the program calls the different methods in the Counts class and prints out all the characters and words
    	
    	if (buttonObj == enterBtn) {
    		
    		text = textField.getText().trim();
    		
    		if (textField.getText().isBlank()) {
    			messageBox("No text entered.");
    		} else if (text.charAt(0) == '=') {
    			
    			// calling calculating methods
    			
    			boolean letterFound = false;
    			
    			for (int i=0; i<text.length(); i++) {
    				if (Character.isLetter(text.charAt(i))) {
    					letterFound = true;
    					messageBox("Error: Please remove all letters from the input.", 400, 150);
    					return;
    				}
    			}
    			if (!letterFound) {
    				try {
    					
    					Calculations calcs = new Calculations();
        				char operand = calcs.findOperand(text);
        				
        				calcs.getNumbers(text);
        				
//        				System.out.println("Operand: " + operand);
//        				System.out.println(text.substring(1));
//        				System.out.println(4/0);
        				
//        				int num1 = Integer.parseInt(text.substring(1,2));
//    					int num2 = Integer.parseInt(text.substring(3,4));
//    					
//    					System.out.println("NUM1: " + num1);
//    					System.out.println("NUM2: " + num2);
//        				
//        				if (operand == '+') {
//        					System.out.println(num1 + num2);
//        				} else if (operand == '-') {
//        					System.out.println(num1 - num2);
//        				} else if (operand == '*') {
//        					System.out.println(num1 * num2);
//        				} else if (operand == '/') {
//        					System.out.println(num1 / num2);
//        				}
    					
    				}
    				//catch block
    				catch(ArithmeticException e) {
    					System.out.println("Exception caught:Invalid Denominator");
    				}
    				catch(InputMismatchException e) {
    					System.out.println("Exception caught:Invalid Input");
    				}
    			}
    			
    			
    		} else {    			
    			messageBox(textField.getText(), textField.getText().length()*6, 250);
    		}
    	} else if (buttonObj == clearBtn) {
    		
    		// On the click of the clear button the text field is cleared
    		
    		textField.setText("");
    	}
    	
    }
    
    

    // Creation of the frame
    
    public static void main(String[] args) {
        frm = new Main();
        frm.setTitle ("Word Finder");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
