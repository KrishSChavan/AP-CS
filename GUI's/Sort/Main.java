package sorting;
import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	static JFrame frm;
	
	JLabel ammt = addLabel("0 numbers entered", 1,2,1,1);
	IntegerField left = addIntegerField (0, 2,2,1,1);
	JButton add = addButton ("ADD", 3,2,1,1);
	JButton mean = addButton ("Mean", 4,1,1,1);
	JButton median = addButton ("Median", 4,2,1,1);
	JButton mode = addButton ("Mode", 4,3,1,1);
	
	
	public static void main(String[] args) {
		frm = new Main();
        frm.setTitle ("Krish's Calculator");
        frm.setSize (400, 250);
        frm.setVisible (true);
	}

}
