
public class List {

	double q1Sales;
	double q2Sales;
	double q3Sales;
	double q4Sales;
	
	List(double q1, double q2, double q3, double q4) {
		
		q1Sales = q1;
		q2Sales = q2;
		q3Sales = q3;
		q4Sales = q4;
		
	}
	
}



class Test {
	
	public List getQs(double q1, double q2, double q3, double q4) {
		
		return new List(q1, q2, q3, q4);
		
	}
	


	//Driver code
	public static void main(String[] args) {
//		List ans = getQs(10.0, 20.0, 30.0, 40.0);
//		System.out.println("q1 = " + ans.q1Sales);
//		System.out.println("q2 = " + ans.q2Sales);
//		System.out.println("q3 = " + ans.q3Sales);
//		System.out.println("q4 = " + ans.q4Sales);
	}
	
}

// https://www.infoworld.com/article/2076301/learn-how-to-store-data-in-objects.html
