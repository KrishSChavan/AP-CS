package inheritance;

import javax.swing.*;
import BreezySwing.*;
import java.awt.Color;
import java.awt.Font;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	static JFrame frm;	
	
	
	JButton label = addButton ("Enter Numbers", 1,2,1,1);
	JTextField left = addTextField ("", 2,1,1,1);
//	JLabel middle = addLabel (" ", 2,2,1,1);
	JButton functionBtn = addButton ("ADD", 2,2,1,1);
	JTextField right = addTextField ("", 2,3,1,1);
	
	JButton enter = addButton ("ENTER", 3,2,1,1);
	
	
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
    	
    	if (buttonObj == functionBtn) {
    		changeFunc();
    	} else if (buttonObj == enter) {
    		if (checkBlank()) {
    			
    			if (left.getText().contains("+")) {
    				operandLeft = '+';
    			} else if (left.getText().contains("-")) {
    				operandLeft = '-';
    			} else if (left.getText().contains("*")) {
    				operandLeft = '*';
    			} else if (left.getText().contains("/")) {
    				operandLeft = '/';
    			}
    			
    			if (right.getText().contains("+")) {
    				operandRight = '+';
    			} else if (right.getText().contains("-")) {
    				operandRight = '-';
    			} else if (right.getText().contains("*")) {
    				operandRight = '*';
    			} else if (right.getText().contains("/")) {
    				operandRight = '/';
    			}
    			
    			if (operandLeft == ' ' || operandRight == ' ') {
    				messageBox("Please enter a full term in both fields");
    			} else {
    				
    				Complex comp = new Complex();
    				
    				
//    				messageBox("ANSWER: " + '\n' + comp.add(
//    					parse(left.getText(), left)[0][0],
//    					parse(left.getText(), left)[1][0],
//    					parse(right.getText(), right)[0][0],
//    					parse(right.getText(), right)[1][0]
//    				));
    				
    				messageBox("ANSWER: " + '\n' + comp.subtract(
        					parse(left.getText(), left)[0][0],
        					parse(left.getText(), left)[1][0],
        					parse(right.getText(), right)[0][0],
        					parse(right.getText(), right)[1][0]
        				));
    				
    			}
    			
    		
    		}
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
    	
    	if (left.getText().isBlank() || right.getText().isBlank()) {
    		go = false;
			messageBox("Please fill out all fields.");
    	}
    	
    	return go;
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
