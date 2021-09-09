import javax.swing.*;
import BreezySwing.*;

public class clientWindow extends GBFrame {

	JLabel frac1RatorLabel = addLabel ("Fraction 1 Numerator", 1,1,1,1);
	JLabel frac1NatorLabel = addLabel ("Fraction 1 Denomenator", 2,1,1,1);
	IntegerField frac1Rator = addIntegerField (1, 1,2,1,1);
	IntegerField frac1Nator = addIntegerField (1, 2,2,1,1);
	
	JLabel frac2RatorLabel = addLabel ("Fraction 2 Numerator", 1,1,1,1);
	JLabel frac2NatorLabel = addLabel ("Fraction 2 Denomenator", 2,1,1,1);
	IntegerField frac2Rator = addIntegerField (1, 1,2,1,1);
	IntegerField frac2Nator = addIntegerField (1, 2,2,1,1);
	
	
	public static void main(String[] args) {
		
		JFrame frm = new clientWindow();
        frm.setTitle ("Fraction Calculator");
        frm.setSize (1000, 300);
        frm.setVisible (true);

	}

}
