import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame {

	static JFrame frm;
	
	JLabel ammt = addLabel("0 numbers entered", 1,2,1,1);
	IntegerField num = addIntegerField (0, 2,2,1,1);
	JButton add = addButton ("ADD", 3,2,1,1);
	JButton reset = addButton ("Reset", 3,1,1,1);
	JButton print = addButton ("Print", 3,3,1,1);
	JButton mean = addButton ("Mean", 4,1,1,1);
	JButton median = addButton ("Median", 4,2,1,1);
	JButton mode = addButton ("Mode", 4,3,1,1);
	
	int count = 0;
	int nums[] = new int[25];
	boolean thereIsSpace = true;
	
	
	public Main() {
		add.setBackground(Color.pink);
		add.setForeground(Color.white);
	}
	
	public void buttonClicked(JButton btn) {
		if (btn == add) {
			enter(num.getNumber());
			num.setText("");
			if (count == 25) {
				add.setVisible(false);
				num.setVisible(false);
			}
		} else if (btn == mean) {
			messageBox("The mean" + getAllNums() + " | is, " + mean());
		} else if (btn == median) {
			
		} else if (btn == mode) {
			
			String modeNums = "[ ";
			
			if (mode() != null ) {
				
				ArrayList<Integer> maxVals = mode();
				
				for (int i=0; i<maxVals.size(); i++) {
					modeNums += maxVals.get(i) + ", ";
				}
				String newModeNums = modeNums.substring(0, modeNums.length()-2) + " ]";
				
				messageBox("The mode" + getAllNums() + " | is, " + newModeNums);
			} else {
				messageBox("There is no mode" + getAllNums());
			}
		
		} else if (btn == reset) {
			count = 0;
			ammt.setText("0 numbers entered");
		} else if (btn == print) {
			
			int toSort[] = new int[count];
			
			for (int i=0; i<count; i++) {
				toSort[i] = nums[i];
			}
			
			Arrays.sort(toSort);
			
			messageBox(Arrays.toString(toSort));
		}
	}
	
	
	public String getAllNums() {
		
		String allNums = " for the numbers: ";
		
		for (int j=0; j<count; j++) {
			allNums += nums[j] + ", ";
		}
		
		return allNums.substring(0, allNums.length()-2);
	}
	
	public void enter(int num) {
		
		nums[count] = num;
		count++;
		ammt.setText((count) + " numbers entered");
		
		
	}
	
	public double mean() {
		
		double added = 0;
		
		for (int i=0; i<count; i++) {
			added += nums[i];
		}
		
		double sol = added / count;
		
		return sol;
	}
	
	public void median() {
		
	}
	
	public ArrayList<Integer> mode() {
		int maxCount = 0;

		ArrayList<Integer> maxVals = new ArrayList<Integer>();
		
		for (int i = 0; i < count; ++i) {
			int newCount = 0;
	        for (int j = 0; j < count; ++j) {
	        	if (nums[j] == nums[i])
	        		newCount++;
	        }

	        if (newCount >= maxCount) {
	        	maxCount = newCount;
	        	if (!maxVals.contains(nums[i])) {
	        		maxVals.add(nums[i]);
	        	}
	        }
	      
	    }
		
		if (maxCount == 1) {
        	return null;
        }
	    return maxVals;
	}
	
	public static void main(String[] args) {
		frm = new Main();
        frm.setTitle ("Krish's Calculator");
        frm.setSize (400, 250);
        frm.setVisible (true);
	}

}
