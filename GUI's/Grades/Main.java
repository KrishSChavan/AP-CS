package sorting;
import java.awt.Color;
import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	static JFrame frm;
	
	JLabel ammt = addLabel("0 students entered", 1,2,1,1);
	JTextField nameField = addTextField ("", 2,2,1,1);
	JButton addName = addButton ("ADD", 3,2,1,1);
	JButton reset = addButton ("Reset", 3,1,1,1);
	JButton print = addButton ("Print All", 3,3,1,1);
	
	int count = 0;
	int stu[] = new int[15];
	boolean thereIsSpace = true;
	
	
	public Main() {
		addName.setBackground(Color.pink);
		addName.setForeground(Color.white);
	}
	
	public void buttonClicked(JButton btn) {
		if (btn == addName && !nameField.getText().isBlank()) {
			Student k = new Student(nameField.getText(), 0, 0, 0, 0);
			
			System.out.println(k.getStu());
		}
	}
	
	
	public static void main(String[] args) {
		frm = new Main();
    frm.setTitle ("Krish's Calculator");
    frm.setSize (400, 250);
    frm.setVisible(true);
	}

}
