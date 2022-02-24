import java.util.ArrayList;

public class AllStudents {

	Student studentInfo[];
		
	
	public String printSorted(Student stu[], int cnt) {
		String result = "Please enter a student.";
		
		if (cnt > 0) {
			studentInfo = stu;
			
			String names[] = new String[cnt];
			double finalAvgs[] = new double[cnt];
			
//			for (int i=0; i<cnt; i++) {
//				names.add(studentInfo[i].getName());
//				finalAvgs.add(studentInfo[i].getFinal());
//			}
			
			
			String nArr[] = sortNames(names);
			int fArr[] = sortFinalAvgs(finalAvgs);
			
			result = "# | ALPHABETICAL | NUMERICAL" + "\n\n";
			
			for (int i=0; i<nArr.length; i++) {
				result += (i+1) + ") " + nArr[i] + " - " + getFAvg(nArr[i], cnt) + "  |  " + fArr[i] + " - " +; 
			}
			
		}
		
		return result;
	}
	
	public static String[] sortNames(ArrayList<String> names) {
		
		String[] array = new String[names.size()];
		
		for (int i=0; i<names.size(); i++) {
			array[i] = names.get(i);
		}
	    
	    // Find the string reference that should go in each cell of
	    // the array, from cell 0 to the end
	    for ( int j=0; j < array.length-1; j++ ) {
	    	// Find min: the index of the string reference that should go into cell j.
	    	// Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
	    	int min = j;
	    	for ( int k=j+1; k < array.length; k++ )
	    		if ( array[k].compareTo( array[min] ) < 0 ) min = k;  

	    	// Swap the reference at j with the reference at min 
	    	String temp = array[j];
	    	array[j] = array[min];
	    	array[min] = temp;
	    }
	  
	    return array;
	    
	}
	
	
	
	
	public static int[] sortFinalAvgs(ArrayList<Double> finalAvgs) {  
		
		int[] array = new int[finalAvgs.size()];
		
		for (int i=0; i<finalAvgs.size(); i++) {			
			array[i] = (int) Math.round(finalAvgs.get(i));
		}
		
		
	    // Find the integer that should go in each cell of
	    // the array, from cell 0 to the end
	    for ( int j=0; j < array.length-1; j++ ) {
	    	// Find min: the index of the integer that should go into cell j.
	    	// Look through the unsorted integers (those at j or higher)
	    	int min = j;
	    	for ( int k=j+1; k < array.length; k++ )
	    		if ( array[k] < array[min] ) min = k;  

	    	// Swap the int at j with the int at min 
	    	int temp = array[j];
	    	array[j] = array[min];
	    	array[min] = temp;
	    }
	    
	    return reverseArr(array);
	  
	}
	
	
	
	public static int[] reverseArr(int arr[]) {
		int[] newArr = new int[arr.length];
        int j = arr.length;
        for (int i=0; i<arr.length; i++) {
            newArr[j - 1] = arr[i];
            j--;
        }
        
        return newArr;
	}
	
	
	public int getFAvg(String name, int count) {
		
		int grade = 0;
		
		for (int i=0; i<count; i++) {
			if (studentInfo[i].getName() == name) {
				grade = (int) Math.round(studentInfo[i].getFinal());
			}
		}
		
		return grade;
		
	}
	
	
}
