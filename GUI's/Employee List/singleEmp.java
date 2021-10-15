import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.*;
import BreezySwing.*;

public class SingEmp extends GBFrame {
	
	DecimalFormat df = new DecimalFormat("0.00");
	
    JLabel allNames = addLabel("NAMES", 1, 2, 1, 1);
    JLabel allQ1 = addLabel("Q1", 1, 3, 1, 1);
    JLabel allQ2 = addLabel("Q2", 1, 4, 1, 1);
    JLabel allQ3 = addLabel("Q3", 1, 5, 1, 1);
    JLabel allQ4 = addLabel("Q4", 1, 6, 1, 1);
    JLabel totalSales = addLabel("TOTAL SALES", 1, 7, 1, 1);	
    JLabel highestQL = addLabel("HIGHEST QUARTER", 1, 10, 1, 1);
    JLabel lowestQL = addLabel("LOWEST QUARTER", 1, 11, 1, 1);
	
    
    public void showEmp(String empName, double q1Sales, double q2Sales, double q3Sales, double q4Sales, double totalSales, double highestQFinal, double lowestQFinal) {
    	
    	JLabel numL = addLabel ("#" + 1 , 2, 1, 1, 1);
		JLabel nameL = addLabel (empName, 2, 2, 1, 1);
		JLabel q1L = addLabel ("$" + df.format(q1Sales), 2, 3, 1, 1);
		JLabel q2L = addLabel ("$" + df.format(q2Sales), 2, 4, 1, 1);
		JLabel q3L = addLabel ("$" + df.format(q3Sales), 2, 5, 1, 1);
		JLabel q4L = addLabel ("$" + df.format(q4Sales), 2, 6, 1, 1);
		JLabel totalSalesL = addLabel ("$" + df.format(totalSales), 2, 7, 1, 1);
		JLabel highestQSalesL = addLabel ("$" + df.format(highestQFinal), 2, 10, 1, 1);
		JLabel lowestQSalesL = addLabel ("$" + df.format(lowestQFinal), 2, 11, 1, 1);
    	
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
