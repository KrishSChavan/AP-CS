package sorting;

import java.awt.Color;

import javax.swing.*;
import BreezySwing.*;

public class Search extends GBDialog {

	
	IntegerField field = addIntegerField (0, 1,2,1,1);
	JButton search = addButton ("Search", 2,2,1,1);
	
	GBPanel missingContainer = addPanel(  3,2,1,1);
	JButton notFound = missingContainer.addButton("No Number Found.", 1,2,1,1);
	
	GBPanel foundContainer = addPanel(  3,2,1,1);
	JLabel changeField = foundContainer.addLabel ("", 1,2,1,1);
	JButton delete = foundContainer.addButton("DELETE", 2,2,1,1);
	
	
	int nums[];
	int num;
	static int count;
	JButton ammt;
	
	public Search(JFrame parent, int nums[], int count, JButton ammt) {
		super(parent);
		setTitle ("Search");
        setDlgCloseIndicator ("Cancel");
        setSize (900, 650);
        
		this.nums = nums;
		Search.count = count;
		this.ammt = ammt;
		
		delete.setBackground(Color.RED);
	}
	
	
	public void buttonClicked(JButton btn) {
		if (btn == search) {
			afterSearch(binarySearch(nums, field.getNumber(), nums[0], nums[nums.length-1]));
		} else if (btn == delete) {
			delete(num);
		}
	}
	
	
	public void afterSearch(int n) {
		if ()
	}
	
	
	public int binarySearch(int[] arr, int key, int low, int high) {
		
		int[] sortedArray = sort(arr);
		int index = Integer.MAX_VALUE;
			    
		while (low <= high) {
			int mid = low  + ((high - low) / 2);
			if (sortedArray[mid] < key) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				index = mid;
			    break;
			}
		}
		return index;
	}
	
	
	public int[] sort(int nums[]) {
		return nums;
	}
	
	public void delete(int n) {	
		int index = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] == n) {
				index = i;
				break;
			}
		}
		count--;
		nums[index] = nums[nums.length-1];
        int[] newArr = new int[count];
        for (int i=0; i<count; i++) {
            newArr[i] = nums[i];
        }
        nums = newArr;
        Main.nums = nums;
        Main.count = count;
        ammt.setText("Numbers: " + count);
        dispose();
	}
	
	
}
