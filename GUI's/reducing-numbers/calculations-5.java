
public class Calculations {
	
	int[] sequence = new int[25];
	
	int[] seqStart = new int[25];
	int [] seqEnd = new int[25];
	
	public void calculate(int[] numbers, int count) {
		
		int pos = 0;
		int seqCount = 0;
		
		for(int i = pos; i < count; i++) {
			if (i < 24) {
				if (numbers[i] < numbers[i+1]) {
	            	sequence[i] = numbers[i];
	            	sequence[i+1] = numbers[i+1];
	            }else {
	                break;
	            }
	            pos = i+1;
			} else {
				if (numbers[i-1] < numbers[i]) {
	            	sequence[i-1] = numbers[i-1];
	            	sequence[i] = numbers[i];
	            }else {
	                break;
	            }
	            pos = i+1;
			}
        }
		
		
		for(int i = 0; i < count; i++) {
            System.out.println(sequence[i]);
        }
		
		
	}
	
	
}
