package sorting;

import javax.swing.*;
import BreezySwing.*;

public class Search extends GBDialog {

	JTextField nameFld = addTextField("[Name Here]", 1,1,3,3);
	JButton ss = addButton("Sequential Search", 2,1,1,1);
	JButton bs = addButton("Binary Search", 2,3,1,1);
	
	JLabel blank = addLabel ("", 3,2,1,1);
	
	GBPanel container = addPanel(  4,2,1,1);
	
	JButton b1 = container.addButton ("", 4,2,1,1);
	JButton b2 = container.addButton ("", 5,2,1,1);
	JButton b3 = container.addButton ("", 6,2,1,1);
	JButton b4 = container.addButton ("", 7,2,1,1);
	JButton b5 = container.addButton ("", 8,2,1,1);
	
	JButton left = container.addButton ("<", 9,1,1,1);
	JButton right = container.addButton (">", 9,3,1,1);
	
	
	JButton done = addButton ("DONE", 10,2,1,1);
	
	JFrame frm;
	
	Person[] per;
	int interval = 0;
	JButton[] btns = { b1,b2,b3,b4,b5 };
	
	public Search(JFrame parent, Person[] people){
		// The next few lines are part of every dialog
        super (parent);                                 // ** REQUIRED **
        setTitle ("Search");
        setDlgCloseIndicator ("Cancel");
        setSize (450, 650);
        
        this.per = people;
        display(interval);
        this.frm = parent;
	}
	
	
	public void buttonClicked(JButton btn) {
		
		for (int i=0; i<btns.length; i++) {
			if (btn == btns[i]) {
				Edit e = new Edit(frm, btn.getText().substring(5), per);
				e.setVisible(true);
			}
		}
		
		if (btn == left) {
			if ((interval-4) >= 0) {
				interval -= 4;
			} else {
				interval = 0;
			}
			display(interval);
		} else if (btn == right) {
			if ((interval+4) <= (per.length-1)) {
				interval += 4;
			} else {
				interval = per.length - 1;
			}
			display(interval);
		} else if (btn == done) {
			dispose();
		}
	}
	
	
	public void display(int i) {
		
//		if ((i+5) > per.length-1) {
//			right.setEnabled(false);
//		} else if (i == 0) {
//			left.setEnabled(false);
//		} else if ((i+5) <= per.length-1) {
//			right.setEnabled(true);
//		} else if (i > 0) {
//			left.setEnabled(true);
//		}
		
		
		if ((i+5) % btns.length == 0) {
			for (int j=0; j<btns.length; j++) {
				if ((i+j) >= per.length) {
					hideBtns(j);
					return;
				}
				btns[j].setText("Edit " + per[i+j].getName());
				btns[j].setVisible(true);
			}
		} else {
			int remainder = per.length % btns.length;
			int btnsToShow = (btns.length - remainder) + 1;
			int btnsToHide = btns.length - btnsToShow;
			System.out.println();
			System.out.println("remainder: " + remainder + "   buttons to show: " + (btnsToShow-1) + "   buttons to hide: " + btnsToHide);
			if (btnsToHide > -1) {
				for (int l = btns.length - 1; l >= btnsToHide; l--) {
//					btns[l].setText("");
					btns[l].setVisible(false);
				}
			}
			for (int j=0; j<btnsToShow; j++) {
				if ((i+j) >= per.length) return;
				btns[j].setText("Edit " + per[i+j].getName());
				btns[j].setVisible(true);
			}
			
		}
	}
	
	
	
	public void hideBtns(int j) {
		for (int i=j; i<btns.length; i++) {
			btns[i].setVisible(false);
		}
	}
	
	
	
}
