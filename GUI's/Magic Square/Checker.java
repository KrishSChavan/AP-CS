

public class Checker {
	
	private int boxSize;
	private int checkerArray[][];
	
	public Checker() {
		boxSize = 0;
	}
	
	public void setMsSize(int msSize) {
		boxSize = msSize;
	}
	
	public void msAClass(int[][] msArrayClass) {
		checkerArray = msArrayClass;
	}

	public String getSquare() {
		int finalSum = 0;
		boolean isEqual = true;
		
		//rows
		for(int j=0; j<boxSize; j++) {
			finalSum = finalSum + checkerArray[0][j];
		}
			
		while(isEqual == true){
			int sum = 0;
			for(int i = 1; i<boxSize; i++) {
				sum = 0;
				for(int j = 0; j<boxSize; j++) {
					sum = sum + checkerArray[i][j];
				}
				if(finalSum != sum) {
					isEqual = false;
				}
			}
			
		
		//columns
			for(int j = 0; j<boxSize; j++) {
				
				sum = 0;
				
				for(int i = 0; i<boxSize;i++) {
					sum = sum + checkerArray [i][j];
				}	
				if(finalSum != sum) {
					isEqual = false;
				}
				
			}

		//diagonals
			sum = 0;
			for(int d = 0; d<boxSize; d++) {
				sum = sum + checkerArray [d][d];
			}
			if(finalSum != sum) {
				isEqual = false;
			}
			

			sum = 0;
			int hold = 0;
			for(int d = boxSize-1; d>=0; d--) {
				sum = sum + checkerArray [hold][d];
				hold++;
			}
			if(finalSum != sum) {
				isEqual = false;
			}
			
			break;
		}
		String result = "";
		if (isEqual == true) {
			result = ("It is indeed a magic square");
		}else {
			result = ("Sadly, this is not a magic square");
		}
		return result;
		
	}
	
	
}
