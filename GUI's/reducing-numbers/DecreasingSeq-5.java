import javax.swing.*;
import BreezySwing.*;

public class DecreasingSeq extends GBFrame {

	static JFrame frm;
	
	int [] numbers = new int [25];
	
	JLabel blank = addLabel("", 1, 1, 1, 1);
	
	JLabel numLabel = addLabel("Number 1 of 25: ", 2, 1, 1, 1);
    IntegerField numField = addIntegerField (0, 2,2,1,1);

    JLabel blank2 = addLabel("", 3, 1, 1, 1);

    JButton enterBtn = addButton ("Finished", 4,1,1,1);
    JButton addNumber = addButton ("Add Another Number", 4,2,1,1);

    JLabel blank3 = addLabel("", 5, 1, 1, 1);
    
    JLabel errLabel = addLabel("", 6, 2, 1, 1);
    
    JButton resetArr;
    
    int numCount = 0;
    
    public void saveNumber(int numb) {
    	
    	 if (resetArr == null) {
    		 resetArr = addButton("Reset", 4,3,1,1);
    	 } else {
    		 resetArr.setVisible(true);
    	 }
    	
    	if (numCount == 23) {
    		addNumber.setVisible(false);
    	}
    	
    	numbers[numCount] = numb;
    	numCount++;
    	
    	numField.setNumber(0);
    	numLabel.setText("Number " + (numCount + 1) + " out of 25: ");
    }
    
    
    
    public void buttonClicked(JButton buttonObj){

    	
    	if (buttonObj == resetArr) {
        	for (int i = 0; i<numbers.length; i++) {
        		numbers[i] = 0;
        	}
        	numCount = 0;
        	numLabel.setText("Number 1 of 25: ");
        	resetArr.setVisible(false);
        	errLabel.setText("");
        	numField.setNumber(0);
        	addNumber.setVisible(true);
        } else {
        	if (numField.getNumber() == numField.getNumber()) {
            	
            	numField.grabFocus();
            	
            	if (buttonObj == enterBtn) {
            		
            		Calculations calculations = new Calculations();
            		
//            		numLabel.setVisible(false);
//            	    numField.setVisible(false);
//            	    blank2.setVisible(false);
//            	    enterBtn.setVisible(false);
//            	    addNumber.setVisible(false);
//            	    blank3.setVisible(false);
//            	    errLabel.setVisible(false);

            		
            		if (numbers != null) {
            			saveNumber(numField.getNumber());
            			calculations.calculate(numbers, numCount);
            			for (int i=0; i<numbers.length; i++) {
//            				System.out.println(i + " " + numbers[i]);
                		}
            		} else {
            			System.out.println("Array is empty");
            		}
            		
                } else if (buttonObj == addNumber) {
                	saveNumber(numField.getNumber());
                }
            	
            } else {
            	errLabel.setText("Please enter a number.");
            }
        }
    	

    }




    public static void main(String[] args) {
        frm = new DecreasingSeq();
        frm.setTitle ("Decreasing Sequence");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
