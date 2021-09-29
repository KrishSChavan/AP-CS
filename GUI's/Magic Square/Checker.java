

public class Checker {
	
	private int Size;
	private int msArray[][];
	
	public Checker() {
		Size = 0;
	}
	
	public void setMsSize(int MsSize) {
		Size = MsSize;
	}
	
	public void msAClass(int[][] MsArrayClass) {
		msArray = MsArrayClass;
	}

	public String getMS() {
		int FinalSum = 0;
		boolean Equal = true;
		
		//rows
		for(int c=0; c<Size; c++) {
			FinalSum = FinalSum + msArray[0][c];
		}
			
		while(Equal == true){
			int Sum = 0;
			for(int r = 1; r<Size; r++) {
				Sum = 0;
				for(int c = 0; c<Size; c++) {
					Sum = Sum + msArray[r][c];
				}
				if(FinalSum != Sum) {
					Equal = false;
				}
			}
			
		
		//columns
			for(int c = 0; c<Size; c++) {
				
				Sum = 0;
				
				for(int r = 0; r<Size;r++) {
					Sum = Sum + msArray [r][c];
				}	
				if(FinalSum != Sum) {
					Equal = false;
				}
				
			}

		//diagonals
			Sum = 0;
			for(int d = 0; d<Size; d++) {
				Sum = Sum + msArray [d][d];
			}
			if(FinalSum != Sum) {
				Equal = false;
			}
			

			Sum = 0;
			int hold = 0;
			for(int d = Size-1; d>=0; d--) {
				Sum = Sum + msArray [hold][d];
				hold++;
			}
			if(FinalSum != Sum) {
				Equal = false;
			}
			
			break;
		}
		String result = "";
		if (Equal == true) {
			result = ("It is indeed a magic square");
		}else {
			result = ("Sadly, this is not a magic square");
		}
		return result;
		
	}
	
	
}
