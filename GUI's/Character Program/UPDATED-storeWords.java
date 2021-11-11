public int storeWords(String text) {
		
		String word = "";
		int wordCount = 0;
		
		if (text.trim() != "") {
			char[] CharArr = new char[text.length()];
			
			wordsArr = new String[text.length()];
			
			for (int i=0; i<text.length(); i++) {
				CharArr[i] = Character.toLowerCase(text.charAt(i));
			}
			
			
			
			int start = 0;
			int end = 0;
			
			for (int o=0; o<CharArr.length; o++) {
				
				if (word.length() == 0) {
					start = o;
					word = text.substring(start);
				} else if (CharArr[o] == ' ') {
					end = o;					
					word = text.substring(start, end);
					
					if (!Character.isDigit(CharArr[end-1]) && !Character.isLetter(CharArr[end-1])) {
						word = text.substring(start, end-1);
					}
					
					System.out.println("WORD: " + word);
					
					wordsArr[wordCount] = word;
					wordCount++;
					word = "";
				}
				
			}
			
			
		}
		
		return wordCount;
	}
