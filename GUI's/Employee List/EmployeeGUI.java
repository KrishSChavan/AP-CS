import javax.swing.*;
import BreezySwing.*;

public class EmployeeGUI extends GBFrame {

    String[] employeeNames = new String[10];
    Double[] employeeSales = new Double[40];

    JLabel nameLabel = addLabel("Name: ", 1, 1, 1, 1);
    JTextField employeeName = addTextField ("", 1,2,1,1);

    JLabel q1Label = addLabel("Quarter 1 Sales: ", 2, 1, 1, 1);
    DoubleField q1Sales = addDoubleField (0, 2,2,1,1);

    JLabel q2Label = addLabel("Quarter 2 Sales: ", 3, 1, 1, 1);
    DoubleField q2Sales = addDoubleField (0, 3,2,1,1);

    JLabel q3Label = addLabel("Quarter 3 Sales: ", 4, 1, 1, 1);
    DoubleField q3Sales = addDoubleField (0, 4,2,1,1);

    JLabel q4Label = addLabel("Quarter 4 Sales: ", 5, 1, 1, 1);
    DoubleField q4Sales = addDoubleField (0, 5,2,1,1);

    JLabel blank = addLabel("", 6, 1, 1, 1);

    JButton enterBtn = addButton ("Enter", 7,1,1,1);
    JButton addEmployee = addButton ("Add Employee", 7,2,1,1);

    JLabel blank2 = addLabel("", 8, 1, 1, 1);
    
    JLabel countLabel = addLabel("", 9, 2, 1, 1);
    
    JLabel blank3 = addLabel("", 10, 1, 1, 1);
    
    JLabel errLabel = addLabel("", 11, 2, 1, 1);

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
    }
    
    
    public void saveName(String name) {
    	
    	employeeName.setText("");
    	q1Sales.setNumber(0.0);
    	q2Sales.setNumber(0.0);
    	q3Sales.setNumber(0.0);
    	q4Sales.setNumber(0.0);
    	
    	if (nameCount == 8) {
    		addEmployee.setVisible(false);
    	}
    	
    	employeeNames[nameCount] = employeeName.getText();
    	nameCount++;
    }
    
    
    public void buttonClicked(JButton buttonObj){

        if (fieldsFilled()) {
        	errLabel.setText("");
        	countLabel.setText((nameCount + 1) + " employees added, " + (10 - (nameCount + 1)) + " enteries left");
            if (buttonObj == enterBtn) {
                
            	saveName(employeeName.getText());
            	
            	for (int i=0; i < employeeNames.length; i++) {
                    System.out.println('\n' + employeeNames[i] + " #" + (i+1));
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
        JFrame frm = new EmployeeGUI();
        frm.setTitle ("Employee Sales");
        frm.setSize (400, 250);
        frm.setVisible (true);
    }

}
