
public class List {
	
	String empName;
	double q1Sales;
	double q2Sales;
	double q3Sales;
	double q4Sales;
	double totalSales;
	
	List(String name, double q1, double q2, double q3, double q4, double total) {
		
		empName = name;
		q1Sales = q1;
		q2Sales = q2;
		q3Sales = q3;
		q4Sales = q4;
		totalSales = q1 + q2 + q3 + q4;
		
	}
	
}

class Checks {
	
	private double highestTotalSalesNum;
	private int highestTotalSalesIndex;
	
	private double lowestTotalSalesNum;
	private int lowestTotalSalesIndex;
	
	public void setSales(List[] employees, int count) {
		
		for(int i = 0; i < count; i++){
			if (employees[i].totalSales >= highestTotalSalesNum) {
				highestTotalSalesNum = employees[i].totalSales;
				highestTotalSalesIndex =  i;
			} else if (employees[i].totalSales <= lowestTotalSalesNum) {
				lowestTotalSalesNum = employees[i].totalSales;
				lowestTotalSalesIndex =  i;
			}
		}
		
		System.out.println("Highest Total Sales: " + highestTotalSalesNum + ", by: " + employees[highestTotalSalesIndex].empName);
		System.out.println("Lowest Total Sales: " + lowestTotalSalesNum + ", by: " + employees[lowestTotalSalesIndex].empName);

		
//		return highestTotalSalesIndex;
//		return highestTotalSalesNum;
		
	}
	
	
	public double getHighest() {
		return highestTotalSalesNum;
	}
	
	public double getLowest() {
		return lowestTotalSalesNum;
	}
	
}

// https://www.infoworld.com/article/2076301/learn-how-to-store-data-in-objects.html
