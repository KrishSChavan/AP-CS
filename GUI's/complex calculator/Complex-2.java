package inheritance;

public class Complex {

	public String add(int leftNumb, int rightNumb, int leftNumb2, int rightNumb2) {
		
		int leftNum = 0;
		int rightNum = 0;
		String result = "";
		
		leftNum = Integer.parseInt(leftNumb) + Integer.parseInt(leftNumb2);
		
		String newRightNumb = rightNumb.substring(1, rightNumb.length()-1);
		String newRightNumb2 = rightNumb2.substring(1, rightNumb2.length()-1);
		
		rightNum = Integer.parseInt(newRightNumb) + Integer.parseInt(newRightNumb2);
		
//		if (rightNum < 0) {
//			result = leftNum + " - " + rightNum + "i";
//		} else {
//			result = leftNum + " + " + rightNum + "i";
//		}
		
		
		System.out.println("FINAL RESULT: " + result);
		
		return result;
		
	}
	
	
	
public String subtract(String leftNumb, String rightNumb, String leftNumb2, String rightNumb2) {
		
		int leftNum = 0;
		int rightNum = 0;
		String result = "";
		
		leftNum = Integer.parseInt(leftNumb) - Integer.parseInt(leftNumb2);
		
		String newRightNumb = rightNumb.substring(1, rightNumb.length()-1);
		String newRightNumb2 = rightNumb2.substring(1, rightNumb2.length()-1);
		
		rightNum = Integer.parseInt(newRightNumb) - Integer.parseInt(newRightNumb2);
		
//		if (rightNum < 0) {
//			result = leftNum + " - " + rightNum + "i";
//		} else {
//			result = leftNum + " + " + rightNum + "i";
//		}
		
		
		System.out.println("FINAL RESULT: " + result);
		
		return result;
		
	}
	
}
