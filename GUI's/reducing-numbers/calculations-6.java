public class Calculations {
	
	int[] sequence = new int[25];
	
	int[] seqStart = new int[25];
	int [] seqEnd = new int[25];
	
	
	int lengthOfSeq = 0;
	
	public void calculate(int[] numbers, int count, int pos) {
		
//		int pos = 0;
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
		
		
//		int lengthOfSeq = 0;
		System.out.println("-------");
		for(int i = 0; i < count; i++) {
            if (i == 0) {
            	System.out.println(sequence[i]);
            	lengthOfSeq++;
            } else {
            	if (sequence[i - 1] > sequence[i]) {
            		break;
                } else {
                	System.out.println(sequence[i]);
                	lengthOfSeq++;
                }
            }
        }
		System.out.println("pos: " + pos);

		if (lengthOfSeq < count && pos < 24) {
			calculate(numbers, count, lengthOfSeq);
		}
		
	}
	
	
}
