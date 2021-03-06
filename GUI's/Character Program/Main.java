import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	
	// Defining parts of the frame
	
	
	static JFrame frm;
	
	JLabel instructions = addLabel("TYPE A SENTENCE..", 1, 2, 1, 1);
	
	JLabel blank = addLabel("", 2, 1, 1, 1);
	
	JTextField textField = addTextField("", 3, 1, 4, 1);

    JLabel blank2 = addLabel("", 4, 1, 1, 1);

    JButton enterBtn = addButton ("Finished", 5,1,1,1);
    JButton clearBtn = addButton ("Clear", 5,3,2,1);
    

    
    // Checking for button click
    
    public void buttonClicked(JButton buttonObj){
    	
    	// On the click of the enter button the program calls the different methods in the Counts class and prints out all the characters and words
    	
    	if (buttonObj == enterBtn) {
    		if (textField.getText().isBlank()) {
    			messageBox("No text entered.");
    		} else {
    			Counts counts = new Counts();
        		String outputString = counts.getChars(textField.getText());
        		int ammntOfWords = counts.storeWords(textField.getText() + " ");
        		
        		outputString += '\n';
        		outputString += counts.rwc + " words found:" + '\n';
        		
        		String[] output = new String[ammntOfWords];
        		
        		output = counts.printWords(ammntOfWords);
        		
        		
        		
        		for (int i=0; i<output.length; i++) {
        			outputString += '\n' + output[i];
        		}
        		messageBox(outputString, 390, 200+(output.length*15));
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
