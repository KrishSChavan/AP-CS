public class Counts {
	
	public void enter(String text) {
		
		char[] CharArray = new char[text.length()];
		
		int spaces = 0;
		
		for (int k=0; k < text.length(); k++) {
			if (text.charAt(k) == ' ') {
				spaces++;
			}
		}
		System.out.println("The text you entered has " + (text.length() - spaces) + " ");
		System.out.println("Has, " + spaces + " spaces");
		
	}
		
}
