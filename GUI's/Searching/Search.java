import java.awt.Color;

import javax.swing.*;
import BreezySwing.*;

public class Search extends GBDialog {

	JTextField nameFld = addTextField("[Name Here]", 1,1,3,3);
	JButton ss = addButton("Sequential Search", 2,1,1,1);
	JButton printAll = addButton("Print All", 2,2,1,1);
	JButton bs = addButton("Binary Search", 2,3,1,1);
	
	JLabel blank = addLabel ("", 3,2,1,1);
	
	GBPanel missingContainer = addPanel(  4,2,1,1);
	
	JLabel empty = missingContainer.addLabel("", 1,1,1,1);
	JButton notFound = missingContainer.addButton("No Person Found.", 1,2,1,1);
	JLabel empty2 = missingContainer.addLabel("", 1,3,1,1);
	
	GBPanel foundContainer = addPanel(  4,2,1,1);
	
	JButton who = foundContainer.addButton("", 1,2,1,1);
	JButton nameLbl = foundContainer.addButton("Edit Name:", 2,1,1,1);
	JButton ageLbl = foundContainer.addButton("Edit Age:", 2,3,1,1);
	JTextField nameField = foundContainer.addTextField ("", 3,1,1,1);
	IntegerField ageField = foundContainer.addIntegerField (0, 3,3,1,1);
	JButton save = foundContainer.addButton ("SAVE CHANGES", 3,2,1,1);
	JButton delete = foundContainer.addButton ("DELETE", 4,2,1,1);
	
	
	JButton done = addButton ("DONE", 10,2,1,1);
	
	
	
	JFrame frm;
	Person[] per;
	static int cnt;
	Person p;
	
	@SuppressWarnings("static-access")
	public Search(JFrame parent, Person[] people, int cnt){
		// The next few lines are part of every dialog
        super (parent);                                 // ** REQUIRED **
        setTitle ("Search");
        setDlgCloseIndicator ("Cancel");
        setSize (900, 650);
        
        this.per = people;
        this.frm = parent;
        this.cnt = cnt;
        
        this.foundContainer.setVisible(false);
        this.missingContainer.setVisible(false);
        
        styles();
	}
	
	
	public void buttonClicked(JButton btn) {
		
		
		if (btn == ss) {
			afterSearch(sequentialSearch(per, nameFld.getText()));
		} else if (btn == bs) {
			afterSearch(binarySearch(per, nameFld.getText()));
		} else if (btn == done) {
			dispose();
		} else if (btn == delete) {
			delete(p);
		} else if (btn == printAll) {
			printAlpha(sortAlpha(per, cnt));
		} else if (btn == save) {
			
			for (int i=0; i<per.length; i++) {
				if (per[i].getName().equals(nameField.getText()) && per[i] != p) {
					messageBox("Name already exists.");
					return;
				}
			}
			
			p.setAge(ageField.getNumber());
			p.setName(nameField.getText());
			dispose();
		}
		

	}
	
	public void afterSearch(int index) {
		if (index > -1) {
			foundContainer.setVisible(true);
	        missingContainer.setVisible(false);
	        p = per[index];
	        who.setText("Editing " + p.getName());
	        nameField.setText(p.getName());
	        ageField.setNumber(p.getAge());
		} else {
			foundContainer.setVisible(false);
	        missingContainer.setVisible(true);
		}
	}
	
	public static int binarySearch(Person[] arr, String target)
    {
		arr = sortAlpha(arr, cnt);
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = target.compareTo(arr[m].getName());
 
            // Check if target name is present at mid
            if (res == 0)
                return m;
 
            // If target name greater, ignore left half
            if (res > 0)
                l = m + 1;
 
            // If target name is smaller, ignore right half
            else
                r = m - 1;
        }
 
        return -1;
    }
	
	public static int sequentialSearch(Person[] arr, String target) {
		for (int j = 0; j < arr.length; j++) {
	       if (arr[j].getName().equals(target)) {
	         return j;
	       }
	    }
		return -1;
	}
	
	
	public void printAlpha(Person arr[]) {
		String result = "SORTED ALPHABETICALLY - NAME/AGE" + '\n' + '\n';
		
		for (int i=0; i<arr.length; i++) {
			result += (i+1) + ") " + arr[i].getName() + " - " + arr[i].getAge() + '\n';
		}
		
		messageBox(result);
	}
	
	
	public static Person[] sortAlpha(Person arr[], int cnt) {
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
	
	
	public void delete(Person p) {	
		int index = 0;
		for (int i=0; i<per.length; i++) {
			if (per[i].equals(p)) {
				index = i;
				break;
			}
		}
		cnt--;
		per[index] = per[per.length-1];
        Person[] newArr = new Person[cnt];
        for (int i=0; i<cnt; i++) {
            newArr[i] = per[i];
        }
        per = newArr;
        Main.per = per;
        Main.count = cnt;
        dispose();
	}
	
	public void styles() {
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
		
		notFound.setBackground(Color.GRAY);
		notFound.setForeground(Color.WHITE);
		notFound.setBorderPainted(false);
	}
	
}
