package sorting;

import java.awt.Color;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	static JFrame frm;
	
	JButton ammt = addButton("People: 0", 1,2,1,1);
	JButton nameLbl = addButton("Name:", 2,1,1,1);
	JButton ageLbl = addButton("Age:", 2,3,1,1);
	JTextField nameField = addTextField ("", 3,1,1,1);
	IntegerField ageField = addIntegerField (0, 3,3,1,1);
	JButton add = addButton ("ADD", 4,2,1,1);
	JButton search = addButton ("Search", 4,1,1,1);
	JButton printAll = addButton("Print All", 4,3,1,1);
	
	static int count = 0;
	static Person per[];
	
	
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
		
		nameField.grabFocus();
		
		ammt.setText("People: " + count);
	}
	
	
	
	
	
	public void buttonClicked(JButton btn) {
		if (btn == add) {
			if (valid() == "") {
				Person p = new Person(nameField.getText(), Integer.parseInt(ageField.getText()));
				add(p);
				System.out.println("Age: " + p.getAge() + " Name: " + p.getName());
			} else {
				messageBox(valid());
			}
			
		} else if (btn == search) {
			if (count == 0) {
				messageBox("Enter a person first.");
				return;
			}
				
			print();
			Search s = new Search(frm, per, count, ammt);
			s.setVisible(true);
		} else if (btn == printAll) {
			if (count == 0) {
				messageBox("Enter a person first.");
				return;
			}
			
			printAlpha(sortAlpha(per, count));
		}
	}
	
	
	public void printAlpha(Person arr[]) {
		String result = "SORTED ALPHABETICALLY - NAME/AGE" + '\n' + '\n';
		
		for (int i=0; i<arr.length; i++) {
			result += (i+1) + ") " + arr[i].getName() + " - " + arr[i].getAge() + '\n';
		}
		
		messageBox(result);
	}
	
	
	public Person[] sortAlpha(Person arr[], int cnt) {
		int n = cnt;
		
		// One by one move boundary of unsorted subarray
	    for (int i = 0; i < n-1; i++) {
	    	// Find the minimum element in unsorted array
	        int min_idx = i;
	        for (int j = i+1; j < n; j++){
	        	if (arr[j].getName().compareTo(arr[min_idx].getName()) < 0)
	        		min_idx = j;
	        }
	        // Swap the found minimum element with the first element
	        Person temp = arr[min_idx];
	        arr[min_idx] = arr[i];
	        arr[i] = temp;
	    }
	    
	    return arr;
	}
	
	public String valid() {
		
		String go = "";
		
		if (nameField.getText().isBlank() || ageField.getText().isBlank()) {
			go = "Fill all fields";
		} else if (nameExists(nameField.getText())) {
			go = "Name already exists.";
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

	public void add(Person p) {
		Person[] newArr = new Person[count + 1];
		for (int i=0; i<count; i++) {
			newArr[i] = per[i];
		}
		newArr[count] = p;
		per = new Person[count + 1];
		per = newArr;
		count++;
		ammt.setText("People: " + count);
		nameField.setText("");
		ageField.setNumber(0);
		nameField.grabFocus();
	}
	
	public void print() {
		for (int i=0; i<count; i++) {
			System.out.println(i+") " + per[i].getName());
		}
	}

	public boolean nameExists(String n) {
		boolean go = false;
		
		for(int i=0; i<count; i++) {
			if (n.equals(per[i].getName())) {
				go = true;
				return go;
			}
		}
		
		return go;
	}
	
	
	public static void main(String[] args) {
		frm = new Main();
        frm.setTitle ("Krish's Search");
        frm.setSize (400, 250);
        frm.setVisible(true);
	}

}
