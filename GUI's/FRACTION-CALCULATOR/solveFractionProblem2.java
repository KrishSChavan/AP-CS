
class MyClass {
	
	private int denominator1;
	private int numerator1;

	private int denominator2;
	private int numerator2;
	
	private int denominatorProduct;
	private int numeratorProduct;
	
	private int finalDenominator;
	private int finalNumerator;
	
	private int gcf;
	
	public void GCF() {
		
		numeratorProduct = getNumerator1() * getNumerator2();
		denominatorProduct = getDenominator1() * getDenominator2();
		
		if (numeratorProduct > denominatorProduct) {
			gcf = numeratorProduct;
		} else {
			gcf = denominatorProduct;
		}
		
		boolean found = false;
		
		while(!found) {
			if (numeratorProduct % gcf == 0 && denominatorProduct % gcf == 0) {
				found = true;
			} else {
				gcf--;
			}
		}
		
		setFinalDenoNumer(finalNumerator, finalDenominator);
	}

	
	public int setFinalDenoNumer(numer, deno) {
		this.
	}
	
	
	public void setDenominators(int denominator1, int denominator2) {
		this.denominator1 = denominator1;
		this.denominator2 = denominator2;
	}
	public void setNumerators(int numerator1, int numerator2) {
		this.numerator1 = numerator1;
		this.numerator2 = numerator2;
	}

	public int getNumerator1() {
		return numerator1;
	}
	public int getDenominator1() {
		return denominator1;
	}
	public int getNumerator2() {
		return numerator2;
	}
	public int getDenominator2() {
		return denominator2;
	}
	
}

public class solveFractionProblem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
