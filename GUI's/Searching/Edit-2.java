package sorting;

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
	
	Person[] per;
	int count = 0;
	Person p;
	JFrame frm;
	
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
		
		this.frm = search;
		this.count = people.length;
		this.per = people;
		this.who.setText("Editing: " + p.getName());
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
		if (btn == delete) {
			delete(p);
		}
	}
	
	public void delete(Person p) {	
		int index = 0;
		for (int i=0; i<per.length; i++) {
			if (per[i].equals(p)) {
				index = i;
				break;
			}
		}
		count--;
		per[index] = per[per.length-1];
        Person[] newArr = new Person[count];
        for (int i=0; i<count; i++) {
            newArr[i] = per[i];
        }
        per = newArr;
        print();
        Main m = new Main(per);
        frm.setVisible(false);
        m.setVisible(true);
	}
	
	public void print() {
		
		System.out.println();
		System.out.println("EDIT PAGE");
		System.out.println();
		
		for (int i=0; i<count; i++) {
			System.out.println(i+") " + per[i].getName());
		}
	}

	
}
