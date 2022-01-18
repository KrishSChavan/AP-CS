
public class Complex {

	public String add(String leftNumbs[], String rightNumbs[]) {
		
		int leftNum = 0;
		int rightNum = 0;
		String result = "";
		
		for (int i=0; i<leftNumbs.length; i++) {
			leftNum += Integer.parseInt(leftNumbs[i]);
		}
		
		for (int i=0; i<leftNumbs.length; i++) {
			
			rightNumbs[i] = rightNumbs[i].substring(rightNumbs[i].length()-1, rightNumbs[i].length());
			
			rightNum += Integer.parseInt(rightNumbs[i]);
		}
		
		if (rightNum < 0) {
			result = leftNum + " - " + rightNum + "i";
		} else {
			result = leftNum + " + " + rightNum + "i";
		}
		
		
		return result;
		
	}
	
}
