import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame{

	JLabel Numerator1 				= addLabel ("Numerator 1:", 	1,1,1,1);
	IntegerField numerator1Field	= addIntegerField (1,           1,2,1,1);
	JLabel Denominator1 			= addLabel ("Denominator 1:", 	2,1,1,1);
	IntegerField denominator1Field	= addIntegerField (1,           2,2,1,1);
	
	JLabel Numerator2 				= addLabel ("Numerator 2:", 	3,1,1,1);
	IntegerField numerator2Field	= addIntegerField (1,           3,2,1,1);
	JLabel Denominator2 			= addLabel ("Denominator 2:", 	4,1,1,1);
	IntegerField denominator2Field	= addIntegerField (1,           4,2,1,1);
	
	JButton calculateButton         = addButton ("Multiply",        5,2,1,1);
	
	JTextField answerfield	= addTextField ("Enter 2 fractions above",    6,2,1,1);
	JLabel answerlabel 		= addLabel ("Answer:", 						  6,1,1,1);

	MyClass myClass = new MyClass();
	
	public void buttonClicked(JButton buttonObj){
    	
        if (buttonObj == calculateButton){
        	myClass.setDenominators(denominator1Field.getNumber(), denominator2Field.getNumber());
        	myClass.setNumerators(numerator1Field.getNumber(), numerator2Field.getNumber());
        	
        	answerfield.setText("GCF: " + myClass.GCF(numerator1Field.getNumber(), denominator2Field.getNumber()));
        	
        	System.out.println(myClass.GCF(numerator1Field.getNumber(), denominator2Field.getNumber()));
        }
        else {
        
        }           
    }
	
	
	public static void main(String[] args) {
		JFrame frm = new Main();
		frm.setTitle ("Fraction Calculator");
		frm.setSize (500, 200);
		frm.setVisible (true);
	}
}
