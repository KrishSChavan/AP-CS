public class Calculations {
	
	String[] numsArr;
	String[] finalOutput;
	
	
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
		
		char charArr[] = new char[text.length()];
		String nums[] = new String[text.length()];
		int numCount = 0;
		String num = "";
		
		
		for (int i=0; i<text.length(); i++) {
			charArr[i] = text.charAt(i);
		}
		
		int start = 0;
		int end = 0;
		
		for (int o=0; o<charArr.length; o++) {
			if (num.length() == 0) {
				start = o;
				num += text.charAt(o);
			} else if (Character.isDigit(text.charAt(o))) {
				num += text.charAt(o);
				System.out.println("test num 2: " + num);
			} else {
				end = o;
				num = text.substring(start, end);
				nums[numCount] = num;
				numCount++;
				num = "";
			}
		}
		
		for (int l=0; l<numCount; l++) {
			System.out.println("num: " + nums[l]);
		}
		
	}
	
	
}
