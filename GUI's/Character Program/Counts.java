public class Counts {
	
	String[] wordsArr;
	int[] wordCountArr;
	
	String[] finalOutput;
	
	public String getSpaces(String text) {
		
		int spaces = 0;
		String outputStr = "";
		
		for (int k=0; k < text.length(); k++) {
			if (text.charAt(k) == ' ') {
				spaces++;
			}
		}
		if (spaces != 0) {
			System.out.println("Characters WITHOUT spaces: " + (text.length() - spaces));
			System.out.println("Characters WITH spaces: " + text.length());
			System.out.println("Total Spaces: " + spaces + '\n');
			outputStr = "Characters WITHOUT spaces: " + (text.length() - spaces) + '\n' + "Characters WITH spaces: " + text.length() + '\n' + "Total Spaces: " + spaces + '\n';
		} else {
			System.out.println("Characters: " + text.length());
			System.out.println("No Spaces Found" + '\n');
			outputStr = "Characters: " + text.length() + '\n' + "No Spaces Found" + '\n';
		}
		
		return outputStr;
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
					
					if (word.length() == 1 && word.trim() != "") {
						wordsArr[wordCount] = word;
						wordCount++;
						word = "";
					} else if (!Character.isDigit(CharArr[end-1]) && !Character.isLetter(CharArr[end-1])) {
						
						if (CharArr[end-1] == '\'') {
							word = text.substring(start, end);
						} else {
							word = text.substring(start, end-1);
						}
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
						if (!wordIsThere && word.trim() != "") {
							wordsArr[wordCount] = word;
							wordCount++;
							word = "";
						}
						
					} else {
						if (word.trim() != "") {
							wordsArr[wordCount] = word;
							wordCount++;
							word = "";
						}
					}
					
				} 
				
			}
			
			
		}
		
		return wordCount;
	}



	public String[] printWords(int wordCount) {
		System.out.println(wordCount + " words found:" + '\n');
		
		finalOutput = new String[wordCount];
		
		for (int n=0; n<wordCount; n++) {
			
			int specWordCount = 0;
			
			for (int i=0; i<wordCount; i++) {
				if (wordsArr[n].equalsIgnoreCase(wordsArr[i]) && wordsArr[n].trim() != "") {
					wordCountArr[n] = wordCountArr[n] + (specWordCount+1);
				}
			}
			if (wordsArr[n].trim() != "") {
				
				String newWord = wordsArr[n].trim();
				
				System.out.println(newWord.substring(0,1).toUpperCase() + newWord.substring(1,newWord.length()).toLowerCase() + " - " + wordCountArr[n]);
				
				finalOutput[n] = newWord.substring(0,1).toUpperCase() + newWord.substring(1,newWord.length()).toLowerCase() + " - " + wordCountArr[n];
			}
		}
		
		return finalOutput;
	}
	

	
}



// My words have many words in them

// hello there there .
