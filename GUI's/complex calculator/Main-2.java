package inheritance;

import javax.swing.*;
import BreezySwing.*;
import java.awt.Color;
import java.awt.Font;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	static JFrame frm;	
	
	
	JButton label = addButton ("Enter Numbers", 1,2,1,1);
	
	IntegerField leftT = addIntegerField (0, 2,1,1,1);
	JTextField leftOperand = addTextField ("", 3,1,1,1);
	IntegerField leftB = addIntegerField (0, 4,1,1,1);
	JLabel iL = addLabel ("i", 4,2,1,1);

	JButton functionBtn = addButton ("ADD", 3,2,1,1);
	
	IntegerField rightT = addIntegerField (0, 2,3,1,1);
	JTextField rightOperand = addTextField ("", 3,3,1,1);
	IntegerField rightB = addIntegerField (0, 4,3,1,1);
	JLabel iR = addLabel ("i", 4,4,1,1);
	
	JButton enter = addButton ("ENTER", 6,2,1,1);
	JButton info = addButton ("Info", 6,4,1,1);
	
	
	String[] funcArr = {
		"ADD",
		"SUBTRACT",
		"DIVIDE",
		"MULITPLY"
	};
	
	int funcCount = 0;
	String func = funcArr[funcCount]; // add
	
	char operandLeft = ' ';
	char operandRight = ' ';
	
	public Main() {
		
		label.setForeground(Color.WHITE);
		label.setBackground(Color.PINK);
	
	}
	
    // Checking for button click
	
    public void buttonClicked(JButton buttonObj) {
    	
    	if (buttonObj == info) {
    		messageBox("Enter numbers into the top and bottom fields, while entering a operand in the middle fields.");
    	} else if (buttonObj == functionBtn) {
    		changeFunc();
    	} else if (buttonObj == enter) {
    		if (checkBlank() && getOperand()) {
    			
    			performFunc();
    		
    		}
    	}
    	
    }
    
    public void performFunc() {
    	
    	Complex comp = new Complex();
    	
    	if (func == "ADD") {
    		
    		messageBox("ANSWER: " + '\n' + comp.add(
    			leftT.getNumber(),
    			leftB.getNumber(),
    			rightT.getNumber(),
    			rightB.getNumber()
    		));
    		
    	} else if (func == "SUBTRACT") {
    		
    		messageBox("ANSWER: " + '\n' + comp.subtract(
    			leftT.getNumber(),
        		leftB.getNumber(),
        		rightT.getNumber(),
        		rightB.getNumber()
    		));
    		
    	} else if (func == "DIVIDE") {
    		
    	} else if (func == "MULITPLY") {
    		
    	}
    	
    }
    
    public String[][] parse(String str, JTextField field) {
    	
//    	String[] leftNumbers = new String[2];
//    	String[] rightNumbers = new String[2];
    	
    	String[][] numbers = new String[2][2];
    	
    	int numFoundCount = 0;
    	
    	str = str.replaceAll("\\s+",""); 
    	
    	for (int i=0; i<str.length(); i++) {
    		if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
    			if (i >= 1 && i+1 < str.length()) {
    				System.out.println(str.substring(0, i).trim());
    				System.out.println(str.substring(i+1, str.length()).trim());
    				
    				numbers[0][numFoundCount] = str.substring(0, i).trim();
    				numbers[1][numFoundCount] = str.substring(i, str.length()).trim();
    				numFoundCount++;
    				
    			} else if (field == left) {
    				messageBox("Please enter a valid argument for the LEFT field", 400, 150);
    			} else if (field == right) {
    				messageBox("Please enter a valid argument for the RIGHT field", 400, 150);
    			}
    		}
    	}
    	
    	return numbers;
    	
    }
  
    public boolean checkBlank() {
    	
    	boolean go = true;
    	
    	if (leftT.getText().isBlank() || leftOperand.getText().isBlank() || leftB.getText().isBlank() ||
    			rightT.getText().isBlank() || rightOperand.getText().isBlank() || rightB.getText().isBlank()) {
    		go = false;
			messageBox("Please fill out all fields.");
    	}
    	
    	return go;
    }
    
    public boolean getOperand() {

    	boolean valid = true;
    	
    	if (leftOperand.getText().trim().contains("+")) {
			operandLeft = '+';
		} else if (leftOperand.getText().trim().contains("-")) {
			operandLeft = '-';
		} else if (leftOperand.getText().trim().contains("*")) {
			operandLeft = '*';
		} else if (leftOperand.getText().trim().contains("/")) {
			operandLeft = '/';
		} else {
			valid = false;
			messageBox("Please enter a valid LEFT operand.");
		}
    	
    	if (valid) {
    		if (rightOperand.getText().trim().contains("+")) {
    			operandRight = '+';
    		} else if (rightOperand.getText().trim().contains("-")) {
    			operandRight = '-';
    		} else if (rightOperand.getText().trim().contains("*")) {
    			operandRight = '*';
    		} else if (rightOperand.getText().trim().contains("/")) {
    			operandRight = '/';
    		} else {
    			valid = false;
    			messageBox("Please enter a valid RIGHT operand.");
    		}
    	}
    	
    	
    	
    	return valid;
    }
    
    public void changeFunc() {
    	
    	
    /*	a - add
    	s - subtract
    	d - divide
    	m - multiply   */
    	
    	
    	if (funcCount < 3) {
    		funcCount++;
    	} else {
    		funcCount = 0;
    	}
    	
    	func = funcArr[funcCount];
    	
    	functionBtn.setText(func);
    	
    }
    
    
    // Creation of the frame
    
    public static void main(String[] args) {
        frm = new Main();
        frm.setTitle ("Krish's Calculator");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
