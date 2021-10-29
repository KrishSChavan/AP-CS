public class Calculations {
	
	int[][] sequence = new int[25][25];
	
	public void calculate(int[] numbers, int count) {
		
		int pos = 0;
		
		for (int i = pos; i<count; i++) {
			if (i < 24) {
				if (numbers[i] < numbers[i+1]) {
					System.out.println(numbers[i]);
				} else {
//					System.out.println(numbers[i]);
					System.out.println("nope! " + numbers[i+1] + " is not greater than " + numbers[i]);
				}
			} else {
				if (numbers[i-1] < numbers[i]) {
					System.out.println(numbers[i]);
				} else {
//					System.out.println(numbers[i-1]);
					System.out.println("nope! " + numbers[i] + " is not greater than " + numbers[i-1]);
				}
			}
			
		}
		
	}
	
	
}
