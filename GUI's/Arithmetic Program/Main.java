import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame{
	
	GBPanel gridPanel = addPanel(1,2,1,1);
	
	JLabel header = addLabel("Enter Equation:", 1,1,1,1);
	
	JTextField textField = addTextField("", 2,1,1,1);
	
	JButton calculateBtn = addButton("Finished", 3,1,1,1);
	
	boolean allGood = true;
	
	public void buttonClicked(JButton Button) {
		//calculate button
		if (Button == calculateBtn) {
            allGood = true;
            String input = textField.getText();
            input = input.trim();
            
            //error check
            if(input.charAt(0) != '=') {
                allGood = false;
                messageBox(input);
            }
            if(allGood == true) {
                for(int i = 0; i < input.length(); i++) {
                    if(Character.isLetter(input.charAt(i)) == true) {
                        allGood = false;
                        messageBox(input);
                        break;
                    }
                }
            }
		//spaces in between numbers
            char operand = ' ';
			int operandPos = 0;
			String checks = "";
			char mark = ' ';
			checks = input.substring(1,input.length());
			checks = checks.trim();
			if(Character.isDigit(checks.charAt(0)) == false) {
				mark = checks.charAt(0);
				checks = checks.substring(1, checks.length());
			}
			for(int i = 0; i < checks.length(); i ++) {
				if(checks.charAt(i) == '-' || checks.charAt(i) == '+' || checks.charAt(i) == '*' || checks.charAt(i) == '/') {
					operand = checks.charAt(i);
					operandPos = i;
					break;
				}
			}
			String first, second;
			first = checks.substring(0, operandPos);
			second = checks.substring(operandPos+1, checks.length());
			first = first.trim();
			second = second.trim();
			//part before operand
			int numberCount = 0;
			if(first.charAt(0) == '-' || first.charAt(0) == '+' || first.charAt(0) == '*' || first.charAt(0) == '/' || first.charAt(0) == ' ') {
				first = first.substring(1, first.length());
				first = first.trim();
			}
			for(int i = 0; i < first.length(); i++){
				if(Character.isDigit(first.charAt(i)) == true) {
					numberCount++;
				}
			}
			if(numberCount < first.length()) {
				messageBox("Error");
				allGood = false;
			}
			//part after operand
			numberCount = 0;
			char mark2 = ' ';
			if(second.charAt(0) == '-') {
				mark2 = second.charAt(0);
			}
			if(second.charAt(0) == '-' || second.charAt(0) == '+' || second.charAt(0) == '*' || second.charAt(0) == '/' || first.charAt(0) == ' ') {
				second = second.substring(1, second.length());
				second = second.trim();
			}
			for(int i = 0; i < second.length(); i++){
				if(Character.isDigit(second.charAt(i)) == true) {
					numberCount++;
				}
			}
			if(numberCount < second.length()) {
				allGood = false;
				messageBox("Error");
			}
			//Signs get added after check
			if(mark2 == ' ') {
				input = mark + first + operand + second;
			}else {
				input = mark + first + operand + mark2 + second;
			}
			input = input.trim();
			
			
			//class
			if(allGood == true) {
				input = input.trim();
				Calculations Calculate = new Calculations();
				Calculate.setEquation(input);
				Calculate.findOperand();
				Calculate.findDigits();
				messageBox(Calculate.calculate());
			}
		}
	}
	
	
	//main
	public static void main(String[] args) {
		JFrame frm = new Main();
		frm.setTitle("Parser Program");
		frm.setSize(300,120);
		frm.setVisible(true);
	}
}
