class MyClass {
	
	private int denominator;
	private int numerator;
	
	public int getDenoNumerator1(int deno, int numer) {
		setDenominator(deno);
		setNumerator(numer);
		
		return getNumerator() + getDenominator();
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
}

public class solveFractionProblem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
