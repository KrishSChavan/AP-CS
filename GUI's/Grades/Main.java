import java.awt.Color;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	static JFrame frm;
	
	JButton ammt = addButton("0 Students", 1,2,1,1);
	JTextField nameField = addTextField ("", 2,2,1,1);
	JButton addName = addButton ("ADD", 3,2,1,1);
	JButton reset = addButton ("Reset", 3,1,1,1);
	JButton print = addButton ("Print All", 3,3,1,1);
	
	int count = 0;
	Student stu[] = new Student[15];
	boolean thereIsSpace = true;
	
	
	public Main() {
		addName.setBackground(Color.pink);
		addName.setForeground(Color.white);
		
		ammt.setBackground(Color.GRAY);
		ammt.setForeground(Color.WHITE);
		ammt.setBorderPainted(false);
	}
	
	
	
	public void buttonClicked(JButton btn) {
		if (btn == addName && !nameField.getText().isBlank()) {
			nameField.requestFocus();
			add();
			Grades grades = new Grades(this, stu[count-1]);
			grades.setVisible(true);
		} else if (btn == print) {
			AllStudents as = new AllStudents();
			
			messageBox(as.printSorted(stu, count), 600, 250);
			
		} else if (btn == reset) {
			reset();
		}
	}
	
	
	public void add() {
		if (count == 15) {
			addName.setVisible(false);
			nameField.setVisible(false);
			return;
		}
		
		stu[count] = new Student(nameField.getText(), 0, 0, 0, 0);
		nameField.setText("");
		count++;
		ammt.setText(count + " Students");
	}
	
	public void reset() {
		count = 0;
		addName.setVisible(true);
		nameField.setVisible(true);
		ammt.setText(count + " students added");
		nameField.setText("");
	}
	
	public static void main(String[] args) {
		frm = new Main();
        frm.setTitle ("Krish's Calculator");
        frm.setSize (400, 250);
        frm.setVisible(true);
	}

}
