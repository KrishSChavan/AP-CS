import javax.swing.*;
import BreezySwing.*;

public class DecreasingSeq extends GBFrame {

	static JFrame frm;
	
	JLabel instructions = addLabel("Type in a sentence...", 1, 1, 1, 1);
	
	JLabel blank = addLabel("", 2, 1, 1, 1);
	
	JTextField textField = addTextField("", 3, 1, 1, 1);

    JLabel blank2 = addLabel("", 4, 1, 1, 1);

    JButton enterBtn = addButton ("Finished", 5,1,1,1);
    
    

    public void buttonClicked(JButton buttonObj){
    	
    	if (buttonObj == enterBtn) {
    		Counts counts = new Counts();
    		counts.enter(textField.getText());
    	}
    	
    }
    
    

    public static void main(String[] args) {
        frm = new DecreasingSeq();
        frm.setTitle ("Decreasing Sequence");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
