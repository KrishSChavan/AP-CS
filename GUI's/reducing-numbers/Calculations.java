public class Calculations {
	
	int[] sequence = new int[25];
	
	public void calculate(int[] numbers) {
		
		int pos = 0;
		
		for (int i = pos; i<numbers.length; i++) {
			if (i < 24) {
				if (numbers[i] > numbers[i+1]) {
					System.out.println(numbers[i]);
				} else {
					System.out.println("NEW LINE");
				}
			} else {
				if (numbers[24] > numbers[25]) {
					System.out.println(numbers[i]);
				} else {
					System.out.println("NEW LINE");
				}
			}
		}
		
	}
	
	
}
