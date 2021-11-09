public void getWords(String text) {
		
		if (text.trim() != "") {
			char[] CharArr = new char[text.length()];
			
			String[] wordsArr = new String[text.length()];
			
			for (int i=0; i<text.length(); i++) {
				CharArr[i] = Character.toLowerCase(text.charAt(i));
			}
			
			String word = "";
			int wordCount = 0;
			
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
