package sorting;

public class Student {

	private String name = "";
	private double testAvg = 0;
	private double quizAvg = 0;
	private double hwAvg = 0;
	private double finalAvg = 0;
	
	public Student(String n, double tA, double qA, double hA, double fA) {
		name = n;
		testAvg = tA;
		quizAvg = qA;
		hwAvg = hA;
		finalAvg = fA;
	}
	
	
//	Setters
	
	public void setTA(double a) {
		testAvg = a;
	}
	
	public void setQA(double a) {
		quizAvg = a;
	}

	public void setHA(double a) {
		hwAvg = a;
	}

	public void setFA(double a) {
		finalAvg = a;
	}
	
	
	
//	Getters
	
	public String getName() {
		return name;
	}
	
	public String getStu() {
		return name + " " + hwAvg + " " + quizAvg + " " + testAvg + " " + finalAvg;
	}
	
}
