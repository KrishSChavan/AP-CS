public class Checker {
	
	// initializes box size variable and array for this class
	
	private int boxSize;
	private int checkerArray[][];
	
	public Checker() {
		boxSize = 0;
	}
	
	// sets the magic square size
	public void setMsSize(int msSize) {
		boxSize = msSize;
	}
	
	// sets checkerArray from main class
	public void msAClass(int[][] msArrayClass) {
		checkerArray = msArrayClass;
	}

	
	// checks to see if it is a valid magic square
	
	public String getSquare() {
		int finalSum = 0;
		boolean isEqual = true;
		
		// checks the rows
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
			
		
		// checks the columns
			for(int j = 0; j<boxSize; j++) {
				
				sum = 0;
				
				for(int i = 0; i<boxSize;i++) {
					sum = sum + checkerArray [i][j];
				}	
				if(finalSum != sum) {
					isEqual = false;
				}
				
			}

		// checks the diagonals
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
			result = ("IS a magic square!");
		}else {
			result = ("NOT a magic sqaure.");
		}
		return result;
		
	}
	
	
}
