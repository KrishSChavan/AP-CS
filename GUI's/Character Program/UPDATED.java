public class Counts {
	
	String[] wordsArr;
	
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
		
	
	
	public int storeWords(String text) {
		
		String word = "";
		int wordCount = 0;
		
		if (text.trim() != "") {
			char[] CharArr = new char[text.length()];
			
			wordsArr = new String[text.length()];
			
			for (int i=0; i<text.length(); i++) {
				CharArr[i] = Character.toLowerCase(text.charAt(i));
			}
			
			for (int o=0; o<CharArr.length; o++) {
				if (Character.isDigit(text.charAt(o)) || Character.isLetter(text.charAt(o))) {
					if (word.length() == 0) {
						word += Character.toUpperCase(CharArr[o]);
					} else {
						word += Character.toLowerCase(CharArr[o]);
					}
//					System.out.print(CharArr[o]);
				} else {
					if (word.trim() != "") {
						wordsArr[wordCount] = word;
						wordCount++;
						word = "";
//						System.out.println();
					}
				}
			}
			
			
		}
		
		return wordCount;
	}



	public void printWords(int wordCount) {
		System.out.println(wordCount + " words found:" + '\n');
		
		
		for (int n=0; n<wordCount; n++) {
			
			int specWordCount = 0;
			
			for (int i=0; i<wordCount; i++) {
				if (wordsArr[n].equalsIgnoreCase(wordsArr[i])) {
					specWordCount++;
				}
			}
			if (wordsArr[n] != "") {
				System.out.println(wordsArr[n] + " - " + specWordCount);
			}
		}
	}
	

	
}




// add this to line 25 in gui        counts.printWords(counts.storeWords(textField.getText() + " "));
