
public class List {
	
	String empName;
	double q1Sales;
	double q2Sales;
	double q3Sales;
	double q4Sales;
	double totalSales;
	double highestQFinal;
	double lowestQFinal;
	
	List(String name, double q1, double q2, double q3, double q4, double total, double highestQ, double lowestQ) {
		
		
		empName = name;
		q1Sales = q1;
		q2Sales = q2;
		q3Sales = q3;
		q4Sales = q4;
		totalSales = q1 + q2 + q3 + q4;
		highestQFinal = getHighestQ(q1, q2, q3, q4) + highestQ;
		lowestQFinal = getLowestQ(q1, q2, q3, q4) + lowestQ;
		
	}
	
	
	
	public double getHighestQ(double q1, double q2, double q3, double q4) {
		
		double higherOf1and2;
		double higherOf3and4;
		
		double highestSaleQOfAll;
		
		
		if (Math.max(q1, q2) == q1) {
			higherOf1and2 = q1;
		} else {
			higherOf1and2 = q2;
		}			
		if (Math.max(q3, q4) == q3) {
			higherOf3and4 = q3;
		} else {
			higherOf3and4 = q4;
		}
		if (Math.max(higherOf1and2, higherOf3and4) == higherOf1and2) {
			highestSaleQOfAll = higherOf1and2;
		} else {
			highestSaleQOfAll = higherOf3and4;
		}
		
		return highestSaleQOfAll;
	}
	
	public double getLowestQ(double q1, double q2, double q3, double q4) {
		
		double lowerOf1and2;
		double lowerOf3and4;

		double lowestSaleQOfAll;
		
		
		if (Math.min(q1, q2) == q1) {
			lowerOf1and2 = q1;
		} else {
			lowerOf1and2 = q2;
		}			
		if (Math.min(q3, q4) == q3) {
			lowerOf3and4 = q3;
		} else {
			lowerOf3and4 = q4;
		}
		if (Math.min(lowerOf1and2, lowerOf3and4) == lowerOf1and2) {
			lowestSaleQOfAll = lowerOf1and2;
		} else {
			lowestSaleQOfAll = lowerOf3and4;
		}
		
		return lowestSaleQOfAll;
	}
	
	
}

class Checks {
	
	private double highestTotalSalesNum;
	private int highestTotalSalesIndex;
	
	private double lowestTotalSalesNum;
	private int lowestTotalSalesIndex;
	
	
	public void setSales(List[] employees, int count) {
		
		for(int i = 0; i < count; i++){
			
			highestTotalSalesNum = employees[0].totalSales;
			lowestTotalSalesNum = employees[0].totalSales;
			
			if (employees[i].totalSales >= highestTotalSalesNum) {
				highestTotalSalesNum = employees[i].totalSales;
				highestTotalSalesIndex =  i;
			} else if (employees[i].totalSales <= lowestTotalSalesNum) {
				lowestTotalSalesNum = employees[i].totalSales;
				lowestTotalSalesIndex =  i;
			}
			
		}
		
//		System.out.println("Highest Total Sales: " + highestTotalSalesNum + ", by: " + employees[highestTotalSalesIndex].empName);
//		System.out.println("Lowest Total Sales: " + lowestTotalSalesNum + ", by: " + employees[lowestTotalSalesIndex].empName);

		
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
