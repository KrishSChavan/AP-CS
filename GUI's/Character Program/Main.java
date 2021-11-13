import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	static JFrame frm;
	
	JLabel instructions = addLabel("Type in a sentence...", 1, 2, 1, 1);
	
	JLabel blank = addLabel("", 2, 1, 1, 1);
	
	JTextField textField = addTextField("", 3, 1, 2, 2);

    JLabel blank2 = addLabel("", 4, 1, 1, 1);

    JButton enterBtn = addButton ("Finished", 5,1,1,1);
    JButton clearBtn = addButton ("Clear", 5,2,1,1);
    

    public void buttonClicked(JButton buttonObj){
    	
    	if (buttonObj == enterBtn) {
    		Counts counts = new Counts();
    		String outputString = counts.getSpaces(textField.getText());
    		int ammntOfWords = counts.storeWords(textField.getText() + " ");
    		String[] output = new String[ammntOfWords];
    		
    		output = counts.printWords(ammntOfWords);
    		
    		
    		
    		for (int i=0; i<output.length; i++) {
    			outputString += '\n' + output[i];
    		}
    		messageBox(outputString, 300, 200+(output.length*15));
    	} else if (buttonObj == clearBtn) {
    		textField.setText("");
    	}
    	
    }
    
    

    public static void main(String[] args) {
        frm = new Main();
        frm.setTitle ("Decreasing Sequence");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
