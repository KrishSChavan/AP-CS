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
	JButton changeField = foundContainer.addButton ("", 1,2,1,1);
	JButton delete = foundContainer.addButton("DELETE", 2,2,1,1);
	
	
	int nums[];
	int num;
	static int count;
	JButton ammt;
	
	public Search(JFrame parent, int nums[], int count, JButton ammt) {
		super(parent);
		setTitle ("Search");
        setDlgCloseIndicator ("Cancel");
        setSize (200, 200);
        
		this.nums = nums;
		Search.count = count;
		this.ammt = ammt;
		
		delete.setBackground(Color.RED);
	}
	
	
	public void buttonClicked(JButton btn) {
		if (btn == search) {
			afterSearch(binarySearch(nums, 0, count-1, field.getNumber()));
		} else if (btn == delete) {
			delete(num);
		}
	}
	
	
	public void afterSearch(int n) {
		if (n > -1) {
	        foundContainer.setVisible(true);
	        missingContainer.setVisible(false);
	        changeField.setText(nums[n] + "");
		} else {
			foundContainer.setVisible(false);
	        missingContainer.setVisible(true);
		}
	}
	
	
	public int binarySearch(int [] arr, int low, int high, int num) {
//		int[] sortedArr = mergeSort(arr, 2); 
		
        int mid;
         if(low > high) {
             return -1;
         }else {
             mid = (low + high)/2;
             if(arr[mid] < num) {
                 return binarySearch(arr, mid+1, high, num);
             }
             if(arr[mid] > num) {
                 return binarySearch(arr, low, mid-1, num);
             }
         }
        return mid;
    }
	
	
	 public static int[] merge(int[] a, int[] l, int[] r, int left, int right) {
		 int i = 0, j = 0, k = 0;
		 while (i < left && j < right) {
			 if (l[i] <= r[j]) {
				 a[k++] = l[i++];
			 } else {
				 a[k++] = r[j++];
			 }
		 }
		 while (i < left) {
			 a[k++] = l[i++];
		 }
		 while (j < right) {
			 a[k++] = r[j++];
		 }
		 
		 return a;
	}

	 public static int[] mergeSort(int[] a, int n) {
		 if (n < 2) {
			 return a;
		 }
		 int mid = n / 2;
		 int[] l = new int[mid];
		 int[] r = new int[n - mid];

		 for (int i = 0; i < mid; i++) {
			 l[i] = a[i];
		 }
		 for (int i = mid; i < n; i++) {
			 r[i - mid] = a[i];
		 }
		 mergeSort(l, mid);
		 mergeSort(r, n - mid);

		 return merge(a, l, r, mid, n - mid);
	}

	
	public void delete(int n) {	
		
		if (!foundContainer.isVisible()) return;
		
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
