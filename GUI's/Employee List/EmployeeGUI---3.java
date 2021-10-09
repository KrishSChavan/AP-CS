//     https://www.softwaretestinghelp.com/array-of-objects-in-java/


import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.*;
import BreezySwing.*;

public class EmployeeGUI extends GBFrame {

	static JFrame frm;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
    List[] employees = new List[10];

    JLabel nameLabel = addLabel("Name 1 of 10: ", 1, 1, 1, 1);
    JTextField employeeName = addTextField ("", 1,2,1,1);

    JLabel q1Label = addLabel("Quarter 1 Sales: ", 2, 1, 1, 1);
    DoubleField q1Sales = addDoubleField (0.00, 2,2,1,1);

    JLabel q2Label = addLabel("Quarter 2 Sales: ", 3, 1, 1, 1);
    DoubleField q2Sales = addDoubleField (0.00, 3,2,1,1);

    JLabel q3Label = addLabel("Quarter 3 Sales: ", 4, 1, 1, 1);
    DoubleField q3Sales = addDoubleField (0.00, 4,2,1,1);

    JLabel q4Label = addLabel("Quarter 4 Sales: ", 5, 1, 1, 1);
    DoubleField q4Sales = addDoubleField (0.00, 5,2,1,1);

    JLabel blank = addLabel("", 6, 1, 1, 1);

    JButton enterBtn = addButton ("Enter", 7,1,1,1);
    JButton addEmployee = addButton ("Add Employee", 7,2,1,1);

    JLabel blank2 = addLabel("", 8, 1, 1, 1);
    
    JLabel errLabel = addLabel("", 9, 2, 1, 1);

    
    
    
    JLabel allNames;
    JLabel allQ1;
    JLabel allQ2;
    JLabel allQ3;
    JLabel allQ4;
    JLabel totalSales;
    JLabel highestSalesL;
    JLabel LowestSalesL;
    JLabel highestQL;
    JLabel lowestQL;
    
    
    int nameCount = 0;

    public boolean fieldsFilled() {
        boolean filled = true;

        if (employeeName.getText().isBlank()) {
            filled = false;
        }
        return filled;
    }

    
    public void hideElements() {
    	nameLabel.setVisible(false);
    	employeeName.setVisible(false);
    	q1Label.setVisible(false);
    	q2Label.setVisible(false);
    	q3Label.setVisible(false);
    	q4Label.setVisible(false);
    	q1Sales.setVisible(false);
    	q2Sales.setVisible(false);
    	q3Sales.setVisible(false);
    	q4Sales.setVisible(false);
    	blank.setVisible(false);
    	enterBtn.setVisible(false);
    	addEmployee.setVisible(false);
    	errLabel.setVisible(false);
    	
    	allNames = addLabel("NAMES", 1, 2, 1, 1);
    	allQ1 = addLabel("Q1", 1, 3, 1, 1);
    	allQ2 = addLabel("Q2", 1, 4, 1, 1);
    	allQ3 = addLabel("Q3", 1, 5, 1, 1);
    	allQ4 = addLabel("Q4", 1, 6, 1, 1);
    	totalSales = addLabel("TOTAL SALES", 1, 7, 1, 1);
    	
    	if (nameCount > 1) {
    		highestSalesL = addLabel("HIGHEST SALES", 1, 8, 1, 1);
        	LowestSalesL = addLabel("LOWEST SALES", 1, 9, 1, 1);
    	}
    	
    	
    	highestQL = addLabel("HIGHEST QUARTER", 1, 10, 1, 1);
    	lowestQL = addLabel("LOWEST QUARTER", 1, 11, 1, 1);
    	
    	
    	frm.setSize(1920, 1080);
    }
    
    
    public void saveName(String name) {
    	
    	if (nameCount == 8) {
    		addEmployee.setVisible(false);
    	}
    	
    	
    	
    	
    	employees[nameCount] = new List(employeeName.getText(), q1Sales.getNumber(), q2Sales.getNumber(), q3Sales.getNumber(), q4Sales.getNumber(), 0.0, 0.0, 0.0);
    	nameCount++;
    	
    	
    	
    	employeeName.setText("");
    	q1Sales.setNumber(0.0);
    	q2Sales.setNumber(0.0);
    	q3Sales.setNumber(0.0);
    	q4Sales.setNumber(0.0);
    }
    
    
    public void buttonClicked(JButton buttonObj){

        if (fieldsFilled()) {
        	errLabel.setText("");
        	nameLabel.setText("Name " + (nameCount + 2) + " of 10:");
        	
            if (buttonObj == enterBtn) {
                
            	saveName(employeeName.getText());
            	
            	df.setRoundingMode(RoundingMode.UP);
            	
            	Checks checks = new Checks();
            	checks.setSales(employees, nameCount);
            	
            	for (int i=0; i < nameCount; i++) {
            		
//            		System.out.println();
//                    System.out.println("EMPLOYEE #" + (i+1) + "   name: " + employees[i].empName + " q1: " + employees[i].q1Sales + " q2: " + employees[i].q2Sales + " q3: " + employees[i].q3Sales + " q4: " + employees[i].q4Sales);
                    
//                    JLabel aLabel = addLabel((i+1) + "   " + employees[i].empName + "     " + employees[i].q1Sales + "     " + employees[i].q2Sales + "     " + employees[i].q3Sales + "     " + employees[i].q4Sales, i+2, 1, 1, 1);
                    
            		JLabel numL = addLabel ("#" + (i+1), i+2, 1, 1, 1);
            		JLabel nameL = addLabel (employees[i].empName, i+2, 2, 1, 1);
            		JLabel q1L = addLabel ("$" + df.format(employees[i].q1Sales), i+2, 3, 1, 1);
            		JLabel q2L = addLabel ("$" + df.format(employees[i].q2Sales), i+2, 4, 1, 1);
            		JLabel q3L = addLabel ("$" + df.format(employees[i].q3Sales), i+2, 5, 1, 1);
            		JLabel q4L = addLabel ("$" + df.format(employees[i].q4Sales), i+2, 6, 1, 1);
            		JLabel totalSales = addLabel ("$" + df.format(employees[i].totalSales), i+2, 7, 1, 1);
            		if (nameCount > 1 && employees[i].totalSales == checks.getHighest()) {
            			JLabel highestSales = addLabel ("        *", i+2, 8, 1, 1);
            		} else {
            			JLabel highestSales = addLabel ("", i+2, 8, 1, 1);
            		}
            		
            		if (nameCount > 1 && employees[i].totalSales == checks.getLowest()) {
            			JLabel lowestSales = addLabel ("       *", i+2, 9, 1, 1);
            		} else {
            			JLabel lowestSales = addLabel ("", i+2, 9, 1, 1);
            		}
            		JLabel highestQSalesL = addLabel ("$" + df.format(employees[i].highestQFinal), i+2, 10, 1, 1);
            		JLabel lowestQSalesL = addLabel ("$" + df.format(employees[i].lowestQFinal), i+2, 11, 1, 1);
            		
            		
            		
          
            		
                }
            	
            	
            	hideElements();
            	
            } else if (buttonObj == addEmployee) {

            	saveName(employeeName.getText());
            	System.out.println("Added employee #" + nameCount + "!");

            }
        } else {
            errLabel.setText("Make sure to fill all the fields");
        }

    }




    public static void main(String[] args) {
        frm = new EmployeeGUI();
        frm.setTitle ("Employee Sales");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
