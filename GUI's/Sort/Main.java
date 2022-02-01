package sorting;
import java.awt.Color;
import java.util.ArrayList;
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
			num.requestFocus();
			
			String numStr = num.getText();
			boolean goodToGo = true;
			
			for (int i=0; i<numStr.length(); i++) {
				if (Character.isLetter(numStr.charAt(i))) {
					goodToGo = false;
					break;
				}
			}
			if (goodToGo) {
				enter(num.getNumber());
				num.setText("");
				if (count == 25) {
					add.setVisible(false);
					num.setVisible(false);
				}
			} else {
				messageBox("Please enter a number.");
			}
			
		} else if (btn == mean) {
			messageBox("The mean" + getAllNums() + " | is, " + mean());
		} else if (btn == median) {
			messageBox("The median " + getAllNums() + " | is, " + median());
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
			
			int sorted[] = SetOrder(count, nums);
			String result = "Sorted: " + '\n';
			
			for (int i=0; i<sorted.length; i++) {
				result += sorted[i] + ", ";
			}
			
			messageBox(result.substring(0, result.length()-2) + '\n' + '\n' + "Standard Deviation:" + '\n' + SD());
		}
	}
	
	public double SD() {
		
		double sd = 0.0;
		
		for (int i=0; i<count; i++) {
            sd += Math.pow(nums[i] - mean(), 2);
        }

        return Math.sqrt(sd/count);
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
	
	public double median() {
		 double result = 1.0;
         if(count%2 == 1) {
             result = nums[count/2];
         }else {
             double Mid2 = count/2 + 0.5;
             double Mid1 = count/2 - 0.5;
             result = (nums[(int) Mid1] + nums[(int) Mid2])/2.0;
         }
         return result;
	}
	
	public int[] SetOrder(int counter, int unsorted []) {
	
		int [] Sorted;
		int [] Unsorted;
		
		Sorted = new int [counter];
	    Unsorted = unsorted;
	    for(int i = 0; i<counter; i++) {
	    	int low = Unsorted[i];
	        for(int x = i+1; x < counter; x++) {
	        	int compare = Unsorted[x];
	            if(low > compare) {
	            	low = compare;
	                int PH = Unsorted[i];
	                Unsorted[i] = low;
	                Unsorted[x] = PH;
	             }
	        }
	        Sorted[i] = low;
	    }
	    return Sorted;
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
