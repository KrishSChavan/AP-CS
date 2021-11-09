public class Counts {
	
	public void getSpaces(String text) {
		
		int spaces = 0;
		
		for (int k=0; k < text.length(); k++) {
			if (text.charAt(k) == ' ') {
				spaces++;
			}
		}
		if (spaces != 0) {
			System.out.println("Characters WITHOUT spaces: " + (text.length() - spaces));
			System.out.println("Characters WITH spaces: " + text.length());
			System.out.println("Total Spaces: " + spaces + '\n');
		} else {
			System.out.println("Characters: " + text.length());
			System.out.println("No Spaces Found" + '\n');
		}
		
	}
		
	
	
	public void getWords(String text) {
		
		if (text.trim() != "") {
			char[] CharArr = new char[text.length()];
			
			String[] wordsArr = new String[text.length()];
			
			for (int i=0; i<text.length(); i++) {
				CharArr[i] = text.charAt(i);
			}
			
			String word = "";
			int wordCount = 0;
			
			for (int o=0; o<CharArr.length; o++) {
				if (Character.isDigit(text.charAt(o)) || Character.isLetter(text.charAt(o))) {
					word += CharArr[o];
					System.out.print(CharArr[o]);
				} else {
					if (word.trim() != "") {
						wordsArr[wordCount] = word;
						wordCount++;
						word = "";
						System.out.println();
					}
				}
			}
			
			
			System.out.println('\n' + wordCount + " words found" + '\n');
			
			
			for (int n=0; n<wordCount; n++) {
				System.out.println("Word " + n + ": " + wordsArr[n]);
			}
		}
		
	}
	
	

	
}
