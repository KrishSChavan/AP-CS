public class Calculations {
	String recievedText;
	char operand;
	int opLoc;
	int [] nums;
	char mark, mark2;

	public Calculations() {
		recievedText = "";
		nums = new int[2];
		mark = ' ';
		mark2 = ' ';
		}
	
	public void setEquation(String Input) {
		recievedText = Input;
	}
	
	public void findOperand() {
		if(recievedText.charAt(0) == '-') {
			mark = recievedText.charAt(0);
			recievedText = recievedText.substring(1, recievedText.length());
		}
		for(int i = 0; i < recievedText.length(); i++) {
			if(recievedText.charAt(i) == '-' || recievedText.charAt(i) == '+' || recievedText.charAt(i) == '*' || recievedText.charAt(i) == '/') {
				operand = recievedText.charAt(i);
				opLoc = i;
				break;
			}

		}
	}
	
	public String Caculate() {
		String finalOutput = "";
		try {
				//addition
			if(operand == '+') {
				finalOutput = finalOutput + (nums[0] + nums[1]);
				//subtraction
			}else if(operand == '-') {
				finalOutput = finalOutput + (nums[0] - nums[1]);
				//multiplication
			}else if(operand == '*') {
				finalOutput = finalOutput + (nums[0] * nums[1]);
				//Division
			}else if(operand == '/') {
				int numerator = nums[0];
				int denominator = nums[1];
				//GCF
				int GCF = Math.abs(denominator);
				for(int i = GCF; i >= 1; i--){
					if(numerator % i == 0 && denominator % i == 0) {
						GCF = i;
						numerator		= numerator/GCF;
						denominator 	= denominator/GCF;
					}
				}
				//Result
				String mixed 		= "";
				if(denominator < 0 && numerator < 0) {
					denominator 	= Math.abs(denominator);
					numerator 		= Math.abs(numerator); 
				}
				int FrontMixed 		= numerator/denominator;
				int RemainderMixed 	= numerator % denominator;
				if (numerator % denominator == 0) {
					mixed 		= (FrontMixed + "");
				}else if (FrontMixed < 1){
					mixed 		= (RemainderMixed + "/" + denominator);
				}else{
					mixed 		= (FrontMixed + ", " + RemainderMixed + "/" + denominator);
				}
				finalOutput = mixed;
			}
			return finalOutput;
		}
		catch (ArithmeticException e){
			finalOutput = "Invalid Input";
			return finalOutput;
			
		}

	}
	
	public void findDigits() {
		//removing whitespace
		String num1 = "", num2 = "";
		recievedText = recievedText + ' ';
		num1 = recievedText.substring(0, opLoc);
		num2 = recievedText.substring(opLoc+1, recievedText.length());	
		num1 = num1.trim();
		num2 = num2.trim();
		if(num2.charAt(0) == '-') {
			mark2 = '-';
			num2 = num2.substring(1, num2.length());
			num2 = num2.trim();
		}
		recievedText = (num1 + operand +  num2);

		
		//finding digits
		int start = 0, end = 0;
		int s = 0;
		String digit = "";
		recievedText = " " + recievedText + " ";
		for (int i = 1; i < recievedText.length(); i++){
			if(Character.isDigit(recievedText.charAt(i)) && Character.isDigit(recievedText.charAt(i-1)) == false) {
				start = i;
			}
			if(Character.isDigit(recievedText.charAt(i)) == false) {
				end = i;
				if(s == 0) {
					digit = mark + recievedText.substring(start, end);
				}
				if(s == 1) {
					digit = mark2 + recievedText.substring(start, end);
				}
				digit = digit.trim();
				nums[s] = Integer.parseInt(digit);
				s++;
			}
		}
	}
	
}
