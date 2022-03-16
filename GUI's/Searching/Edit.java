import java.awt.Color;

import javax.swing.*;
import BreezySwing.*;

public class Edit extends GBDialog {

	JButton who = addButton("", 1,2,1,1);
	JButton nameLbl = addButton("Edit Name:", 2,1,1,1);
	JButton ageLbl = addButton("Edit Age:", 2,3,1,1);
	JTextField nameField = addTextField ("", 3,1,1,1);
	IntegerField ageField = addIntegerField (0, 3,3,1,1);
	JButton save = addButton ("SAVE CHANGES", 3,2,1,1);
	JButton delete = addButton ("DELETE", 4,2,1,1);
	JButton leave = addButton ("LEAVE PAGE", 5,2,1,1);
	
	Person p;
	
	public Edit(JFrame search, String name, Person[] people) {
		super(search);
		setTitle ("Edit: " + name);
        setDlgCloseIndicator ("Cancel");
        setSize (450, 350);
		// TODO Auto-generated constructor stub
		
		for (int i=0; i<people.length; i++) {
			if (name.equals(people[i].getName())) {
				this.p = people[i];
			}
		}
		
		this.who.setText("Editing: " + name);
		this.nameField.setText(name);
		this.ageField.setNumber(this.p.getAge());
		
		save.setBackground(Color.GREEN);
		delete.setBackground(Color.RED);
		
		who.setBackground(Color.GRAY);
		who.setForeground(Color.WHITE);
		who.setBorderPainted(false);
		
		nameLbl.setBackground(Color.GRAY);
		nameLbl.setForeground(Color.WHITE);
		nameLbl.setBorderPainted(false);
		
		ageLbl.setBackground(Color.GRAY);
		ageLbl.setForeground(Color.WHITE);
		ageLbl.setBorderPainted(false);
	}
	
	
	
	public void buttonClicked(JButton btn) {
		if (btn == leave) {
			dispose();
		}
	}
	
	
}
