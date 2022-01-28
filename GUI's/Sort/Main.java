package sorting;
import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	static JFrame frm;
	
	JLabel ammt = addLabel("0 numbers entered", 1,2,1,1);
	JTextField num = addTextField ("", 2,2,1,1);
	JButton add = addButton ("ADD", 3,2,1,1);
	JButton mean = addButton ("Mean", 4,1,1,1);
	JButton median = addButton ("Median", 4,2,1,1);
	JButton mode = addButton ("Mode", 4,3,1,1);
	
	int count = 0;
	int nums[] = new int[25];
	boolean thereIsSpace = true;
	
	public void buttonClicked(JButton btn) {
		if (btn == add) {
			num.setText("");
			enter(num.getText());
			if (count == 25) {
				add.setVisible(false);
				num.setVisible(false);
			}
		} else if (btn == mean) {
			
		} else if (btn == median) {
			
		} else if (btn == mode) {
			
		}
	}
	
	
	public void enter(String num) {
		
		System.out.println(Integer.parseInt(num));
		
		try{
		    int numb = Integer.parseInt(num);
		    nums[count] = numb;
			count++;
			ammt.setText((count) + " numbers entered");
		}catch (NumberFormatException ex) {
		    messageBox("Enter an integer value");
		}
		
		
	}
	
//	public double mean() {
//		for (int i=0; i<count; i++) {
//			
//		}
//	}
	
	public void median() {
		
	}
	
	public void mode() {
		
	}
	
	public static void main(String[] args) {
		frm = new Main();
        frm.setTitle ("Krish's Calculator");
        frm.setSize (400, 250);
        frm.setVisible (true);
	}

}
