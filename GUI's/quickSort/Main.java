package sorting;

import java.awt.Color;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	static JFrame frm;
	
	JButton ammt = addButton("Numbers: 0", 1,2,1,1);
	IntegerField field = addIntegerField (0, 2,2,1,1);
	JButton add = addButton ("ADD", 3,1,1,1);
	JButton printAll = addButton("Print All", 3,3,1,1);
	
	int count = 0;
	int nums[];
	
	
	public Main() {		
		add.setBackground(Color.pink);
		add.setForeground(Color.white);
		
		ammt.setBackground(Color.GRAY);
		ammt.setForeground(Color.WHITE);
		ammt.setBorderPainted(false);
		
		field.grabFocus();
		
		ammt.setText("Numbers: " + count);
	}
	
	
	
	
	
	public void buttonClicked(JButton btn) {
		if (btn == add) {
			if (valid() == "") {
				add(field.getNumber());
			} else {
				messageBox(valid());
			}
		} else if (btn == printAll) {
			if (nums == null) {
				messageBox("Enter a number.");
				return;
			}
			print(nums);
		}
	}
	
	
	public void print(int arr[]) {
		String result = "SORTED | UNSORTED" + '\n' + '\n';
		
		int[] sorted = new int[count];
		for (int i=0; i<count; i++) {
			sorted[i] = arr[i];
		}
				
		QuickSort ob = new QuickSort();
        ob.recursiveQuickSort(sorted, 0, count-1);
		
        sorted = flipArr(sorted);
        
		for (int i=0; i<nums.length; i++) {
			result += (i+1) + ") " + sorted[i] + " | " + arr[i] + '\n';
		}
		
		messageBox(result, 300, (count*15)+150);
	}

	
	public int[] flipArr(int arr[]) {
		int[] newArr = new int[count];
        int j = count;
        for (int i=0; i<count; i++) {
            newArr[j - 1] = arr[i];
            j--;
        }
        
        return newArr;
	}
	


	public String valid() {
		
		if (count == 9) {
			add.setVisible(false);
		} else if (count < 9) {
			add.setVisible(true);
		}
		
		if (field.getText().isBlank()) {
			return "Enter a number.";
		} else {
			String txt = field.getText();
			for (int i=0; i<txt.length(); i++) {
				if (!Character.isDigit(txt.charAt(i))) {
					return "Only numbers allowed in this field.";
				}
			}
		}
		return "";
	}
	
	public void add(int num) {
		int[] newArr = new int[count + 1];
		for (int i=0; i<count; i++) {
			newArr[i] = nums[i];
		}
		newArr[count] = num;
		nums = new int[count + 1];
		nums = newArr;
		count++;
		ammt.setText("Numbers: " + count);
		field.setNumber(0);
		field.grabFocus();
	}
	
	
	
	public static void main(String[] args) {
		frm = new Main();
        frm.setTitle ("Krish's Search");
        frm.setSize (300, 200);
        frm.setVisible(true);
	}

}
