class MyClass {
	
	// Initializing variables
	
	private int denominator1;
	private int numerator1;

	private int denominator2;
	private int numerator2;
	
	private int denominatorProduct;
	private int numeratorProduct;
	
	public int finalDenominator;
	public int finalNumerator;
	
	private int gcf;
	
	// Gets the GCF and then calls a simplify function
	
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
		
		simplify();
	}

	
	// simplifies the function if it needs to
	
	public void simplify() {
		
		if (numeratorProduct != denominatorProduct) {
			if (numeratorProduct % gcf == 0 && denominatorProduct % gcf == 0) {
				setFinalNumerDeno(numeratorProduct/gcf, denominatorProduct/gcf);
			} else {
				setFinalNumerDeno(numeratorProduct, denominatorProduct);
			}
		}
	}
	
	// sets final numerator and denominator
	
	public void setFinalNumerDeno(int numerator, int denominator) {
			this.finalNumerator = numerator;
			this.finalDenominator = denominator;
	}
	
	// sets denominator
	public void setDenominators(int denominator1, int denominator2) {
		this.denominator1 = denominator1;
		this.denominator2 = denominator2;
	}
	// sets numerator
	public void setNumerators(int numerator1, int numerator2) {
		this.numerator1 = numerator1;
		this.numerator2 = numerator2;
	}
	// sets the product of the two numerators
	public String setNumeratorProduct(int numer) {
		this.numeratorProduct = numer;
		
		return "done";
	}
	
	// sets the product of the two denominators
	public String setDenominatorProduct(int deno) {
		this.denominatorProduct = deno;
		
		return "done";
	}

	
	// all the getters for the 4 numerators and denominators
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
