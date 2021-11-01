public class Calculations {
	
	int[] sequenceCountArr = new int[25];
	
	int[] sequence = new int[25];
	
	int[] longestSeq = new int[25];
	
	public void calculate(int[] numbers, int count, int pos, int prevSeqLength) {
		
//		int pos = 0;
		int seqCount = 0;
		
		for (int i = pos; i<count; i++) {
			if (i < 24) {
				if (numbers[i] < numbers[i+1]) {
					System.out.println(numbers[i] + " seq: " + seqCount);
					sequence[seqCount] = numbers[i];
					seqCount++;
				} else {
					System.out.println(numbers[i] + " seq: " + seqCount);
					sequence[seqCount] = numbers[i];
					seqCount++;
					System.out.println("nope! " + numbers[i+1] + " is not greater than " + numbers[i]);
					calculate(numbers, (count - seqCount), pos, seqCount);
					break;
				}
			} else {
				if (numbers[i-1] < numbers[i]) {
					System.out.println(numbers[i] + " seq: " + seqCount);
					sequence[seqCount] = numbers[i];
					seqCount++;
				} else {
					System.out.println(numbers[i-1] + "seq" + seqCount);
//					sequence[seqCount] = numbers[i-1];
//					seqCount++;
					System.out.println("nope! " + numbers[i] + " is not greater than " + numbers[i-1]);
				}
			}
			
		}
		
		System.out.println("RECENT SEQUENCE-----");
		for (int k=0; k < seqCount; k++) {
			System.out.println(sequence[k]);
		}
		
		System.out.println("LONGEST SEQUENCE-----");
		
		if (prevSeqLength < seqCount) {
			
			for (int j=0; j < seqCount; j++) {
				longestSeq[j] = sequence[j];
				System.out.println(longestSeq[j]);
			}
			
		} else {
			
			System.out.println("current seq is longest seq");
			
		}
		
		
		
	}
	
	
}
