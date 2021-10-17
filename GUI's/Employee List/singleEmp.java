import javax.swing.*;
import BreezySwing.*;

public class SingEmp extends GBFrame {
	
    JLabel allNames = addLabel("NAMES", 1, 2, 1, 1);
    JLabel allQ1 = addLabel("Q1", 1, 3, 1, 1);
    JLabel allQ2 = addLabel("Q2", 1, 4, 1, 1);
    JLabel allQ3 = addLabel("Q3", 1, 5, 1, 1);
    JLabel allQ4 = addLabel("Q4", 1, 6, 1, 1);
    JLabel totalSales = addLabel("TOTAL SALES", 1, 7, 1, 1);	
    JLabel highestQL = addLabel("HIGHEST QUARTER", 1, 8, 1, 1);
    JLabel lowestQL = addLabel("LOWEST QUARTER", 1, 9, 1, 1);
    
    JLabel numL = addLabel ("EMPLOYEE:", 2, 1, 1, 1);
	JLabel nameL = addLabel ("", 2, 2, 1, 1);
	JLabel q1L = addLabel ("", 2, 3, 1, 1);
	JLabel q2L = addLabel ("", 2, 4, 1, 1);
	JLabel q3L = addLabel ("", 2, 5, 1, 1);
	JLabel q4L = addLabel ("", 2, 6, 1, 1);
	JLabel totalSales2 = addLabel ("", 2, 7, 1, 1);
	JLabel highestQSalesL = addLabel ("", 2, 8, 1, 1);
	JLabel lowestQSalesL = addLabel ("", 2, 9, 1, 1);

    
	SingEmp(List[] employees, int i) {
		
		
		nameL.setText(employees[i].empName);
    	q1L.setText("" + employees[i].q1Sales);
    	q2L.setText("" + employees[i].q2Sales);
    	q3L.setText("" + employees[i].q3Sales);
    	q4L.setText("" + employees[i].q4Sales);
    	totalSales2.setText("" + employees[i].totalSales);
    	highestQSalesL.setText("" + employees[i].highestQFinal);
    	lowestQSalesL.setText("" + employees[i].lowestQFinal);
		
	}
    


}
