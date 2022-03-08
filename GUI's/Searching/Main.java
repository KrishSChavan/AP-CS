import java.awt.Color;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	static JFrame frm;
	
	JButton ammt = addButton("0 People", 1,2,1,1);
	JButton nameLbl = addButton("Name:", 2,1,1,1);
	JButton ageLbl = addButton("Age:", 2,3,1,1);
	JTextField nameField = addTextField ("", 3,1,1,1);
	IntegerField ageField = addIntegerField (0, 3,3,1,1);
	JButton add = addButton ("ADD", 2,2,1,1);
	JButton print = addButton ("Print", 4,2,1,1);
	
	int count = 0;
//	Person per[] = new Person[1];
	boolean thereIsSpace = true;
	
	
	public Main() {
		add.setBackground(Color.pink);
		add.setForeground(Color.white);
		
		ammt.setBackground(Color.GRAY);
		ammt.setForeground(Color.WHITE);
		ammt.setBorderPainted(false);
		
		nameLbl.setBackground(Color.GRAY);
		nameLbl.setForeground(Color.WHITE);
		nameLbl.setBorderPainted(false);
		
		ageLbl.setBackground(Color.GRAY);
		ageLbl.setForeground(Color.WHITE);
		ageLbl.setBorderPainted(false);
	}
	
	
	
	public void buttonClicked(JButton btn) {
		if (btn == add && valid() == "") {
			Person p = new Person(nameField.getText(), Integer.parseInt(ageField.getText()));
			
			System.out.println("Age: " + p.getAge() + " Name: " + p.getName());
		} else {
			messageBox(valid());
		}
	}
	
	
	
	public String valid() {
		
		String go = "";
		
		if (nameField.getText().isBlank() || ageField.getText().isBlank()) {
			go = "Fill all fields";
		} else {
			String txt = ageField.getText();
			for (int i=0; i<txt.length(); i++) {
				if (!Character.isDigit(txt.charAt(i))) {
					go = "Only numbers allowed in AGE field.";
					return go;
				}
			}
			
		}
		
		return go;
	}
	
	
	
	public static void main(String[] args) {
		frm = new Main();
        frm.setTitle ("Krish's Calculator");
        frm.setSize (400, 250);
        frm.setVisible(true);
	}

}
