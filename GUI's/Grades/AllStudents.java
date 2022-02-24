public class AllStudents {

	Student studentInfo[];
		
	
	public String printSorted(Student stu[], int cnt) {
		String result = "Please enter a student.";
		
		if (cnt > 0) {
			studentInfo = stu;			
						
			Student nArr[] = sortNames(stu, cnt);
			Student fArr[] = sortFinalAvgs(stu, cnt);
			
			result = "# | SORTED GRADES | SORTED NAMES" + "\n\n";
			
			for (int i=0; i<cnt; i++) {
				result += (i+1) + ") " + fArr[i].getName() + " - " + fArr[i].getFinal() + "  |  " + nArr[i].getName() + " - " + nArr[i].getFinal() + '\n'; 
			}
			
			return result;
			
		}
		
		return result;
	}
	
	
	
	public Student[] sortFinalAvgs(Student arr[], int cnt){
		int n = cnt;
	 
	    // One by one move boundary of unsorted subarray
	    for (int i = 0; i < n-1; i++) {
	    	// Find the minimum element in unsorted array
	        int min_idx = i;
	        for (int j = i+1; j < n; j++){
	        	if (arr[j].getFinal() < arr[min_idx].getFinal())
	        		min_idx = j;
	        }
	        // Swap the found minimum element with the first element
	        Student temp = arr[min_idx];
	        arr[min_idx] = arr[i];
	        arr[i] = temp;
	    }
	    
	    return reverseArr(arr, cnt);
	}
	
	
	
	public Student[] sortNames(Student arr[], int cnt) {
		int n = cnt;
		
		// One by one move boundary of unsorted subarray
	    for (int i = 0; i < n-1; i++) {
	    	// Find the minimum element in unsorted array
	        int min_idx = i;
	        for (int j = i+1; j < n; j++){
	        	if (arr[j].getName().compareTo(arr[min_idx].getName()) < 0)
	        		min_idx = j;
	        }
	        // Swap the found minimum element with the first element
	        Student temp = arr[min_idx];
	        arr[min_idx] = arr[i];
	        arr[i] = temp;
	    }
	    
	    return transferArr(arr, cnt);
	}
	
	
	
	public static Student[] reverseArr(Student sl[], int cnt) {
		Student[] newArr = new Student[cnt];
        int j = cnt;
        for (int i=0; i<cnt; i++) {
            newArr[j - 1] = sl[i];
            j--;
        }
        
        return newArr;
	}
	
	
	public Student[] transferArr(Student sl[], int cnt) {
		Student[] newArr = new Student[cnt];
		
		for (int i=0; i<cnt; i++) {
			newArr[i] = sl[i];
		}
		
		return newArr;
	}
	
	
}
