public class Calculations {

	public char findOperand(String text) {
		
		char returnChar = ' ';
		
		for (int i=0; i<text.length(); i++) {
			if (text.charAt(i) == '+' || 
				text.charAt(i) == '-' ||
				text.charAt(i) == '*' ||
				text.charAt(i) == '/') {
				returnChar = text.charAt(i);
				System.out.println("TEST CHAR: " + returnChar);
			}
		}
		
		return returnChar;
		
	}
	
}
