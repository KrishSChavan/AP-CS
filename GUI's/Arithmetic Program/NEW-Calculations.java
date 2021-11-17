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
	
	
	public void getNumbers(String text) {
		
		text = text.substring(1);
		
		System.out.println("substrung: " + text);
		
		String num = "";
		int start = 0;
		int end = 0;
		
		for (int i=0; i<text.length(); i++) {
			if (num.length() == 0) {
				start = i;
				num = text.substring(start);
			} else if (!Character.isDigit(text.charAt(i))) {
				end = i;
			} else if (Character.isDigit(text.charAt(i-1))) {
				num = text.substring(start, end-1);
				System.out.println("NUM FOUND: " + num);
				num = "";
			}
		}
		
	}
	
	
	
	
//	if (Character.isDigit(text.charAt(i)) && start == 0) {
//		start = i;
//	} else {
//		end = i;
//		num = text.substring(start, end);
//		System.out.println("NUM FOUND: " + num);
//		break;
//	}
	
	
}
