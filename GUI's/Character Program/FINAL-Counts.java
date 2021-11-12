public class Counts {
	
	String[] wordsArr;
	int[] wordCountArr;
	
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
		
		int wordCount = 0;
		
		if (text.trim() != "") {
			char[] CharArr = new char[text.length()];
			
			wordsArr = new String[text.length()];
			wordCountArr = new int[text.length()];
			
			for (int i=0; i<text.length(); i++) {
				CharArr[i] = Character.toLowerCase(text.charAt(i));
			}
			
			
			
			int start = 0;
			int end = 0;
			String word = "";
			
			for (int o=0; o<CharArr.length; o++) {
				
				if (word.length() == 0) {
					start = o;
					word = text.substring(start);
				} else if (CharArr[o] == ' ') {
					end = o;				
					word = text.substring(start, end);
					
					if (word.length() == 1) {
						wordsArr[wordCount] = word;
						wordCount++;
						word = "";
					} else if (!Character.isDigit(CharArr[end-1]) && !Character.isLetter(CharArr[end-1])) {
						word = text.substring(start, end-1);
					}
					
					System.out.println("WORD: " + word);
					
					if (wordCount > 0) {
						
						boolean wordIsThere = false;
						
						for (int i=0; i<wordCount; i++) {
							if (word.equalsIgnoreCase(wordsArr[i])) {
//								System.out.println("FOUND IT");
								wordIsThere = true;
								wordCountArr[i] = wordCountArr[i] + 1;
								word = "";
							} else {
//								System.out.println("still looking..");
							}
						}
						if (!wordIsThere) {
							wordsArr[wordCount] = word;
							wordCount++;
							word = "";
						}
						
					} else {
						wordsArr[wordCount] = word;
						wordCount++;
						word = "";
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
					wordCountArr[n] = wordCountArr[n] + (specWordCount+1);
				}
			}
			if (wordsArr[n] != "") {
				System.out.println(wordsArr[n].trim() + " - " + wordCountArr[n]);
			}
		}
	}
	

	
}



// My words have many words in them
